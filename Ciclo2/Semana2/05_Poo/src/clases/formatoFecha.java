
package clases;

public class formatoFecha {

    public static String formato(String fecha, int tipo){
       String [] arregloFecha = fecha.split("/");
       String anio, mes, dia, fechaFinal="";
      
       anio = arregloFecha[0];
       mes = arregloFecha[1];
       dia = arregloFecha[2];
       
       switch(tipo) {
           case 1: 
               fechaFinal = dia + "/" + mes + "/" + anio;
               break;
           case 2:
                fechaFinal = dia + "-" + mes + "-" + anio;
               break;
           case 3:
               String mesFinal = nombreMes(mes);
               fechaFinal = dia + "-" + mesFinal + "-" + anio;
               break;
           }
            return fechaFinal;
       
       
    }
    
    public static String nombreMes(String numeroMes) {
        String nombreDelMes = "";
        
        switch (numeroMes){
            case "01":
                nombreDelMes = "Enero";
                break;
            case "02":
                nombreDelMes = "Febrero";
                break;
            case "03":
                nombreDelMes = "Marzo";
                break;
            case "04":
                nombreDelMes = "Abril";
                break;
            case "05":
                nombreDelMes = "Mayo";
                break;
            case "06":
                nombreDelMes = "Junio";
                break;
            case "07":
                nombreDelMes = "Julio";
                break;
            case "08":
                nombreDelMes = "Agosto";
                break;
            case "09":
                nombreDelMes = "Septiembre";
                break;
            case "10":
                nombreDelMes = "Octubre";
                break;
            case "11":
                nombreDelMes = "Noviembre";
                break;
            case "12":
                nombreDelMes = "Diciembre";
                break;
            }
        return nombreDelMes;
    }
}
    

