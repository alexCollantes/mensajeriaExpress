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
public class Express extends Servicio{

    public Express() {
        descripcion = "Express";
    }

    @Override
    public String getDescription() {
        return super.getDescription(); 
    }
    

    @Override
    public float getCosto() {
        return 50.0f;
    }
    
}
