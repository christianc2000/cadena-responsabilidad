/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad;

import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteCien;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteCincuenta;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteDiez;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteDosciento;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteVeinte;

/**
 *
 * @author Christian
 */
public class CadenaResponsabilidad {

    Cajero cajero;
    ManejadorBilleteDosciento handlerDosciento;
    ManejadorBilleteCien handlerCien;
    ManejadorBilleteCincuenta handlerCincuenta;
    ManejadorBilleteVeinte handlerVeinte;
    ManejadorBilleteDiez handlerDiez;

    public CadenaResponsabilidad() {
        handlerDosciento = new ManejadorBilleteDosciento(10);
        handlerCien = new ManejadorBilleteCien(10);
        handlerCincuenta = new ManejadorBilleteCincuenta(20);
        handlerVeinte = new ManejadorBilleteVeinte(25);
        handlerDiez = new ManejadorBilleteDiez(50);
        cajero = new Cajero();
    }

    public void retirarCajero(int montoCliente) {
        cajero.retirarBilletes(montoCliente);
    }

    public void iniciar() {
        // Crear los handlers y configurar la cadena de responsabilidad con las cantidades y montos establecidos
        handlerDosciento.setNextHandler(handlerCien);
        handlerCien.setNextHandler(handlerCincuenta);
        handlerCincuenta.setNextHandler(handlerVeinte);
        handlerVeinte.setNextHandler(handlerDiez);
        cajero.setPrimerHandler(handlerDosciento);
    }

    public void reinicia() {
        handlerDosciento.setCantidad(10);
        handlerCien.setCantidad(10);
        handlerCincuenta.setCantidad(20);
        handlerVeinte.setCantidad(25);
        handlerDiez.setCantidad(50);
    }

    public void extraerMontos(String montos[]) {
        for (int i = 0; i < montos.length; i++) {
            String value[] = montos[i].split("-");
            if (value[1].equals("200")) {
                handlerDosciento.setCantidad(Integer.parseInt(value[0]));
            }
            if (value[1].equals("100")) {
                handlerCien.setCantidad(Integer.parseInt(value[0]));
            }
            if (value[1].equals("50")) {
                handlerCincuenta.setCantidad(Integer.parseInt(value[0]));
            }
            if (value[1].equals("20")) {
                handlerVeinte.setCantidad(Integer.parseInt(value[0]));
            }
            if (value[1].equals("10")) {
                handlerDiez.setCantidad(Integer.parseInt(value[0]));
            }
        }
    }
}
