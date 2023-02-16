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
public abstract class Servicio {
      String descripcion = "Servicio";

    public String getDescription() {
        return descripcion;
    }
    public abstract float getCosto();
}
