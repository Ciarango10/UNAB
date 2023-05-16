const url = 'http://localhost:8082/api/productos';
const cuerpoTabla = document.querySelector('tbody');
let resultados = '';

const modalProductos = new bootstrap.Modal(document.getElementById('modalProductos'))
const formulario = document.querySelector('form')
let opcion = ''

//mostrar todos los registros de la tabla productos
const urlListadoProductos = `${url}/todos`;
fetch(urlListadoProductos)
    .then(response => response.json())
    .then(data => mostrarRegistros(data))
    .catch(error => console.log(error))

const mostrarRegistros = (arreglo) => {
    arreglo.forEach(elemento => {
        if (elemento.idCategoria.nombreCategoria == null) {
            const urlUnaCategoria = `http://localhost:8082/api/categorias/uno/${elemento.idCategoria.idCategoria}`
            fetch(urlUnaCategoria)
                .then(response => response.json())
                .then((data) => {
                    resultados += `<tr>
                                <td class="text-center">${elemento.idProducto}</td>
                                <td class="text-center">${data.nombreCategoria}</td>
                                <td>${elemento.nombreProducto}</td>
                                <td class="text-center">${elemento.referenciaProducto}</td>
                                <td class="text-end">${elemento.precioCostoProducto}</td>
                                <td class="text-end">${elemento.precioVentaProducto}</td>
                                <td class="text-center">${elemento.cantidadProducto}</td>
                                <td class="text-center">
                                    <a class="btnEditar btn btn-primary btn-sm">Editar</a>
                                    <a class="btnBorrar btn btn-danger btn-sm">Borrar</a>
                                </td>
                            </tr>`
                    cuerpoTabla.innerHTML = resultados;
                })
        } else {
            resultados += `<tr>
                                <td class="text-center">${elemento.idProducto}</td>
                                <td class="text-center">${elemento.idCategoria.nombreCategoria}</td>
                                <td>${elemento.nombreProducto}</td>
                                <td class="text-center">${elemento.referenciaProducto}</td>
                                <td class="text-end">${elemento.precioCostoProducto}</td>
                                <td class="text-end">${elemento.precioVentaProducto}</td>
                                <td class="text-center">${elemento.cantidadProducto}</td>
                                <td class="text-center">
                                    <a class="btnEditar btn btn-primary btn-sm">Editar</a>
                                    <a class="btnBorrar btn btn-danger btn-sm">Borrar</a>
                                </td>
                            </tr>`
            cuerpoTabla.innerHTML = resultados;
        }
    });
}

//escuchador de eventos
const on = (element, event, selector, handler) => {
    element.addEventListener(event, e => {
        if (e.target.closest(selector)) {
            handler(e)
        }
    })
}

//proceso para eliminar
on(document, 'click', '.btnBorrar', e => {
    const fila = e.target.parentNode.parentNode
    const idProducto = fila.firstElementChild.innerHTML

    alertify.confirm("¿Desea eliminar el registro?.",
        function () {
            const urlBorrar = `${url}/borrar/${idProducto}`
            fetch(urlBorrar, {
                method: 'DELETE'
            })
                .then(response => response.json())
                .then(() => location.reload())
            alertify.success('Ok');
        },
        function () {
            alertify.error('Error no fue eliminado el registro.');
        });
})

//crea el combo de las categorias
const comboCategorias = (idExistenteCategoria) => {
    const urlListadoCategorias = `http://localhost:8082/api/categorias/todas`
    fetch(urlListadoCategorias)
        .then(response => response.json())
        .then(data => cargarOpcionesCombo(data, idExistenteCategoria))
        .catch(error => console.log(error))
}

const cargarOpcionesCombo = (arreglo, idExistenteCategoria) => {
    const cuerpoCombo = document.getElementById('idcategoria')
    let resultadoCombo = ''
    arreglo.forEach(elemento => {
        if (idExistenteCategoria == undefined) {
            resultadoCombo += `<option value="${elemento.idCategoria}">${elemento.nombreCategoria}</option>`
        } else {
            if (elemento.idCategoria == idExistenteCategoria) {
                resultadoCombo += `<option value="${elemento.idCategoria}" selected>${elemento.nombreCategoria}</option>`
            } else {
                resultadoCombo += `<option value="${elemento.idCategoria}">${elemento.nombreCategoria}</option>`
            }
        }

    })
    cuerpoCombo.innerHTML = resultadoCombo
}

//capturar datos del formulario
const comboIdCategoria = document.getElementById('idcategoria')
const cajaNombreProducto = document.getElementById('nombre')
const cajaReferenciaProducto = document.getElementById('referencia')
const cajaPrecioCostoProducto = document.getElementById('preciocosto')
const cajaPrecioVentaProducto = document.getElementById('precioventa')
const cajaCantidadProducto = document.getElementById('cantidad')

//proceso para la creacion del producto
btnCrear.addEventListener('click', () => {
    cajaNombreProducto.value = ''
    cajaReferenciaProducto.value = ''
    cajaPrecioCostoProducto.value = ''
    cajaPrecioVentaProducto.value = ''
    cajaCantidadProducto.value = ''

    modalProductos.show()
    opcion = 'crear'
    comboCategorias()
})

//proceso para preparar el editar
let idProductoEditar = 0
on(document, 'click', '.btnEditar', e => {
    const fila = e.target.parentNode.parentNode
    idProductoEditar = fila.firstElementChild.innerHTML

    const urlUno = `${url}/uno/${idProductoEditar}`
    fetch(urlUno)
        .then(response => response.json())
        .then(data => mostrarDatos(data))
        .catch(error => console.log(error))
})

const mostrarDatos = (data) => {
    comboCategorias(data.idCategoria.idCategoria)
    cajaNombreProducto.value = data.nombreProducto
    cajaReferenciaProducto.value = data.referenciaProducto
    cajaPrecioCostoProducto.value = data.precioCostoProducto
    cajaPrecioVentaProducto.value = data.precioVentaProducto
    cajaCantidadProducto.value = data.cantidadProducto
    opcion = 'editar'
    modalProductos.show()
}

//proceso para crear o editar
formulario.addEventListener('submit', (e) => {
    e.preventDefault()

    if (opcion == 'crear') {
        const urlCrear = `${url}/crear`
        fetch(urlCrear, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                idCategoria: {
                    idCategoria: comboIdCategoria.value
                },
                nombreProducto: cajaNombreProducto.value,
                referenciaProducto: cajaReferenciaProducto.value,
                precioCostoProducto: cajaPrecioCostoProducto.value,
                precioVentaProducto: cajaPrecioVentaProducto.value,
                cantidadProducto: cajaCantidadProducto.value
            })
        })
            .then(response => response.json())
            .then(data => {
                const nuevaProducto = []
                nuevaProducto.push(data)
                mostrarRegistros(nuevaProducto)
                if (data.idProducto > 0) {
                    alertify.success('Registro creado correctamente.');
                } else {
                    alertify.error('Registro No fue creado correctamente.');
                }
            })
    }

    if (opcion == 'editar') {
        const urlEditar = `${url}/actualizar`
        fetch(urlEditar, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                idProducto: idProductoEditar,
                idCategoria: {
                    idCategoria: comboIdCategoria.value
                },
                nombreProducto: cajaNombreProducto.value,
                referenciaProducto: cajaReferenciaProducto.value,
                precioCostoProducto: cajaPrecioCostoProducto.value,
                precioVentaProducto: cajaPrecioVentaProducto.value,
                cantidadProducto: cajaCantidadProducto.value
            })
        })
            .then(response => response.json())
            .then(response => location.reload())
    }

    modalProductos.hide()
})

