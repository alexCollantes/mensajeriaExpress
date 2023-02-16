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
public class Sobre extends Paquete{

    public Sobre() {
        descripcion = "Sobre";
    }

    @Override
    public float getCosto() {
        return super.getCosto() + 5.0f; 
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion(); 
    }
    
    
}
