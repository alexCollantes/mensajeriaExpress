/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        //Transportes
     
        
        CompositeProducts bicicleta = new SimpleCompositeProducts(new Bicicleta(), 5);
        CompositeProducts auto = new SimpleCompositeProducts(new Auto(), 30);
        CompositeProducts dron = new SimpleCompositeProducts(new Dron(), 10);
        CompositeProducts moto = new SimpleCompositeProducts(new Moto(), 15);
        //Paquetes
        CompositeProducts sobre = new SimpleCompositeProducts(new Sobre(), 5);
        CompositeProducts cajaPequeña = new SimpleCompositeProducts(new CajaPequeña(), 10);
        CompositeProducts cajaMediana = new SimpleCompositeProducts(new CajaMediana(), 20);
        CompositeProducts cajaGrande = new SimpleCompositeProducts(new CajaGrande(), 50);
        //Servicio
        CompositeProducts estandar = new SimpleCompositeProducts(new Estandar(), 30);
        CompositeProducts express = new SimpleCompositeProducts(new Express(), 50);
        //dron express con sobre menos 1km
        CompositeComponents dronA = new CompositeComponents();
        dronA.addProduct(dron);
        dronA.addProduct(sobre);
        dronA.addProduct(express);
//        System.out.println(dronA.getPrecio());
        //dron express con caja pequeña menos 1km
        CompositeComponents dronB = new CompositeComponents();
        dronB.addProduct(dron);
        dronB.addProduct(cajaPequeña);
        dronB.addProduct(express);
        //bicicleta sobre estandar menos 1km o mas 1km
        CompositeComponents bicicletaA = new CompositeComponents();
        bicicletaA.addProduct(bicicleta);
        bicicletaA.addProduct(sobre);
        bicicletaA.addProduct(estandar);
        //bicicleta caja pequeña estandar menos 1km o mas 1km
        CompositeComponents bicicletaB = new CompositeComponents();
        bicicletaB.addProduct(bicicleta);
        bicicletaB.addProduct(cajaPequeña);
        bicicletaB.addProduct(estandar);
        //moto sobre express mas 1km
        CompositeComponents motoA = new CompositeComponents();
        motoA.addProduct(moto);
        motoA.addProduct(sobre);
        motoA.addProduct(express);
        //moto caja pequeña express mas 1km
        CompositeComponents motoB = new CompositeComponents();
        motoB.addProduct(moto);
        motoB.addProduct(cajaPequeña);
        motoB.addProduct(express);
        //bicicleta caja mediana estandar 5km o menos
        CompositeComponents bicicletaC = new CompositeComponents();
        bicicletaC.addProduct(bicicleta);
        bicicletaC.addProduct(cajaMediana);
        bicicletaC.addProduct(estandar);
        //moto caja mediana express mas 5km
        CompositeComponents motoC = new CompositeComponents();
        motoC.addProduct(moto);
        motoC.addProduct(cajaMediana);
        motoC.addProduct(express);
        //moto estandar mediana mas 5km
        CompositeComponents motoD = new CompositeComponents();
        motoD.addProduct(moto);
        motoD.addProduct(cajaMediana);
        motoD.addProduct(estandar);
        //Auto grande  estandar
        CompositeComponents autoA = new CompositeComponents();
        autoA.addProduct(auto);
        autoA.addProduct(cajaGrande);
        autoA.addProduct(estandar);
        //auto grande express
        CompositeComponents autoB = new CompositeComponents();
        autoB.addProduct(auto);
        autoB.addProduct(cajaGrande);
        autoB.addProduct(express);

        String tipoServicio;
        String tipoPaquete = "";
        float distancia = 0.0f;
        System.out.println("Bienvenido al servicio de mensajeria Express");
        do {
            System.out.println("Elegir tipo de servicio: Express o Estandar");
            tipoServicio = tec.nextLine();
            if (!tipoServicio.equalsIgnoreCase("Express") && !tipoServicio.equalsIgnoreCase("Estandar")) {
                System.out.println("Introducir un servicio valido");
            }
        } while (!tipoServicio.equalsIgnoreCase("Express") && !tipoServicio.equalsIgnoreCase("Estandar"));
        do {
            System.out.println("Elegir tipo de paquete: sobre, caja pequena, caja mediana o caja grande");
            tipoPaquete = tec.nextLine();
            if (!tipoPaquete.equalsIgnoreCase("sobre") && !tipoPaquete.equalsIgnoreCase("caja pequena")
                    && !tipoPaquete.equalsIgnoreCase("caja mediana") && !tipoPaquete.equalsIgnoreCase("caja grande")) {
                System.out.println("Introducir un paquete valido");
            }
        } while (!tipoPaquete.equalsIgnoreCase("sobre") && !tipoPaquete.equalsIgnoreCase("caja pequena")
                && !tipoPaquete.equalsIgnoreCase("caja mediana") && !tipoPaquete.equalsIgnoreCase("caja grande"));
        System.out.println("¿Cual es la distancia en km?");
        distancia = tec.nextFloat();
        float extraDistancia = 0;
        if (distancia > 10) {
            extraDistancia = distancia - 10;
        }

        System.out.println("---------");
        System.out.println("Tipo de servicio: " + tipoServicio);
        System.out.println("Tipo de paquete: " + tipoPaquete);
        System.out.println("Distancia: " + distancia + " km");
        //dron menos 1km
        if (tipoServicio.equalsIgnoreCase("Express")
                && distancia <= 1
                && tipoPaquete.equalsIgnoreCase("sobre")) {
            float tiempo;
            tiempo = (60 * distancia) / 60;
            System.out.println("El costo del servicio es: " + dronA.getPrecio());
            System.out.println("se entregara en dron en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio express");
            System.out.println("$5 por sobre ");
            System.out.println("$10 por dron");
            System.out.println("Dron por ser sobre y servicio express de 1 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad del dron es 60 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //dron menos 1k
        if (tipoServicio.equalsIgnoreCase("Express")
                && distancia <= 1
                && tipoPaquete.equalsIgnoreCase("caja pequena")) {
            float tiempo;
            tiempo = (60 * distancia) / 60;
            System.out.println("El costo del servicio es: " + dronB.getPrecio());
            System.out.println("se entregara en dron en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio express");
            System.out.println("$10 por caja pequeña ");
            System.out.println("$10 por dron");
            System.out.println("Dron por ser caja pequeña y servicio express de 1 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad del dron es 60 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //bicicleta estandar menos 1km
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && distancia <= 1
                && tipoPaquete.equalsIgnoreCase("sobre")) {
            float tiempo;
            tiempo = (60 * distancia) / 20;
            System.out.println("El costo del servicio es: " + bicicletaA.getPrecio());
            System.out.println("se entregara en bicicleta en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$5 por sobre ");
            System.out.println("$5 por bicicleta");
            System.out.println("Bicicleta por ser sobre y servicio estandar de 1 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad de la bicicleta es 20 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //bicicleta estandar menos 1km
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && distancia <= 1
                && tipoPaquete.equalsIgnoreCase("caja pequena")) {
            float tiempo;
            tiempo = (60 * distancia) / 20;
            System.out.println("El costo del servicio es: " + bicicletaB.getPrecio());
            System.out.println("se entregara en bicicleta en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$10 por caja pequeña ");
            System.out.println("$5 por bicicleta");
            System.out.println("bicicleta por ser caja pequeña y servicio estadar de 1 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad de la bicicleta es 20 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //bicleta mas 1km 
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && distancia > 1
                && tipoPaquete.equalsIgnoreCase("sobre")) {
            float tiempo;
            tiempo = (60 * distancia) / 20;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (bicicletaA.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + bicicletaA.getPrecio());
            }
            System.out.println("se entregara en bicicleta en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$5 por sobre ");
            System.out.println("$5 por bicicleta");

            System.out.println("Bicicleta por ser sobre y servicio estandar de 1 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad de la bicicleta es 20 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //bicleta mas 1km 
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && distancia > 1
                && tipoPaquete.equalsIgnoreCase("caja pequena")) {
            float tiempo;
            tiempo = (60 * distancia) / 20;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (bicicletaB.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + bicicletaB.getPrecio());
            }
            System.out.println("se entregara en bicicleta en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$10 por caja pequeña ");
            System.out.println("$5 por bicicleta");
            System.out.println("bicicleta por ser caja pequeña y servicio estadar de 1 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad de la bicicleta es 20 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //moto expres
        if (tipoServicio.equalsIgnoreCase("Express")
                && distancia > 1
                && tipoPaquete.equalsIgnoreCase("sobre")) {
            float tiempo;
            tiempo = (60 * distancia) / 45;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (motoA.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + motoA.getPrecio());
            }
            System.out.println("se entregara en moto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio express");
            System.out.println("$5 por sobre ");
            System.out.println("$15 por moto");
            System.out.println("Moto por ser sobre y servicio Express de mas de 1 Km.");
            System.out.println(tiempo + " minutos porque la velocidad de la moto es de 45 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //moto expres mas 1km 
        if (tipoServicio.equalsIgnoreCase("Express")
                && distancia > 1
                && tipoPaquete.equalsIgnoreCase("caja pequena")) {
            float tiempo;
            tiempo = (60 * distancia) / 45;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (motoB.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + motoB.getPrecio());
            }
            System.out.println("se entregara en moto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio express");
            System.out.println("$10 por caja pequeña ");
            System.out.println("$15 por moto");
            System.out.println("Moto por ser caja pequeña y servicio Express de mas de 1 Km.");
            System.out.println(tiempo + " minutos porque la velocidad de la moto es de 45 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }

        //bicleta mas 1km 
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && distancia <= 5
                && tipoPaquete.equalsIgnoreCase("caja mediana")) {
            float tiempo;
            tiempo = (60 * distancia) / 20;
            System.out.println("El costo del servicio es: " + bicicletaC.getPrecio());
            System.out.println("se entregara en bicicleta en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$20 por caja mediana ");
            System.out.println("$5 por bicicleta");
            System.out.println("Bicicleta por ser caja mediana y servicio estandar de 5 Km o menos.");
            System.out.println(tiempo + " minutos porque la velocidad de la bicicleta es 20 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //moto expres mas 5km 
        if (tipoServicio.equalsIgnoreCase("Express")
                && tipoPaquete.equalsIgnoreCase("caja mediana")) {
            float tiempo;
            tiempo = (60 * distancia) / 45;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (motoC.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + motoC.getPrecio());
            }
            System.out.println("se entregara en moto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio express");
            System.out.println("$20 por caja mediana ");
            System.out.println("$15 por moto");
            System.out.println("Moto por ser caja mediana y servicio Express");
            System.out.println(tiempo + " minutos porque la velocidad de la moto es de 45 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }

        //moto  mas 5km 
        if (tipoServicio.equalsIgnoreCase("Express")
                && distancia > 5
                && tipoPaquete.equalsIgnoreCase("caja mediana")) {
            float tiempo;
            tiempo = (60 * distancia) / 45;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (motoC.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + motoC.getPrecio());
            }
            System.out.println("se entregara en moto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio express");
            System.out.println("$20 por caja mediana ");
            System.out.println("$15 por moto");
            System.out.println("Moto por ser caja mediana y distancia de mas de 5km");
            System.out.println(tiempo + " minutos porque la velocidad de la moto es de 45 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //moto  mas 5km 
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && distancia > 5
                && tipoPaquete.equalsIgnoreCase("caja mediana")) {
            float tiempo;
            tiempo = (60 * distancia) / 45;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (motoD.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + motoD.getPrecio());
            }
            System.out.println("se entregara en moto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$20 por caja mediana ");
            System.out.println("$15 por moto");
            System.out.println("Moto por ser caja mediana y  servicio estandar de distancia de mas de 5km");
            System.out.println(tiempo + " minutos porque la velocidad de la moto es de 45 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //auto estandar
        if (tipoServicio.equalsIgnoreCase("Estandar")
                && tipoPaquete.equalsIgnoreCase("caja grande")) {
            float tiempo;
            tiempo = (60 * distancia) / 40;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (autoA.getPrecio() + extraDistancia * 5));
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + autoA.getPrecio());
            }
            System.out.println("se entregara en auto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$30 por servicio estandar");
            System.out.println("$50 por caja grande ");
            System.out.println("$30 por auto");
            System.out.println("Auto por ser caja grande y  servicio estandar");
            System.out.println(tiempo + " minutos porque la velocidad del auto es de 40 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }
        //auto express
        if (tipoServicio.equalsIgnoreCase("Express")
                && tipoPaquete.equalsIgnoreCase("caja grande")) {
            float tiempo;
            tiempo = (60 * distancia) / 40;
            if (distancia > 10) {
                System.out.println("El costo del servicio es: " + (autoB.getPrecio() + extraDistancia * 5));
                System.out.println(extraDistancia);
                System.out.println("Costo extra de $5 por kilometro extra");
            } else {
                System.out.println("El costo del servicio es: " + autoB.getPrecio());
            }
            System.out.println("se entregara en auto en un tiempo aprox de: " + tiempo + " minutos");
            System.out.println("Costo");
            System.out.println("$50 por servicio Express");
            System.out.println("$50 por caja grande ");
            System.out.println("$30 por auto");
            System.out.println("Auto por ser caja grande y  servicio estandar");
            System.out.println(tiempo + " minutos porque la velocidad del auto es de 40 Km/h y la distancia" + distancia + " km");
            System.exit(0);
        }

    }
}
