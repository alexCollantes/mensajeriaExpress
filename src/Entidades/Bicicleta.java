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
public class Bicicleta extends Transporte {

    int velocidad;

    public Bicicleta() {
        descripcion = "Bicicleta";
    }

    public int getVelocidad() {
        return 20;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public float getCosto() {
        return 50.0f;
    }
}
