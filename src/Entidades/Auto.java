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
public class Auto extends Transporte {

    int velocidad;

    public Auto() {
        descripcion = "Auto";
    }

    public int getVelocidad() {
        return 40;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public float getCosto() {
        return 30.0f;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

}
