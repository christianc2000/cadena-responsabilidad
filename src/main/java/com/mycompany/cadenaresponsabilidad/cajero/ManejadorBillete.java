/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad.cajero;

import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public abstract class ManejadorBillete {

    protected ManejadorBillete nextHandler;
    protected int cantidad;
    protected int monto;

    public ManejadorBillete(int cantidad, int monto) {
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int montoTotal() {
        return cantidad * monto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNextHandler(ManejadorBillete handler) {
        this.nextHandler = handler;
    }

    public void retirarBilletes(int monto, String acumulado) {
        if (puedeManejar(monto)) {
            manejarRetiro(monto, acumulado);
        } else if (nextHandler != null) {
            nextHandler.retirarBilletes(monto, acumulado);
        } else {
            System.out.println("No se pueden retirar los billetes solicitados. El cajero no tiene el monto solicitado");
        }
    }

    protected abstract boolean puedeManejar(int restante);

    protected abstract void manejarRetiro(int restante, String acumulado);
}
