/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.cajeros;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author omarleal
 */
public class Caja {

    private Queue<Cliente> cola;
    private Random random= new Random();
    private boolean tipoCaja; // false 1-10 CAJA R // true 11+ CAJA N
    private int tiempoPagar;  // tiempo para pagar en caja // depende de tipo de caja
    private int tiempoLlegada;
    private int ID;
    private int tiempoVacia;
    private final boolean cajaImagen;
    
    
    public Caja(boolean tipoCaja,int ID) {
        
        this.ID=ID;
        
        this.tipoCaja = tipoCaja;
        
        this.cola = new LinkedList();
        
        this.tiempoPagar = determinarTiempoPagar();
        
        this.tiempoLlegada = determinarTiempoLlegada();
        
        this.tiempoVacia=0;
        
        this.cajaImagen=random.nextBoolean();
        
    }

    public boolean isCajaImagen() {
        return cajaImagen;
    }
    
    public Queue<Cliente> getCola() {
        return cola;
    }

    public void setCola(Queue<Cliente> cola) {
        this.cola = cola;
    }

    public int getTiempoPagar() {
        return tiempoPagar;
    }


    public int getTiempoLlegada() {
        return tiempoLlegada;
    }


    public boolean isTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(boolean tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    private int determinarTiempoPagar() {

        Random rand = new Random();
            // false 1-10 // true 11+
        if (!tipoCaja) {
             return tiempoPagar = rand.nextInt(5000) + 10000;// 5-10 seg = 300-600 seg
           
        } else {

             return tiempoPagar = rand.nextInt(10000) + 15000;// 10-15 min = 600-900 seg
        }
    }

    private int determinarTiempoLlegada() {
        Random rand = new Random();

        if (!tipoCaja) {

            return tiempoLlegada = rand.nextInt(1000) + 3000;// 1-3 min = 60-180 seg

        } else {

            return tiempoLlegada = rand.nextInt(5000) + 10000;// 5-10 min = 300-600 seg
        }

    }
    
    public void aumentarTiempoVacia(){
    
    this.tiempoVacia=tiempoVacia+1000; // es igual a un minuto
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTiempoVacia() {
        return tiempoVacia;
    }

    public void setTiempoVacia(int tiempoVacia) {
        this.tiempoVacia = tiempoVacia;
    }
    
    
    @Override
    public String toString() {
        return "Caja "+ ID + " cola=" + cola +" Caja=" + tipoCaja;
    }


       
}
