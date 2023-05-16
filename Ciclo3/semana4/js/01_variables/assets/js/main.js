// TIPOS DE DATOS DE VARIABLES

//TIPO STRING
let cadena = 'hola';
console.log(cadena);
console.log(typeof cadena);

//TIPO NUMERICO
let numero = 50;
let numero2 = 70.25;
console.log(numero);
console.log(numero2);
console.log(typeof numero);
console.log(typeof numero2);

//TIPO OBJETO
let objetoPersona = {
    nombres: "jhon jairo",
    apellidos: "cortes paredes",
    celular: 3177891483,
    email: 'jhonjairo.cortesp@live.com',
    ubicaciones: {
        direccion1: 'calle 100',
        direccion2: 'calle 1000'
    }
}
console.log(objetoPersona);
console.log(typeof objetoPersona);
console.log(objetoPersona.celular);
console.log(objetoPersona.ubicaciones.direccion1);

//TIPO BOOLEAN
let verdadera = true;
let falso = false;
console.log(typeof verdadera);

//TIPO FUNCION
function sumar(){
    console.log(10+10);
}
console.log(typeof sumar);

//TIPO CLASE
class Persona {
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//TIPO UNDEFINED
let variable;
console.log(typeof variable);

//TIPO NULL
let variableNula = null;
console.log(typeof variableNula);

//TIPO ARREGLOS
let arregloNumeros = [1,2,3,4,5,6,7,8];
console.log(arregloNumeros);
console.log(typeof arregloNumeros);

//TIPO CADENA VACIA
let cadenaVacia = '';
console.log(cadenaVacia);
console.log(typeof cadenaVacia);