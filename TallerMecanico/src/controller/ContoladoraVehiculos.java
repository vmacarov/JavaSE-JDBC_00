/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import excepciones.BDException;
import modelo.Auto;
import modelo.Moto;
import modelo.Vehiculo;

/**
 *
 * @author itsistemas
 */
public abstract class ContoladoraVehiculos {
    
    /**
     * 
     * @param vehiculo
     * @return
     * @throws BDException 
     */
    public static Vehiculo GrabarVehiculo(Vehiculo vehiculo) throws BDException{
        persistencia.Persistencia.Grabar(vehiculo);
        return vehiculo;
    }
    
    public static Vehiculo CrearAuto(int padron, String chapa, String nombrePropietario,
            String marca, int cantidadPuertas) throws BDException{
        Auto auto = new Auto(padron, chapa, nombrePropietario, marca);
        GrabarVehiculo(auto);
        return auto;
    }
    
    public static Vehiculo CrearMoto(int padron, String chapa, String nombrePropietario,
            String marca, int cilindrada, int anio)throws BDException{
        Moto moto = new Moto(padron, chapa, nombrePropietario, marca);
        GrabarVehiculo(moto);
        return moto;
    }
}
