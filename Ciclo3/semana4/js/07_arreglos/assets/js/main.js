//DEFINICION DE ARREGLO
const arregloFrutas = ['manzana', 'mango', 'piña', 'limon'];
console.log(arregloFrutas);

//ACCEDER A VALORES POR LAS POSICIONES
console.log(arregloFrutas[0]);
console.log(arregloFrutas[2]);

//RECORRER ARREGLO CON UN CICLO
for (let index = 0; index < arregloFrutas.length; index++) {
    const element = arregloFrutas[index];
    console.log(element);
}

//MODIFICAR VALORES POSICIONES
arregloFrutas[1] = 'pera';
console.log(arregloFrutas);

//AGREGAR ELEMENTOS
arregloFrutas.push('banano');
console.log(arregloFrutas);

//ARREGLO ASOCIATIVO
let autos = {"color":"rojo","marca":"renault","modelo":2005}
console.log(autos);

console.log(autos['color'])
console.log(autos['marca'])