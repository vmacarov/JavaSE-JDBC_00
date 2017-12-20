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
public class TipodeServicio {
    private int id;
    private String nombreServicio;
    private int meses;

    public TipodeServicio(int id, String nombreServicio, int meses) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.meses = meses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    
    
}
