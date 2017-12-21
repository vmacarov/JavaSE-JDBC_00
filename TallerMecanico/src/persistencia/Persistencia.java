/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Auto;
import modelo.Vehiculo;

/**
 *
 * @author Valeri
 */
public class Persistencia {
    
    private static Connection getConexion() {
        
    }
    
    
    
    private static void insertarVehiculo(Vehiculo vehiculo) throws SQLException {
        PreparedStatement ps;
        if(vehiculo instanceof Auto)
//            ps = getCon
        
    }
    
}
