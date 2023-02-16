/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Orden {

    private List< CompositeProducts> products = new ArrayList<>();

    public List<CompositeProducts> getProducts() {
        return products;
    }

    public void setProducts(List<CompositeProducts> products) {
        this.products = products;
    }

    public float getPrecio() {
        float precio = 0f;
        for (CompositeProducts child : products) {
            precio += child.getPrecio();
        }
        return precio;

    }

    public void addProduct(CompositeProducts product) {
        this.products.add(product);
    }

    public boolean removeProduct(CompositeProducts product) {
        return this.products.remove(product);
    }

}
