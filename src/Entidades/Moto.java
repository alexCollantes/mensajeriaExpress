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
public class Moto extends Transporte {
    int velocidad;
    public Moto() {
        descripcion = "Moto";
    }

    public int getVelocidad() {
        return 45;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public float getCosto() {
        return 15.0f;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return super.getDescription(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
