/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad;

import java.util.EventListener;

/**
 *
 * @author Christian
 */
public interface ComunicationListener  extends EventListener{
    void onAddBillete(EventAddBillete evento);
    void onConcluido(EventConcluido evento);
}
