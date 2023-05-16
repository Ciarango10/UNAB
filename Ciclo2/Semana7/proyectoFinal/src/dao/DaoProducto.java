package dao;

import configuracion.Conexion;
import interfaces.Operaciones;
import java.util.List;
import modelos.Producto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoProducto extends Conexion implements Operaciones<Producto> {

    private String sql;
    private PreparedStatement consulta;

    @Override
    public boolean agregar(Producto objeto) {
        try {
            sql = "INSERT INTO productos (nombre,id,temperatura,valorbase) VALUES (?,?,?,?)";
            consulta = objConexion.prepareStatement(sql);
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getId());
            consulta.setDouble(3, objeto.getTemperatura());
            consulta.setDouble(4, objeto.getValorBase());
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException e) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public List<Producto> consultar() {
        try {
            ResultSet rs;
            List<Producto> arregloProductos = new ArrayList<>();
            sql = "SELECT codproducto,nombre,id,temperatura,valorbase FROM productos ORDER BY codproducto DESC";
            consulta = objConexion.prepareStatement(sql);
            rs = consulta.executeQuery();

            while (rs.next()) {
                Producto objProducto = new Producto();
                objProducto.setCodProducto(Long.parseLong(rs.getObject(1).toString()));
                objProducto.setNombre(rs.getObject(2).toString());
                objProducto.setId(rs.getObject(3).toString());
                objProducto.setTemperatura(Double.parseDouble(rs.getObject(4).toString()));
                objProducto.setValorBase(Double.parseDouble(rs.getObject(5).toString()));

                arregloProductos.add(objProducto);
            }
            objConexion.close();
            return arregloProductos;
        } catch (NumberFormatException | SQLException e) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

    @Override
    public boolean borrar(Producto objeto) {
        try {
            sql = "DELETE FROM productos WHERE codproducto=?";
            consulta = objConexion.prepareStatement(sql);
            consulta.setLong(1, objeto.getCodProducto());
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException e) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public boolean actualizar(Producto objeto) {
        try {
            sql = "UPDATE productos SET nombre=?,id=?,temperatura=?,valorbase=? WHERE codproducto=?";
            consulta = objConexion.prepareStatement(sql);
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getId());
            consulta.setDouble(3, objeto.getTemperatura());
            consulta.setDouble(4, objeto.getValorBase());
            consulta.setDouble(5, objeto.getCodProducto());
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException e) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    
 }


