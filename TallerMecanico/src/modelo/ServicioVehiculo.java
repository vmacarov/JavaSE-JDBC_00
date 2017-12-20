/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author itsistemas
 */
public class ServicioVehiculo {
    private int id;
    private Date fechaServicio;
    private Vehiculo vehiculo;
    private ArrayList<TipodeServicio> tiposServicios;

    public ServicioVehiculo(int id, Date fechaServicio, Vehiculo vehiculo){ 
                //, ArrayList<TipodeServicio> tiposServicios) {
        this.id = id;
        this.fechaServicio = fechaServicio;
        this.vehiculo = vehiculo;
        //this.tiposServicios = tiposServicios;
        this.tiposServicios = new ArrayList<>();  //prestar antencion en el DCD.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

//    public ArrayList<TipodeServicio> getTiposServicios() {
//        return tiposServicios;
//    }

//    public void setTiposServicios(ArrayList<TipodeServicio> tiposServicios) {
//        this.tiposServicios = tiposServicios;
//    }
    
    
    
}
