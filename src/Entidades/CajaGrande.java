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
public class CajaGrande extends Paquete{

    public CajaGrande() {
        descripcion= "Caja Grande";
    }

    @Override
    public float getCosto() {
        return super.getCosto(); 
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + 50.0f; 
    }

}
