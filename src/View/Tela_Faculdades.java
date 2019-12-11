/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.FaculdadesBEAN;
import Controller.Controle;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author humbe
 */
public class Tela_Faculdades extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel modelo;
    static Controle controle = new Controle();
    static Timestamp horalocal = Timestamp.valueOf(LocalDateTime.now());

    public Tela_Faculdades() {
        initComponents();
        ativado.setEnabled(false);
        desativado.setEnabled(false);
        modelo = (javax.swing.table.DefaultTableModel) TabelaContatosCad.getModel();

        List<FaculdadesBEAN> listfaculdades = controle.listaFaculdades();

        preencher_tabela(listfaculdades);
    }

    @SuppressWarnings("unchecked")
    public void preencher_tabela(List<FaculdadesBEAN> listFaculdades) {

        modelo.setNumRows(0);
        try {
            for (FaculdadesBEAN facul : listFaculdades) {
                if (facul.getSituacaoFaculdade() == 1) {
                    modelo.addRow(new Object[]{facul.getIdFaculdade(), facul.getDescricaoFaculdade(), facul.getSituacaoFaculdade()});
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ativado = new javax.swing.JRadioButton();
        desativado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaContatosCad = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        inativo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Descrição da faculdade:");

        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        id.setEditable(false);
        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Situação:");

        buttonGroup1.add(ativado);
        ativado.setText("Ativado");
        ativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(desativado);
        desativado.setText("Desativado");

        TabelaContatosCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição da faculdade", "Situação", "Ultima atualização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaContatosCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaContatosCadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaContatosCad);

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Desativar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        inativo.setText("Mostrar inativos");
        inativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ativado)
                        .addGap(18, 18, 18)
                        .addComponent(desativado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inativo)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ativado)
                            .addComponent(desativado))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inativo)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jButton1)
                    .addContainerGap(259, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void ativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativadoActionPerformed

    private void TabelaContatosCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaContatosCadMouseClicked
        ativado.setEnabled(true);
        desativado.setEnabled(true);
        int linhaEditora = TabelaContatosCad.getSelectedRow();
        id.setText(TabelaContatosCad.getValueAt(linhaEditora, 0).toString());
        descricao.setText(TabelaContatosCad.getValueAt(linhaEditora, 1).toString());
        if (TabelaContatosCad.getValueAt(linhaEditora, 2).equals(1)) {
            ativado.setSelected(true);
        } else {
            desativado.setSelected(true);
        }

    }//GEN-LAST:event_TabelaContatosCadMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Nao existe
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        id.setText("");
        descricao.setText("");
        ativado.setEnabled(false);
        desativado.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (id.getText().isEmpty()) {
            if (descricao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Campo vazio, por favor preencher!");
            } else {
                FaculdadesBEAN facul = new FaculdadesBEAN(0, descricao.getText(), 1, horalocal);
                controle.addFaculdade(facul);
                descricao.setText("");
                List<FaculdadesBEAN> listfaculdades = controle.listaFaculdades();
                preencher_tabela(listfaculdades);
            }
        } else {

            if (descricao.getText().isEmpty() || ativado.getText().isEmpty() || desativado
                    .getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Campo vazio, por favor preencher!");
            } else {
                if (ativado.isSelected()) {
                    FaculdadesBEAN facul = new FaculdadesBEAN(Integer.parseInt(id.getText()), descricao.getText(), 1, horalocal);
                    controle.updateFaculdade(facul);
                } else {
                    FaculdadesBEAN facul = new FaculdadesBEAN(Integer.parseInt(id.getText()), descricao.getText(), 0, horalocal);
                    controle.updateFaculdade(facul);
                }
                id.setText("");
                descricao.setText("");

                List<FaculdadesBEAN> listfaculdades = controle.listaFaculdades();

                preencher_tabela(listfaculdades);
                ativado.setEnabled(false);
                desativado.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (desativado.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Faculdade já desativada!");
        } else {
            if (id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Selecione na tabela a faculdade que deseja desativar!");
            } else {

                FaculdadesBEAN facul = new FaculdadesBEAN(Integer.parseInt(id.getText()), descricao.getText(), 0, horalocal);
                controle.updateFaculdade(facul);

            }
            List<FaculdadesBEAN> listfaculdades = controle.listaFaculdades();

            preencher_tabela(listfaculdades);
            id.setText("");
            descricao.setText("");
            ativado.setEnabled(false);
            desativado.setEnabled(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void inativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inativoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Faculdades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Faculdades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Faculdades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Faculdades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Faculdades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaContatosCad;
    private javax.swing.JRadioButton ativado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton desativado;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox inativo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
