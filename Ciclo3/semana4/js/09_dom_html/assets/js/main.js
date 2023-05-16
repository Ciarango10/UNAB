const cambiarTexto = () => {
    document.getElementById('cabecero').innerHTML = 'HOLA MUNDO';
}

let cabecero = document.getElementById('cabecero');
console.log(cabecero.innerHTML);

let parrafo = document.getElementById('parrafo');
console.log(parrafo.innerHTML);

let parrafo2 = document.getElementsByClassName('azul');
console.log(parrafo2);
console.log(parrafo2[0].innerHTML);
console.log(parrafo2[1].innerHTML);

let elementos = document.querySelectorAll('p.azul');
console.log(elementos);
console.log(elementos[0].innerHTML);
console.log(elementos[1].innerHTML);