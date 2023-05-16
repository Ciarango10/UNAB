package codigo;

public class Principal {
    
    public static void main(String[] args) {
        //******************************************************
        //definicion de variables
        //******************************************************
        int numero1, numero2, numero3, resultado;
        numero1 = 50;
        numero2 = 100;
        numero3 = 300;
        //******************************************************
        //******************************************************
        //llamado de funciones
        //******************************************************
        saludar();
        resultado = sumar(numero1, numero2, numero3);
        System.out.println(resultado);
        sumarNumeros(numero1, numero2, numero3);
        //******************************************************
        
    }
    
    public static void saludar(){
        System.out.println("Hola como estas.");
    }
    
    public static int sumar(int num1, int num2, int num3){
        int resultado;
        resultado = num1+num2+num3;
        return resultado;
    }
    
    public static void sumarNumeros(int num1, int num2, int num3){
        int resultado;
        resultado = num1+num2+num3;
        System.out.println(resultado);
    }
    
    
    
}
