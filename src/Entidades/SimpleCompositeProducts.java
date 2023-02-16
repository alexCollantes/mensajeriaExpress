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
public class SimpleCompositeProducts extends CompositeProducts{

    public SimpleCompositeProducts(Servicio servicio,float precio) {
        super(servicio,precio);
    }

    public SimpleCompositeProducts(Paquete paquete,float precio) {
        super(paquete,precio);
    }

    public SimpleCompositeProducts(Transporte transporte,float precio) {
        super(transporte,precio);
    }

    public SimpleCompositeProducts(Transporte transporte, Paquete paquete, Servicio servicio) {
        super(transporte, paquete, servicio);
        
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
