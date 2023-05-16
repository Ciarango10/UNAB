package clases;

public class Cliente {

    protected long documentoIdentidad;
    protected String nombre;
    protected String correoElectronico;
    protected int numeroCelular;
    protected String direccion;

    public Cliente() {
    }
    
    public Cliente(long documentoIdentidad, String nombre, String correoElectronico, int numeroCelular, String direccion) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   

    
}
