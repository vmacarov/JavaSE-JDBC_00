/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Auto;
import modelo.Moto;
import modelo.Vehiculo;
import excepciones.BDException;

/**
 *
 * @author Valeri
 */
public abstract class Persistencia {
    
    private static final String SQL_INSERTAR_AUTOS = "INSERT INTO vehiculo"
            + "(padron, chapa, nombrePropietario, marca, cantidadDePuertas, tipo)"
            + "VALUES (?,?,?,?,?,'A')";
    private static final String SQL_INSERTAR_MOTOS = "INSERT INTO vehiculo"
            + "(padron, chapa, nombrePropietario, marca, cilindrada, anio, tipo"
            + "VALUES (?,?,?,?,?,'M')";
    
    private static Connection miConexionBD = null;
    
    private static Connection getConexionBD() throws BDException {
        if(miConexionBD == null){
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                miConexionBD = DriverManager.
                        getConnection("jdbc:mysql://localhost:3307/taller", "root", "root");
            } catch (Exception e) {
                throw new BDException("Error al abrir conexion con la base datos");
            }
        }
        return miConexionBD;
    }
    
    
/**
 * Inserto un Vehículo nuevo en la base datos.
 * @param vehiculo
 * @throws BDException
 * @throws SQLException 
 */    
    private static void insertarVehiculo(Vehiculo vehiculo) throws BDException, SQLException {
        PreparedStatement ps;
        if(vehiculo instanceof Auto){
            ps = getConexionBD().prepareStatement(SQL_INSERTAR_AUTOS);
            ps.setInt(1, vehiculo.getPadron());
            ps.setString(2, vehiculo.getChapa());
            ps.setString(3, vehiculo.getNombrePropietario());
            ps.setString(4, vehiculo.getMarca());
            ps.setInt(5, ((Auto)vehiculo).getCantidadDePuertas());
            ps.executeUpdate();
        }else{
            ps = getConexionBD().prepareStatement(SQL_INSERTAR_MOTOS);
            ps.setInt(1, vehiculo.getPadron());
            ps.setString(2, vehiculo.getChapa());
            ps.setString(3, vehiculo.getNombrePropietario());
            ps.setString(4, vehiculo.getMarca());
            ps.setInt(5, ((Moto)vehiculo).getCilindrada());
            ps.setInt(6, ((Moto)vehiculo).getAnio());
            ps.executeUpdate();
        }
            
    }
    
}
