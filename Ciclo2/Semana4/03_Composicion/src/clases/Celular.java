
package clases;

public class Celular {
   
    private String modelo;
    private Bateria bateria;

    public Celular(String modelo, int cantMah, String marcaBateria) {
        this.modelo = modelo;
        this.bateria = new Bateria(cantMah, marcaBateria);
    }
    
    public void informacionCelular(){
        System.out.println("Modelo celular: " + modelo);
        bateria.informacionBateria();
        
    }
    
    
    
    
}
