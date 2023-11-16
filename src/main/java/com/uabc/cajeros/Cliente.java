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


    public Cliente() {

        this.numArticulos = rand.nextInt(21) + 1;
        
    }

    public int getNumArticulos() {
        return numArticulos;
    }



    @Override
    public String toString() {
        return "CA=" + numArticulos;
    }

}
