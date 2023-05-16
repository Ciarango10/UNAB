package codigo;

public class Principal {
    
    public static void main(String[] args) {
        //********************************************
        //Definicion de arreglo primitivo
        //********************************************
        int edades[] = new int[8];
        System.out.println("Longitud Arreglo: " + edades.length);
        //********************************************
        //********************************************
        //modificar valores indices o posiciones
        //********************************************
        edades[0] = 35;
        edades[1] = 30;
        edades[2] = 25;
        edades[3] = 45;
        edades[4] = 14;
        edades[5] = 44;
        edades[6] = 80;
        edades[7] = 10;
        //*********************************************
        //*********************************************
        //acceder a los valores a traves de los indices
        //*********************************************
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 2 = " + edades[2]);
        System.out.println("edades 6 = " + edades[6]);
        //**********************************************
        //**********************************************
        //Recorrer arreglo con ciclo for
        //**********************************************
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades posicion " + i + ":" + edades[i]);
        }
        //**********************************************
        //**********************************************
        //Llenar el arreglo con ciclo for 
        //**********************************************
        float notas[] = new float[15];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = i + 1;
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas posicion " + i + ": " + notas[i]);
        }
        //*******************************************************
        //*******************************************************
        //definir arreglo con valores
        //*******************************************************
        String frutas[] = {"naranja", "mango", "mandarina", "madarina", "uva", "banano"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas posicion" + i + ": " + frutas[i]);
        }
    }
}
