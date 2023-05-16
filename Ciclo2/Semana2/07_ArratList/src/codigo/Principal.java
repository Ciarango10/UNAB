package codigo;

import java.util.List;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //*****************************************
        //definicion de arreglos ArrayList
        //*****************************************
        ArrayList<String> arreglo1;
        List<String> arreglo2;
        //*****************************************
        //*****************************************
        //creacion Objetos
        //*****************************************
        arreglo1 = new ArrayList<>();
        arreglo2 = new ArrayList<>();
        //*****************************************
        //*****************************************
        //agregar elementos
        //*****************************************
        arreglo1.add("Carlos");
        arreglo1.add("Jhon");
        arreglo1.add("Maria");
        arreglo1.add("Edinson");
        //*****************************************
        //*****************************************
        //obtener un valor por su posicion o indice
        //*****************************************
        System.out.println(arreglo1.get(0));
        //*****************************************
        //*****************************************
        //obtener la longitud del arreglo
        //*****************************************
        System.out.println("Longitud del arreglo: " + arreglo1.size());
        //*****************************************
        //*****************************************
        //eliminar elementos del arreglo
        //*****************************************
        arreglo1.remove("Carlos");
        arreglo1.remove(2);
        //*****************************************
        //*****************************************
        //recorrer el arreglo con un ciclo for
        //*****************************************
        for (int i = 0; i < arreglo1.size(); i++) {
            System.out.println("indice " + i + "= " + arreglo1.get(i));
        }

        for (String elemento : arreglo1) {
            System.out.println(elemento);
        }
        //*****************************************
        //*****************************************
        //eliminar todos los elementos del arreglo
        //*****************************************
        arreglo1.clear();
        //*****************************************
        //*****************************************
        //validar si el arreglo esta vacio
        //*****************************************
        if (arreglo1.isEmpty()) {
            System.out.println("El arreglo esta vacio.");
        }
    }

}
