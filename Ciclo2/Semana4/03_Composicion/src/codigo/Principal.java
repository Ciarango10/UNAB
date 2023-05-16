package codigo;

import clases.Celular;

public class Principal {
        
    public static void main(String[] args) {
        //*********************************************
        //definición de variables
        //*********************************************
        Celular celular;
        //*********************************************
        //*********************************************
        //creacion de objetos
        //*********************************************
        celular = new Celular("XIAOMI 11", 5500, "Generica");
        //*********************************************
        celular.informacionCelular();
    }
}
