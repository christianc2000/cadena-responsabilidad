/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad;

import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBillete;

/**
 *
 * @author Christian
 */
public class Cajero {

    private ManejadorBillete primerHandler;

    public void setPrimerHandler(ManejadorBillete primerHandler) {
        this.primerHandler = primerHandler;
    }

    public void retirarBilletes(int restante) {

        if (primerHandler != null) {
            primerHandler.retirarBilletes(restante, "");
        } else {
            System.out.println("No se pueden retirar los billetes solicitados.");
        }

    }
}
