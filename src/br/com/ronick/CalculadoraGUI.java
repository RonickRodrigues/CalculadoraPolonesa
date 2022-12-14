package br.com.ronick;

public class CalculadoraGUI extends javax.swing.JFrame {

    CalculadoraEngine ce;
    String numero = "0";
    int doisPonto = 0;

    public String imprimeTela(String numero) {
        if ("0".equals(this.numero)) {
            this.numero = numero;
            tTela.setText(this.numero);
        } else {
            this.numero = this.numero + numero;
            tTela.setText(this.numero);
        }
        return this.numero;
    }
    
    public void imprimeResultado() {
        tTela.setText(String.format(ce.getArrayDeNumero()[0] + ""));
        numero = String.format(ce.getArrayDeNumero()[0] + "");
    }

    public CalculadoraGUI() {
        initComponents();
        ce = new CalculadoraEngine();
        tTela.setText(String.format(ce.getArrayDeNumero()[0] + ""));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tTela = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bBotao0 = new javax.swing.JButton();
        bBotao1 = new javax.swing.JButton();
        bBotao2 = new javax.swing.JButton();
        bBotao3 = new javax.swing.JButton();
        bBotao4 = new javax.swing.JButton();
        bBotao5 = new javax.swing.JButton();
        bBotao6 = new javax.swing.JButton();
        bBotao7 = new javax.swing.JButton();
        bBotao8 = new javax.swing.JButton();
        bBotao9 = new javax.swing.JButton();
        bBotaoC = new javax.swing.JButton();
        bBotaoDel = new javax.swing.JButton();
        bBotaoSobre = new javax.swing.JButton();
        bBotaoPonto = new javax.swing.JButton();
        bBotaoRaiz = new javax.swing.JButton();
        bBotaoDivisao = new javax.swing.JButton();
        bBotaoMult = new javax.swing.JButton();
        bBotaoSubtracao = new javax.swing.JButton();
        bBotaoSoma = new javax.swing.JButton();
        bBotaoEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tTela)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tTela, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        bBotao0.setText("0");
        bBotao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao0ActionPerformed(evt);
            }
        });

        bBotao1.setText("1");
        bBotao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao1ActionPerformed(evt);
            }
        });

        bBotao2.setText("2");
        bBotao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao2ActionPerformed(evt);
            }
        });

        bBotao3.setText("3");
        bBotao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao3ActionPerformed(evt);
            }
        });

        bBotao4.setText("4");
        bBotao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao4ActionPerformed(evt);
            }
        });

        bBotao5.setText("5");
        bBotao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao5ActionPerformed(evt);
            }
        });

        bBotao6.setText("6");
        bBotao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao6ActionPerformed(evt);
            }
        });

        bBotao7.setText("7");
        bBotao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao7ActionPerformed(evt);
            }
        });

        bBotao8.setText("8");
        bBotao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao8ActionPerformed(evt);
            }
        });

        bBotao9.setText("9");
        bBotao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotao9ActionPerformed(evt);
            }
        });

        bBotaoC.setText("C");
        bBotaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoCActionPerformed(evt);
            }
        });

        bBotaoDel.setText("Del");
        bBotaoDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoDelActionPerformed(evt);
            }
        });

        bBotaoSobre.setText("1/x");
        bBotaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoSobreActionPerformed(evt);
            }
        });

        bBotaoPonto.setText(".");
        bBotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoPontoActionPerformed(evt);
            }
        });

        bBotaoRaiz.setText("Raiz");
        bBotaoRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoRaizActionPerformed(evt);
            }
        });

        bBotaoDivisao.setText("/");
        bBotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoDivisaoActionPerformed(evt);
            }
        });

        bBotaoMult.setText("*");
        bBotaoMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoMultActionPerformed(evt);
            }
        });

        bBotaoSubtracao.setText("-");
        bBotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoSubtracaoActionPerformed(evt);
            }
        });

        bBotaoSoma.setText("+");
        bBotaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoSomaActionPerformed(evt);
            }
        });

        bBotaoEnter.setText("Enter");
        bBotaoEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBotaoEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bBotaoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotao7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotao1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(bBotaoDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBotaoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(bBotao2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bBotao3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(bBotao5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bBotao6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(bBotao8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bBotao9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bBotao0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBotaoSoma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bBotaoEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotaoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bBotaoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotaoDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotaoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bBotao7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotao9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bBotaoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(bBotaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBotao4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotao5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotao6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBotao3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotao2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bBotao0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bBotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBotaoEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBotao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao0ActionPerformed
        imprimeTela("0");
    }//GEN-LAST:event_bBotao0ActionPerformed

    private void bBotao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao1ActionPerformed
        imprimeTela("1");
    }//GEN-LAST:event_bBotao1ActionPerformed

    private void bBotao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao2ActionPerformed
        imprimeTela("2");
    }//GEN-LAST:event_bBotao2ActionPerformed

    private void bBotao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao3ActionPerformed
        imprimeTela("3");
    }//GEN-LAST:event_bBotao3ActionPerformed

    private void bBotao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao4ActionPerformed
        imprimeTela("4");
    }//GEN-LAST:event_bBotao4ActionPerformed

    private void bBotao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao5ActionPerformed
        imprimeTela("5");
    }//GEN-LAST:event_bBotao5ActionPerformed

    private void bBotao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao6ActionPerformed
        imprimeTela("6");
    }//GEN-LAST:event_bBotao6ActionPerformed

    private void bBotao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao7ActionPerformed
        imprimeTela("7");
    }//GEN-LAST:event_bBotao7ActionPerformed

    private void bBotao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao8ActionPerformed
        imprimeTela("8");
    }//GEN-LAST:event_bBotao8ActionPerformed

    private void bBotao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotao9ActionPerformed
        imprimeTela("9");
    }//GEN-LAST:event_bBotao9ActionPerformed

    private void bBotaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoPontoActionPerformed
        if(doisPonto == 0) {
            imprimeTela(".");
            doisPonto++;
        }
    }//GEN-LAST:event_bBotaoPontoActionPerformed

    private void bBotaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoCActionPerformed
        numero = "0";
        ce.operacaoC();
        tTela.setText(numero);
    }//GEN-LAST:event_bBotaoCActionPerformed

    private void bBotaoDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoDelActionPerformed
        numero = "0";
        tTela.setText(numero);
    }//GEN-LAST:event_bBotaoDelActionPerformed

    private void bBotaoEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoEnterActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.sobeUmNumero();
        numero = "0";
        doisPonto = 0;
        tTela.setText(numero);
    }//GEN-LAST:event_bBotaoEnterActionPerformed

    private void bBotaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoSobreActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.sobreX();
        imprimeResultado();
    }//GEN-LAST:event_bBotaoSobreActionPerformed

    private void bBotaoRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoRaizActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.raiz();
        imprimeResultado();
    }//GEN-LAST:event_bBotaoRaizActionPerformed

    private void bBotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoDivisaoActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.divisao();
        imprimeResultado();
    }//GEN-LAST:event_bBotaoDivisaoActionPerformed

    private void bBotaoMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoMultActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.multiplicacao();
        imprimeResultado();
    }//GEN-LAST:event_bBotaoMultActionPerformed

    private void bBotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoSubtracaoActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.subtracao();
        imprimeResultado();
    }//GEN-LAST:event_bBotaoSubtracaoActionPerformed

    private void bBotaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBotaoSomaActionPerformed
        ce.getArrayDeNumero()[0] = Double.parseDouble(numero);
        ce.soma();
        imprimeResultado();
    }//GEN-LAST:event_bBotaoSomaActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBotao0;
    private javax.swing.JButton bBotao1;
    private javax.swing.JButton bBotao2;
    private javax.swing.JButton bBotao3;
    private javax.swing.JButton bBotao4;
    private javax.swing.JButton bBotao5;
    private javax.swing.JButton bBotao6;
    private javax.swing.JButton bBotao7;
    private javax.swing.JButton bBotao8;
    private javax.swing.JButton bBotao9;
    private javax.swing.JButton bBotaoC;
    private javax.swing.JButton bBotaoDel;
    private javax.swing.JButton bBotaoDivisao;
    private javax.swing.JButton bBotaoEnter;
    private javax.swing.JButton bBotaoMult;
    private javax.swing.JButton bBotaoPonto;
    private javax.swing.JButton bBotaoRaiz;
    private javax.swing.JButton bBotaoSobre;
    private javax.swing.JButton bBotaoSoma;
    private javax.swing.JButton bBotaoSubtracao;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tTela;
    // End of variables declaration//GEN-END:variables
}
