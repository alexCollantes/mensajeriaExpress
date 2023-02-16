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
public class Dron extends Transporte {

    int velocidad;

    public Dron() {
        descripcion = "Dron";
    }

    public int getVelocidad() {
        return 60;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public float getCosto() {
        return 20f;
    }

}
