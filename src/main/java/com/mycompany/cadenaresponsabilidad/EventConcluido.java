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
public class EventConcluido extends EventObject {

    boolean concluido;
    String acumulado;

    public EventConcluido(boolean concluido, String acumulado, Object source) {
        super(source);
        this.concluido = concluido;
        this.acumulado = acumulado;
    }

    public String getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(String acumulado) {
        this.acumulado = acumulado;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

}
