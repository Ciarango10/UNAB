//DEFINICION DE FUNCION
function miFuncion(numero1, numero2) {
    let resultado = 0;
    resultado = numero1 + numero2;
    console.log('la suma es: ' + resultado)
}

//LLAMADO DE LA FUNCION
miFuncion(50, 20);

//FUNCION CON RETORNO DE VALORES
function suma(numero1, numero2) {
    return numero1 + numero2;
}

let resultadoSuma = suma(100, 100);
console.log('la suma es: ' + resultadoSuma)

//FUNCIONES TIPO FLECHA LINEA
const sumar = (numero1, numero2) => numero1 + numero2;
let sumaFlecha = sumar(200, 200);
console.log('la suma es: ' + sumaFlecha)

const saludar = () => alert('hola');
saludar();

//FUNCIONES TIPO FLECHA MULTILINEA
const multiplicacion = (numero1, numero2) => {
    let resultado = numero1 * numero2;
    return resultado;
}
let resultadoMultiplicacion = multiplicacion(10,10);
console.log(resultadoMultiplicacion);