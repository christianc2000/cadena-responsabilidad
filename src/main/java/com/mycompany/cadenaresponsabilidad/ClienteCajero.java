/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadenaresponsabilidad;

import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteCien;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteCincuenta;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteDiez;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteDosciento;
import com.mycompany.cadenaresponsabilidad.cajero.ManejadorBilleteVeinte;
import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class ClienteCajero extends javax.swing.JFrame implements ComunicationListener {

    LinkedList<EventAddBillete> elementos = new LinkedList<EventAddBillete>();
    CadenaResponsabilidad cr;
    ManejadorBilleteDosciento manejadorDosciento;
    ManejadorBilleteCien manejadorCien;
    ManejadorBilleteCincuenta manejadorCincuenta;
    ManejadorBilleteVeinte manejadorVeinte;
    ManejadorBilleteDiez manejadorDiez;

    /**
     * Creates new form ClienteCajero
     */
    public ClienteCajero() {
        this.cr = new CadenaResponsabilidad();
        cr.iniciar();
        manejadorDosciento = cr.handlerDosciento;
        manejadorDosciento.addMyEventListener(this);
        manejadorCien = cr.handlerCien;
        manejadorCien.addMyEventListener(this);
        manejadorCincuenta = cr.handlerCincuenta;
        manejadorCincuenta.addMyEventListener(this);
        manejadorVeinte = cr.handlerVeinte;
        manejadorVeinte.addMyEventListener(this);
        manejadorDiez = cr.handlerDiez;
        manejadorDiez.addMyEventListener(this);
        initComponents();
        label200.setText(String.valueOf(manejadorDosciento.getCantidad()));
        label100.setText(String.valueOf(manejadorCien.getCantidad()));
        label50.setText(String.valueOf(manejadorCincuenta.getCantidad()));
        label20.setText(String.valueOf(manejadorVeinte.getCantidad()));
        label10.setText(String.valueOf(manejadorDiez.getCantidad()));
        labelTotal.setText(String.valueOf(manejadorDosciento.montoTotal() + manejadorCien.montoTotal() + manejadorCincuenta.montoTotal() + manejadorVeinte.montoTotal() + manejadorDiez.montoTotal()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRestante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCajero = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label200 = new javax.swing.JLabel();
        label100 = new javax.swing.JLabel();
        label20 = new javax.swing.JLabel();
        label50 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monto:");

        txtRestante.setText("0");
        txtRestante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAJERO");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Retirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtRestante)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        panelCajero.setBackground(new java.awt.Color(255, 255, 255));

        txtAreaResultado.setColumns(20);
        txtAreaResultado.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultado);

        jLabel3.setText("200 =");

        jLabel4.setText("100 =");

        jLabel5.setText("50 =");

        jLabel6.setText("20 =");

        jLabel7.setText("10 =");

        label200.setText("0");

        label100.setText("0");

        label20.setText("0");

        label50.setText("0");

        label10.setText("0");

        jLabel8.setText("TOTAL =");

        labelTotal.setText("0");

        btnReiniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCajeroLayout = new javax.swing.GroupLayout(panelCajero);
        panelCajero.setLayout(panelCajeroLayout);
        panelCajeroLayout.setHorizontalGroup(
            panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajeroLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10)
                    .addGroup(panelCajeroLayout.createSequentialGroup()
                        .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label200)
                            .addComponent(label100)
                            .addComponent(label20)
                            .addComponent(label50))
                        .addGap(38, 38, 38)
                        .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReiniciar)
                            .addGroup(panelCajeroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotal)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCajeroLayout.setVerticalGroup(
            panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCajeroLayout.createSequentialGroup()
                        .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(label200)
                            .addComponent(jLabel8)
                            .addComponent(labelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCajeroLayout.createSequentialGroup()
                                .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(label100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(label50))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(label20)))
                            .addComponent(btnReiniciar))
                        .addGap(10, 10, 10)
                        .addGroup(panelCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(label10)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cr.retirarCajero(Integer.parseInt(txtRestante.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        cr.reinicia();
        label200.setText(String.valueOf(manejadorDosciento.getCantidad()));
        label100.setText(String.valueOf(manejadorCien.getCantidad()));
        label50.setText(String.valueOf(manejadorCincuenta.getCantidad()));
        label20.setText(String.valueOf(manejadorVeinte.getCantidad()));
        label10.setText(String.valueOf(manejadorDiez.getCantidad()));
        labelTotal.setText(String.valueOf(manejadorDosciento.montoTotal() + manejadorCien.montoTotal() + manejadorCincuenta.montoTotal() + manejadorVeinte.montoTotal() + manejadorDiez.montoTotal()));

    }//GEN-LAST:event_btnReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label100;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label200;
    private javax.swing.JLabel label50;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelCajero;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextField txtRestante;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onAddBillete(EventAddBillete evento) {
        elementos.add(evento);
    }

    public String convertirString(LinkedList<EventAddBillete> l) {
        String value = "";
        for (int i = 0; i < l.size(); i++) {
            value = value + l.get(i).cantidad + " de " + l.get(i).monto + "bs |";
        }
        return value;
    }

    @Override
    public void onConcluido(EventConcluido evento) {
        if (evento.isConcluido()) {
            txtAreaResultado.setText(convertirString(elementos));
            String montos[] = evento.getAcumulado().split(",");
            cr.extraerMontos(montos);
            for (int i = 0; i < montos.length; i++) {
                String value[] = montos[i].split("-");
                if (value[1].equals("200")) {
                    label200.setText(value[0]);
                }
                if (value[1].equals("100")) {
                    label100.setText(value[0]);
                }
                if (value[1].equals("50")) {
                    label50.setText(value[0]);
                }
                if (value[1].equals("20")) {
                    label20.setText(value[0]);
                }
                if (value[1].equals("10")) {
                    label10.setText(value[0]);
                }
            }
            labelTotal.setText(String.valueOf(manejadorDosciento.montoTotal() + manejadorCien.montoTotal() + manejadorCincuenta.montoTotal() + manejadorVeinte.montoTotal() + manejadorDiez.montoTotal()));
            System.out.println("evento acumulado: " + evento.getAcumulado());
        } else {
            txtAreaResultado.setText("NO ALCANZAN LOS CORTES PARA SU PETICIÓN");
        }
        elementos.clear();
    }

}