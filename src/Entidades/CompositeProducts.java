/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alejandro
 */
public abstract class CompositeProducts {
    protected Transporte transporte;
    protected Paquete paquete;
    protected Servicio servicio;
    protected float precio;
    
    public CompositeProducts(){
        
    }
    
    public CompositeProducts(Servicio servicio,float precio) {
        this.servicio = servicio;
        this.precio = precio;
    }

    public CompositeProducts(Paquete paquete,float precio) {
        this.paquete = paquete;
        this.precio = precio;
    }

    public CompositeProducts(Transporte transporte,float precio) {
        this.transporte = transporte;
        this.precio = precio;
    }

    public CompositeProducts(Transporte transporte, Paquete paquete, Servicio servicio) {
        this.transporte = transporte;
        this.paquete = paquete;
        this.servicio = servicio;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
