const url = 'http://localhost:8082/api/categorias';
const cuerpoTabla = document.querySelector('tbody');
let resultados = '';

const modalCategorias = new bootstrap.Modal(document.getElementById('modalCategorias'))
const formulario = document.querySelector('form')
let opcion = ''

//mostrar todos los registros de la tabla categorias
const urlListadoCategorias = `${url}/todas`;
fetch(urlListadoCategorias)
    .then(response => response.json())
    .then(data => mostrarRegistros(data))
    .catch(error => console.log(error))

const mostrarRegistros = (arregloCategorias) => {
    arregloCategorias.forEach(categoria => {
        resultados += `<tr>
                                <td class="text-center">${categoria.idCategoria}</td>
                                <td>${categoria.nombreCategoria}</td>
                                <td class="text-center">
                                    <a class="btnEditar btn btn-primary btn-sm">Editar</a>
                                    <a class="btnBorrar btn btn-danger btn-sm">Borrar</a>
                                </td>
                           </tr>`
    });
    cuerpoTabla.innerHTML = resultados;
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
    const idCategoria = fila.firstElementChild.innerHTML

    alertify.confirm("¿Desea eliminar el registro?.",
        function () {
            const urlBorrar = `${url}/borrar/${idCategoria}`
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

//recibir datos del formulario
const cajaNombreCategoria = document.getElementById('nombre')

//proceso para la creacion de la categoria
btnCrear.addEventListener('click', () => {
    cajaNombreCategoria.value = ''
    modalCategorias.show()
    opcion = 'crear'
})

//proceso para preparar el editar
let idCategoriaEditar = 0
on(document, 'click', '.btnEditar', e => {
    const fila = e.target.parentNode.parentNode
    idCategoriaEditar = fila.firstElementChild.innerHTML

    const urlUno = `${url}/uno/${idCategoriaEditar}`
    fetch(urlUno)
        .then(response => response.json())
        .then(data => mostrarDatos(data))
        .catch(error => console.log(error))
})

const mostrarDatos = (data) => {
    cajaNombreCategoria.value = data.nombreCategoria
    opcion = 'editar'
    modalCategorias.show()
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
                nombreCategoria: cajaNombreCategoria.value
            })
        })
            .then(response => response.json())
            .then(data => {
                const nuevaCategoria = []
                nuevaCategoria.push(data)
                mostrarRegistros(nuevaCategoria)
                if (data.idCategoria > 0) {
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
                idCategoria: idCategoriaEditar,
                nombreCategoria: cajaNombreCategoria.value
            })
        })
            .then(response => response.json())
            .then(response => location.reload())
    }

    modalCategorias.hide()
})