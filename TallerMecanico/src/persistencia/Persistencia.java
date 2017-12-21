/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import excepciones.BDException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Auto;
import modelo.Vehiculo;

/**
 *
 * @author Valeri
 */
public class Persistencia {
    
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
    
    
    
    private static void insertarVehiculo(Vehiculo vehiculo) throws BDException, SQLException {
        PreparedStatement ps;
        if(vehiculo instanceof Auto)
            ps = getConexionBD()
        
    }
    
}
