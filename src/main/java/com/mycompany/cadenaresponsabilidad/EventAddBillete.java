/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad;

import java.util.EventObject;

/**
 *
 * @author Christian
 */
public class EventAddBillete extends EventObject{
    int monto;
    int cantidad;
   
    
    public EventAddBillete(int monto, int cantidad, Object source) {
        super(source);
        this.monto = monto;
        this.cantidad = cantidad;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
