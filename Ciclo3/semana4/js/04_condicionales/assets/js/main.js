let numero = 4;

if (numero === 1) {
    console.log('Numero Uno');
} else if (numero === 2) {
    console.log('Numero Dos');
} else if (numero === 3) {
    console.log('Numero Tres');
} else if (numero === 4) {
    console.log('Numero Cuatro');
} else if (numero === 5) {
    console.log('Numero Cinco');
} else {
    console.log('Opcion no encontrada');
}

let mes = 9;
let estacion;

if (mes == 1 || mes == 2 || mes == 3) {
    estacion = 'invierno';
} else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = 'primavera';
} else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = 'verano';
} else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = 'otoño';
}
console.log(estacion);