/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author itsistemas
 */
public class Auto extends Vehiculo{
    private int cantidadDePuertas;

    public Auto(int padron, String chapa, String nombrePropietario, String marca) {
        super(padron, chapa, nombrePropietario, marca);
    }

    public Auto(int cantidadDePuertas, int padron, String chapa, String nombrePropietario, String marca) {
        super(padron, chapa, nombrePropietario, marca);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    
}
