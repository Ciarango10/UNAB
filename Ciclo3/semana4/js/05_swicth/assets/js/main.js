let numero = 2;
let numeroTexto;

switch (numero) {
    case 1:
        numeroTexto = 'Numero Uno';
        break;

    case 2:
        numeroTexto = 'Numero Dos';
        break;

    case 3:
        numeroTexto = 'Numero Tres';
        break;

    case 4:
        numeroTexto = 'Numero Cuatro';
        break;

    case 5:
        numeroTexto = 'Numero Cinco';
        break;

    default:
        numeroTexto = 'Opcion no valida';
        break;
}
console.log(numeroTexto);

let mes = 7;
let estacion = '';

switch (mes) {
    case 1: case 2: case 12:
        estacion = 'invierno';
        break;

    case 3: case 4: case 5:
        estacion = 'primavera';
        break;

    case 6: case 7: case 8:
        estacion = 'verano';
        break;

    case 9: case 10: case 11:
        estacion = 'otoño';
        break;

    default:
        estacion = 'opcion no encontrada';
        break;
}
console.log(estacion);