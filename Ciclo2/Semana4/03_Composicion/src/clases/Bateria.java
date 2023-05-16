package clases;

public class Bateria {
    
    private int mAh;
    private String marca;

    public Bateria() {
    }

    public Bateria(int mAh, String marca) {
        this.mAh = mAh;
        this.marca = marca;
    }

    public int getmAh() {
        return mAh;
    }

    public void setmAh(int mAh) {
        this.mAh = mAh;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void informacionBateria(){
        System.out.println("Cantidad Mah Bateria: " + mAh);
        System.out.println("Marca Bateria: " +  marca);
    }
    
}
