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
public abstract class Vehiculo {
    private int padron;
    private String chapa;
    private String nombrePropietario;
    private String marca;

    public Vehiculo(int padron, String chapa, String nombrePropietario, String marca) {
        this.padron = padron;
        this.chapa = chapa;
        this.nombrePropietario = nombrePropietario;
        this.marca = marca;
    }

    public int getPadron() {
        return padron;
    }

    public void setPadron(int padron) {
        this.padron = padron;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
