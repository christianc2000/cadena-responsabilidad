/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad.cajero;

import com.mycompany.cadenaresponsabilidad.ComunicationListener;
import com.mycompany.cadenaresponsabilidad.EventAddBillete;
import com.mycompany.cadenaresponsabilidad.EventConcluido;
import javax.swing.event.EventListenerList;

/**
 *
 * @author Christian
 */
public class ManejadorBilleteDiez extends ManejadorBillete {

    protected EventListenerList listenerList = new EventListenerList();

    public ManejadorBilleteDiez(int cantidad) {
        super(cantidad, 10);
    }

    @Override
    protected boolean puedeManejar(int restante) {
        if (this.cantidad == 0 || restante > this.monto * cantidad) {
            EventConcluido evt = new EventConcluido(false, "", this);
            this.notificarBilleteConcluido10(evt);
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void manejarRetiro(int restante, String acumulado) {
        int cantidadBilletes = Math.min(cantidad, restante / monto);
        int resto = restante - cantidadBilletes * monto;

        if (cantidadBilletes > 0) {        
             acumulado = acumulado + (cantidad-cantidadBilletes) + "-" + monto + ",";
            System.out.println("Entregar " + cantidadBilletes + " billetes de $" + monto);
            EventAddBillete addBillete = new EventAddBillete(monto, cantidadBilletes, this);
            this.notificarBillete10(addBillete);
        }

        /* if (resto > 0 && nextHandler != null) {
            nextHandler.retirarBilletes(resto);
        }*/
        if (resto == 0) {
            System.out.println("Se concluyo en el Manejador billete de Diez");
            EventConcluido evt = new EventConcluido(true, acumulado, this);
            this.notificarBilleteConcluido10(evt);
        }
    }

    public void addMyEventListener(ComunicationListener listener) {
        listenerList.add(ComunicationListener.class, listener);
    }

    public void removeMyEventListener(ComunicationListener listener) {
        listenerList.remove(ComunicationListener.class, listener);
    }

    void notificarBillete10(EventAddBillete evt) {
        Object[] listeners = listenerList.getListenerList();
        for (int i = 0; i < listeners.length; i = i + 2) {
            if (listeners[i] == ComunicationListener.class) {
                ((ComunicationListener) listeners[i + 1]).onAddBillete(evt);
            }
        }
    }

    void notificarBilleteConcluido10(EventConcluido evt) {
        Object[] listeners = listenerList.getListenerList();
        for (int i = 0; i < listeners.length; i = i + 2) {
            if (listeners[i] == ComunicationListener.class) {
                ((ComunicationListener) listeners[i + 1]).onConcluido(evt);
            }
        }
    }
}
