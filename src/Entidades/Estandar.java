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
public class Estandar extends Servicio{

    public Estandar() {
        descripcion = "Estandar";
    }

    @Override
    public String getDescription() {
        return super.getDescription(); 
    }

    
    @Override
    public float getCosto() {
        return 30.0f;
    }
    
}
