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
public class CajaPequeña extends Paquete{

    public CajaPequeña() {
        descripcion= "Caja Pequeña";
    }

    @Override
    public float getCosto() {
        return super.getCosto(); 
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + 10.0f; 
    }
    
    
    
}
