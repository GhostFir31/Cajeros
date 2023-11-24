/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.cajeros;

import java.util.Random;

/**
 *
 * @author omarleal
 */
public class Cliente {

    Random rand = new Random();
    
    private int numArticulos;
    private int tiempoEnCaja;
    private boolean clienteImagen;
    

    public Cliente() {

        this.numArticulos = rand.nextInt(21) + 1;
        this.tiempoEnCaja=0;
        this.clienteImagen=rand.nextBoolean();
        
    }

    public boolean isClienteImagen() {
        return clienteImagen;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public int getTiempoEnCaja() {
        return tiempoEnCaja;
    }

    public void setTiempoEnCaja(int tiempoEnCaja) {
        this.tiempoEnCaja = tiempoEnCaja;
    }



    @Override
    public String toString() {
        return "CA=" + numArticulos + "tiempoCaja"+tiempoEnCaja;
    }

    void aumentarTiempoEnCaja() {
        
        this.tiempoEnCaja=tiempoEnCaja+4000;
        
    }

}
