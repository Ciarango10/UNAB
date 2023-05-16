package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private String usuario;
    private String clave;
    private String url;
    private String driver;
    protected Connection objConexion;
    
    public Conexion() {
        this.usuario = "root";
        this.clave = "misionTic2022";
        this.url = "jdbc:mysql://localhost:3306/bd_productos";
        this.driver = "com.mysql.cj.jdbc.Driver";
        
        activarConexion();
    }
    
    private void activarConexion() {
        try {
            Class.forName(driver);
            objConexion = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
