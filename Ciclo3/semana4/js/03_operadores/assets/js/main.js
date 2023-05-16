let numero1 = 20
let numero2 = 10
let resultado = 0
let numero3 = 50
let numero4 = 100
let numero5 = 80;
let numero6 = 125;

//OPERADORES ARITMETICOS
resultado = numero1 + numero2
console.log('resultado de la suma: ' + resultado)

resultado = numero1 - numero2
console.log('resultado de la resta: ' + resultado)

resultado = numero1 * numero2
console.log('resultado de la multiplicacion: ' + resultado)

resultado = numero1 / numero2
console.log('resultado de la division: ' + resultado)

resultado = numero1 % numero2
console.log('resultado de la division modulo: ' + resultado)

resultado = numero1 ** numero2
console.log('resultado de la potencia: ' + resultado)

//OPERADORES DE INCREMENTO
resultado = numero1++
console.log('operador POST-INCREMENTO: ' + resultado)

resultado = ++numero1
console.log('operador PRE-INCREMENTO: ' + resultado)

resultado = ++numero2
console.log('operador PRE-INCREMENTO: ' + resultado)

//OPERADORES DECREMENTO
resultado = numero2--
console.log('operador POST-DECREMENTO: ' + resultado)

resultado = --numero2
console.log('operador PRE-DECREMENTO: ' + resultado)

//OPERADORES DE ASIGNACION
numero3 += 3;
console.log('asignacion de valor: ' + numero3)//numero3 = numero3 + 3

numero4 -= 1;
console.log('asignacion de valor: ' + numero4)//numero4 = numero4 - 1

//OPERADORES DE COMPARACION
//IGUAL QUE
console.log('125' == numero6);//revisa el valor sin importar el tipo de datos
console.log(125 === numero6);//revisa el valor y el tipo de datos

//OPERADOR DE DIFERENTE
console.log('50' != numero6);//revisa el valor sin importar el tipo de datos
console.log(50 !== numero6);//revisa el valor y el tipo de datos

//MENOR QUE
console.log(numero5 < numero6);

//MAYOR QUE
console.log(numero5 > numero6);

//MENOR O IGUAL QUE
console.log(numero5 <= numero6);

//MAYOR O IGUAL QUE
console.log(numero5 >= numero6);

//OPERADORES LOGICOS
//AND &&
let valor = 15;
let valorMinimo = 0;
let valorMaximo = 10;

if (valor >= valorMinimo && valor <= valorMaximo) {
    console.log('dentro del rango de valores');
} else {
    console.log('fuera del rango de valores');
}

//OR ||
if (valor >= valorMinimo || valor <= valorMaximo) {
    console.log('dentro del rango de valores');
} else {
    console.log('fuera del rango de valores');
}

//OPERADORES TERNARIOS
resultado = (10>5) ? 'verdadero' : 'false';
console.log(resultado);

let valorNumero = 110;
resultado = (valorNumero % 2 == 0) ? 'numero par' : 'numero impar';
console.log(resultado);