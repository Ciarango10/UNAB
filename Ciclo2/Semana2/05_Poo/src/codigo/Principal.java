
package codigo;
import clases.formatoFecha;
public class Principal {
     public static void main(String[] args){
         System.out.println(formatoFecha.formato("2022/08/02", 1));
         System.out.println(formatoFecha.formato("2022/08/02", 2));
         System.out.println(formatoFecha.formato("2022/08/02", 3));
     }
}
