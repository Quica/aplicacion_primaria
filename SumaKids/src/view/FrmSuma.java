/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Victor Diaz
 */
public class FrmSuma extends javax.swing.JFrame {
    fondoPanel fondo = new fondoPanel();
    Sleep slepp = new Sleep();

    /**
     * Creates new form FrmSuma
     */
    public FrmSuma() {
        this.setContentPane(fondo);
        initComponents();
        panelProceso.setVisible(false);
        txtUnidadesUp.setVisible(false);
        txtUnidadesDown.setVisible(false);
        txtDecenasUp.setVisible(false);
        txtDecenasDown.setVisible(false);
        txtCentenasUp.setVisible(false);
        txtCentenasDown.setVisible(false);
        lbMas.setVisible(false);
        jSeparator1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        panelProceso = new javax.swing.JPanel();
        lblLlevaUnidadnesMil = new javax.swing.JLabel();
        lblLlevaCentenas = new javax.swing.JLabel();
        lblLlevaDecenas = new javax.swing.JLabel();
        txtCentenasUp = new javax.swing.JTextField();
        txtDecenasUp = new javax.swing.JTextField();
        txtUnidadesUp = new javax.swing.JTextField();
        txtCentenasDown = new javax.swing.JTextField();
        txtDecenasDown = new javax.swing.JTextField();
        txtUnidadesDown = new javax.swing.JTextField();
        lblRespuestaUnidadesMil = new javax.swing.JLabel();
        lblRespuestaCentenas = new javax.swing.JLabel();
        lblRespuestaDecenas = new javax.swing.JLabel();
        lblRespuestaUnidades = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbMas = new javax.swing.JLabel();

        jLabel7.setText("jLabel3");

        jLabel8.setText("jLabel3");

        jLabel10.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtNum1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtNum1.setForeground(new java.awt.Color(74, 35, 90));
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });

        txtNum2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtNum2.setForeground(new java.awt.Color(74, 35, 90));
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 52, 131));
        jLabel2.setText("Segundo Numero: ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton1.setFont(new java.awt.Font("Curlz MT", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(108, 52, 131));
        jButton1.setText("Hacer la Suma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(108, 52, 131));
        jLabel13.setText("Primer Numero:");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLlevaUnidadnesMil.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblLlevaUnidadnesMil.setForeground(new java.awt.Color(255, 51, 51));
        lblLlevaUnidadnesMil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblLlevaCentenas.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblLlevaCentenas.setForeground(new java.awt.Color(255, 51, 51));
        lblLlevaCentenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblLlevaDecenas.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblLlevaDecenas.setForeground(new java.awt.Color(255, 51, 51));
        lblLlevaDecenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtCentenasUp.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtCentenasUp.setForeground(new java.awt.Color(74, 35, 90));
        txtCentenasUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDecenasUp.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtDecenasUp.setForeground(new java.awt.Color(74, 35, 90));
        txtDecenasUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtUnidadesUp.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtUnidadesUp.setForeground(new java.awt.Color(74, 35, 90));
        txtUnidadesUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUnidadesUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadesUpActionPerformed(evt);
            }
        });

        txtCentenasDown.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtCentenasDown.setForeground(new java.awt.Color(74, 35, 90));
        txtCentenasDown.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDecenasDown.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtDecenasDown.setForeground(new java.awt.Color(74, 35, 90));
        txtDecenasDown.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtUnidadesDown.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtUnidadesDown.setForeground(new java.awt.Color(74, 35, 90));
        txtUnidadesDown.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblRespuestaUnidadesMil.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblRespuestaUnidadesMil.setForeground(new java.awt.Color(0, 0, 255));
        lblRespuestaUnidadesMil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRespuestaCentenas.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblRespuestaCentenas.setForeground(new java.awt.Color(0, 0, 255));
        lblRespuestaCentenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRespuestaDecenas.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblRespuestaDecenas.setForeground(new java.awt.Color(0, 0, 255));
        lblRespuestaDecenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRespuestaUnidades.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblRespuestaUnidades.setForeground(new java.awt.Color(0, 0, 255));
        lblRespuestaUnidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbMas.setFont(new java.awt.Font("Lucida Grande", 0, 50)); // NOI18N
        lbMas.setText("+");

        javax.swing.GroupLayout panelProcesoLayout = new javax.swing.GroupLayout(panelProceso);
        panelProceso.setLayout(panelProcesoLayout);
        panelProcesoLayout.setHorizontalGroup(
            panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesoLayout.createSequentialGroup()
                        .addComponent(lblRespuestaUnidadesMil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRespuestaCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRespuestaDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRespuestaUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesoLayout.createSequentialGroup()
                        .addComponent(txtCentenasDown, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDecenasDown, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidadesDown, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesoLayout.createSequentialGroup()
                        .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProcesoLayout.createSequentialGroup()
                                .addComponent(lbMas)
                                .addGap(25, 25, 25)
                                .addComponent(txtCentenasUp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDecenasUp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProcesoLayout.createSequentialGroup()
                                .addComponent(lblLlevaUnidadnesMil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLlevaCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLlevaDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidadesUp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );
        panelProcesoLayout.setVerticalGroup(
            panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLlevaDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLlevaCentenas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLlevaUnidadnesMil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProcesoLayout.createSequentialGroup()
                        .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCentenasUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidadesUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDecenasUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCentenasDown, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDecenasDown, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidadesDown, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbMas))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(panelProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRespuestaUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRespuestaDecenas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRespuestaUnidadesMil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRespuestaCentenas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(panelProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //int num1 = Integer.parseInt(txtNum1.getText());
        limpiarCampos();
        String num1 = txtNum1.getText();
        String num2 = txtNum2.getText();
        
        if(num1.equals("") || num2.equals("")){
            JOptionPane.showMessageDialog(this,"Recuerda que debes ingresar dos numeros");
        }
        else{            
            if((Comunes.isNumeric(num1)) && (Comunes.isNumeric(num2))){
                LongitudCadena longitudCadena = new LongitudCadena();
                int largoNumero1=longitudCadena.cantidadCacteres(num1);
                int largoNumero2=longitudCadena.cantidadCacteres(num2);
                int longMayor;
                /*Antes de hacer las operancion organizamos lo numeros*/
                panelProceso.setVisible(true);
                    if (largoNumero1 >= largoNumero2) {
                    longMayor = largoNumero1;
                    String unidadesUp = String.valueOf(num1.charAt(num1.length() - 1));
                    String unidadesDown = String.valueOf(num2.charAt(num2.length() - 1));
                    txtUnidadesUp.setVisible(true);
                    txtUnidadesUp.setText(unidadesUp);
                    txtUnidadesDown.setVisible(true);
                    txtUnidadesDown.setText(unidadesDown);
                    if (largoNumero1 == 2 || largoNumero1 == 3) {
                        String decenasUp = String.valueOf(num1.charAt(num1.length() - 2));
                        txtDecenasUp.setVisible(true);
                        txtDecenasUp.setText(decenasUp);
                    }
                    if (largoNumero1 == 3) {
                        String centenasUp = String.valueOf(num1.charAt(num1.length() - 3));
                        txtCentenasUp.setVisible(true);
                        txtCentenasUp.setText(centenasUp);
                    }
                    if (largoNumero2 == 2 || largoNumero2 == 3) {
                        String decenasDown = String.valueOf(num2.charAt(num2.length() - 2));
                        txtDecenasDown.setVisible(true);
                        txtDecenasDown.setText(decenasDown);
                    }
                    if (largoNumero2 == 3) {
                        String centenasDown = String.valueOf(num2.charAt(num2.length() - 3));
                        txtCentenasDown.setVisible(true);
                        txtCentenasDown.setText(centenasDown);
                    }
                } else {
                    longMayor = largoNumero2;
                    String unidadesUp = String.valueOf(num2.charAt(num2.length() - 1));
                    String unidadesDown = String.valueOf(num1.charAt(num1.length() - 1));
                    txtUnidadesUp.setVisible(true);
                    txtUnidadesUp.setText(unidadesUp);
                    txtUnidadesDown.setVisible(true);
                    txtUnidadesDown.setText(unidadesDown);
                    if (largoNumero2 == 2 || largoNumero2 == 3) {
                        String decenasUp = String.valueOf(num2.charAt(num2.length() - 2));
                        txtDecenasUp.setVisible(true);
                        txtDecenasUp.setText(decenasUp);
                    }
                    if (largoNumero2 == 3) {
                        String centenasUp = String.valueOf(num2.charAt(num2.length() - 3));
                        txtCentenasUp.setVisible(true);
                        txtCentenasUp.setText(centenasUp);
                    }
                    if (largoNumero1 == 2 || largoNumero1 == 3) {
                        String decenasDown = String.valueOf(num1.charAt(num1.length() - 2));
                        txtDecenasDown.setVisible(true);
                        txtDecenasDown.setText(decenasDown);
                    }
                    if (largoNumero1 == 3) {
                        String centenasDown = String.valueOf(num1.charAt(num1.length() - 3));
                        txtCentenasDown.setVisible(true);
                        txtCentenasDown.setText(centenasDown);
                    }
                }
                lbMas.setVisible(true);
                jSeparator1.setVisible(true);
                JOptionPane.showMessageDialog(null, "Para sumar ubica el numero más largo arriba");

                slepp.sleepMensaje(2000);

                /*proceso de Unidades*/
                int uniup = Integer.parseInt(txtUnidadesUp.getText());
                int unidown = Integer.parseInt(txtUnidadesDown.getText());
                SumaNum sumaNum = new SumaNum();
                int resultado = sumaNum.sumarDos(uniup, unidown);
                String resultadoCadenaU = String.valueOf(resultado);
                int llevaDecenas = 0;
                int llevaCentenas = 0;
                int llevaUnidadesMil = 0;
                JOptionPane.showMessageDialog(null, "¡Listo! Ahora Sumemos de izquierda a derecha");
                slepp.sleepMensaje(1500);
                String mensaje;

                if (resultado <= 9) {
                    mensaje = "Al sumar: " + uniup + " + " + unidown + " = " + resultado + "\nUbica las unidades debajo de los números que sumaste";
                    lblRespuestaUnidades.setText(resultadoCadenaU);
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    mensaje = "Al sumar: " + uniup + " + " + unidown + " = " + resultado + "\nUbica las unidades debajo de los números que sumaste\nLas decenas arriba de los números que vas a sumar después";
                    lblLlevaDecenas.setText(String.valueOf(resultadoCadenaU.charAt(resultadoCadenaU.length() - 2)));
                    lblRespuestaUnidades.setText(String.valueOf(resultadoCadenaU.charAt(resultadoCadenaU.length() - 1)));
                    llevaDecenas = Character.getNumericValue(resultadoCadenaU.charAt(resultadoCadenaU.length() - 2));
                    JOptionPane.showMessageDialog(null, mensaje);
                }

                slepp.sleepMensaje(2500);
                /*proceso de Decenas*/
                if (longMayor == 2 || longMayor == 3 || llevaDecenas > 0) {
                    int decup = (txtDecenasUp.getText().length() == 0) ? 0 : Integer.parseInt(txtDecenasUp.getText());
                    int decdown = (txtDecenasDown.getText().length() == 0) ? 0 : Integer.parseInt(txtDecenasDown.getText());
                    int resultadoD = sumaNum.sumarTres(decup, decdown, llevaDecenas);
                    String resultadoCadenaD = String.valueOf(resultadoD);
                    if (resultadoD <= 9) {
                        if (llevaDecenas > 0) {
                            mensaje = "Ahora sumemos: " + llevaDecenas + " + " + decup + " + " + decdown + " = " + resultadoD + "\nRecuerda poner el número de las unidades debajo de los números sumados";
                        } else {
                            mensaje = "Ahora sumemos: " + decup + " + " + decdown + " = " + resultadoD + "\nRecuerda poner el número de las unidades debajo de los números sumados";
                        }
                        lblRespuestaDecenas.setText(resultadoCadenaD);
                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        if (llevaDecenas > 0) {
                            mensaje = "Ahora sumemos: " + llevaDecenas + " + " + decup + " + " + decdown + " = " + resultadoD + "\nRecuerda poner el número de las unidades debajo de los números sumados\nLas decenas arriba de los números que vamos a sumar después";
                        } else {
                            mensaje = "Ahora sumemos: " + decup + " + " + decdown + " = " + resultadoD + "\nRecuerda poner el número de las unidades debajo de los números sumados\nLas decenas arriba de los números que vamos a sumar después";
                        }
                        lblLlevaCentenas.setText(String.valueOf(resultadoCadenaD.charAt(resultadoCadenaD.length() - 2)));
                        lblRespuestaDecenas.setText(String.valueOf(resultadoCadenaD.charAt(resultadoCadenaD.length() - 1)));
                        llevaCentenas = Character.getNumericValue(resultadoCadenaD.charAt(resultadoCadenaD.length() - 2));
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                }
                slepp.sleepMensaje(2500);
                /*proceso de Centenas*/
                if (longMayor == 3 || llevaCentenas > 0) {
                    int cecup = (txtCentenasUp.getText().length() == 0) ? 0 : Integer.parseInt(txtCentenasUp.getText());
                    int cecdown = (txtCentenasDown.getText().length() == 0) ? 0 : Integer.parseInt(txtCentenasDown.getText());
                    int resultadoC = sumaNum.sumarTres(cecup, cecdown, llevaCentenas);
                    String resultadoCadenaC = String.valueOf(resultadoC);
                    if (resultadoC <= 9) {
                        if (llevaCentenas > 0) {
                            mensaje = "Ahora sumemos: " + llevaCentenas + " + " + cecup + " + " + cecdown + " = " + resultadoC + "\nRecuerda poner el número de las unidades debajo de los números sumados";
                        } else {
                            mensaje = "Ahora sumemos: " + cecup + " + " + cecdown + " = " + resultadoC + "\nRecuerda poner el número de las unidades debajo de los números sumados";
                        }
                        lblRespuestaCentenas.setText(resultadoCadenaC);
                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        if (llevaCentenas > 0) {
                            mensaje = "Ahora sumemos: " + llevaCentenas + " + " + cecup + " + " + cecdown + " = " + resultadoC + "\nRecuerda poner el número de las unidades debajo de los números sumados\nLas decenas arriba de los números que vamos a sumar después";
                        } else {
                            mensaje = "Ahora sumemos: " + cecup + " + " + cecdown + " = " + resultadoC + "\nRecuerda poner el número de las unidades debajo de los números sumados\nLas decenas arriba de los números que vamos a sumar después";
                        }
                        lblLlevaUnidadnesMil.setText(String.valueOf(resultadoCadenaC.charAt(resultadoCadenaC.length() - 2)));
                        lblRespuestaCentenas.setText(String.valueOf(resultadoCadenaC.charAt(resultadoCadenaC.length() - 1)));
                        lblRespuestaUnidadesMil.setText(String.valueOf(resultadoCadenaC.charAt(resultadoCadenaC.length() - 2)));
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                }
                slepp.sleepMensaje(2500);
                JOptionPane.showMessageDialog(null, "¡FELICIDADES, APRENDISTE A SUMAR NUMEROS DE HASTA 3 CIFRAS!\nSIGUE JUGANDO Y APRENDIENDO");
            }else{
               JOptionPane.showMessageDialog(this, "Recuerda que debes ingresar números");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUnidadesUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadesUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesUpActionPerformed

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        // TODO add your handling code here:
        if(txtNum1.getText().length()>=3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
        // TODO add your handling code here:
        if(txtNum2.getText().length()>=3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum2KeyTyped

    public void limpiarCampos(){
        txtUnidadesUp.setText("");
        txtUnidadesDown.setText("");
        lblRespuestaUnidades.setText("");
        
        txtDecenasUp.setText("");
        txtDecenasDown.setText("");
        lblLlevaDecenas.setText("");
        lblRespuestaDecenas.setText("");
        
        txtCentenasUp.setText("");
        txtCentenasDown.setText("");
        lblLlevaCentenas.setText("");
        lblRespuestaCentenas.setText("");
        
        lblLlevaUnidadnesMil.setText("");
        lblRespuestaUnidadesMil.setText("");
    }
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
            java.util.logging.Logger.getLogger(FrmSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSuma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMas;
    private javax.swing.JLabel lblLlevaCentenas;
    private javax.swing.JLabel lblLlevaDecenas;
    private javax.swing.JLabel lblLlevaUnidadnesMil;
    private javax.swing.JLabel lblRespuestaCentenas;
    private javax.swing.JLabel lblRespuestaDecenas;
    private javax.swing.JLabel lblRespuestaUnidades;
    private javax.swing.JLabel lblRespuestaUnidadesMil;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelProceso;
    private javax.swing.JTextField txtCentenasDown;
    private javax.swing.JTextField txtCentenasUp;
    private javax.swing.JTextField txtDecenasDown;
    private javax.swing.JTextField txtDecenasUp;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtUnidadesDown;
    private javax.swing.JTextField txtUnidadesUp;
    // End of variables declaration//GEN-END:variables

    class fondoPanel extends JPanel{
        private  Image imagen;
        @Override
        public void paint(Graphics g){
           imagen = new ImageIcon(getClass().getResource("/images/Fondo.png")).getImage(); 
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           panel1.setOpaque(false);
           panelProceso.setOpaque(false);
           super.paint(g);
        }
    }

}
