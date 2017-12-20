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
public class Moto extends Vehiculo{
    private int cilindrada;
    private int anio;

    public Moto(int padron, String chapa, String nombrePropietario, String marca) {
        super(padron, chapa, nombrePropietario, marca);
    }

    public Moto(int cilindrada, int anio, int padron, String chapa, String nombrePropietario, String marca) {
        super(padron, chapa, nombrePropietario, marca);
        this.cilindrada = cilindrada;
        this.anio = anio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
