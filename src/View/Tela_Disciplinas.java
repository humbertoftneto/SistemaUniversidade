/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DisciplinasBEAN;
import Model.FaculdadesBEAN;
import Controller.Controle;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Tela_Disciplinas extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel modelo;
    static Controle controle = new Controle();
    static Timestamp horalocal = Timestamp.valueOf(LocalDateTime.now());

    public Tela_Disciplinas() {
        initComponents();
        ativado.setEnabled(false);
        desativado.setEnabled(false);
        modelo = (javax.swing.table.DefaultTableModel) TabelaContatosCad.getModel();
        faculdade.removeAllItems();
        ArrayList<FaculdadesBEAN> listafaculdade = controle.listaFaculdades();

        for (FaculdadesBEAN facul : listafaculdade) {

            faculdade.addItem(facul.getDescricaoFaculdade());
        }
        List<DisciplinasBEAN> listdisciplinas = controle.listaDisciplinas();
        preencher_tabela(listdisciplinas);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void preencher_tabela(List<DisciplinasBEAN> listDisciplinas) {

        modelo.setNumRows(0);
        try {
            if (inativo.isSelected() == false) {
                for (DisciplinasBEAN disc : listDisciplinas) {
                    if (disc.getSituacaoDisciplina() == 1) {
                        modelo.addRow(new Object[]{disc.getIdDisciplina(), disc.getDescricaoDisciplina(), disc.getSituacaoDisciplina(), disc.getUltimaAtualizacao(), disc.getIdFaculdade()});
                    }
                }
            } else {
                for (DisciplinasBEAN disc : listDisciplinas) {
                    if (disc.getSituacaoDisciplina() == 0) {
                        modelo.addRow(new Object[]{disc.getIdDisciplina(), disc.getDescricaoDisciplina(), disc.getSituacaoDisciplina(), disc.getUltimaAtualizacao(), disc.getIdFaculdade()});
                    }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaContatosCad = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        faculdade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ativado = new javax.swing.JRadioButton();
        desativado = new javax.swing.JRadioButton();
        inativo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Descrição da disciplina:");

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

        TabelaContatosCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição da disciplina", "Situação", "Ultima atualização", "Faculdade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Desativar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        faculdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculdadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Faculdade:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Situação:");

        buttonGroup1.add(ativado);
        ativado.setText("Ativado");
        ativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(desativado);
        desativado.setText("Desativado");
        desativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativadoActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(faculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(314, 314, 314)
                                .addComponent(inativo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(215, 215, 215)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ativado)
                                        .addGap(18, 18, 18)
                                        .addComponent(desativado)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ativado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(faculdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(desativado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inativo)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int id_faculdade = 0;
        if (desativado.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Disciplina já desativada!");
        } else {
            if (id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Selecione na tabela a disciplina que deseja desativar!");
            } else {
                ArrayList<FaculdadesBEAN> listafaculdade = controle.listaFaculdades();
                for (FaculdadesBEAN facul : listafaculdade) {

                    if (faculdade.getSelectedItem().equals(facul.getDescricaoFaculdade())) {
                        id_faculdade = facul.getIdFaculdade();
                    }
                }
                DisciplinasBEAN disc = new DisciplinasBEAN(Integer.parseInt(id.getText()), descricao.getText(), 0, horalocal, id_faculdade);
                controle.updateDisciplina(disc);

            }
            List<DisciplinasBEAN> listdisciplinas = controle.listaDisciplinas();

            preencher_tabela(listdisciplinas);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        id.setText("");
        descricao.setText("");
        ativado.setEnabled(false);
        desativado.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id_faculdade = 0;
        if (id.getText().isEmpty()) {
            if (descricao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Campo vazio, por favor preencher!");
            } else {
                ArrayList<FaculdadesBEAN> listafaculdade = controle.listaFaculdades();
                for (FaculdadesBEAN facul : listafaculdade) {

                    if (faculdade.getSelectedItem().equals(facul.getDescricaoFaculdade())) {
                        id_faculdade = facul.getIdFaculdade();
                    }
                }
                DisciplinasBEAN disc = new DisciplinasBEAN(0, descricao.getText(), 1, horalocal, id_faculdade);
                controle.addDisciplina(disc);
                descricao.setText("");
                List<DisciplinasBEAN> listdisciplinas = controle.listaDisciplinas();

                preencher_tabela(listdisciplinas);
            }
        } else {
            if (descricao.getText().isEmpty() || ativado.getText().isEmpty() || desativado
                    .getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Campo vazio, por favor preencher!");
            } else {
                ArrayList<FaculdadesBEAN> listafaculdade = controle.listaFaculdades();
                for (FaculdadesBEAN facul : listafaculdade) {

                    if (faculdade.getSelectedItem().equals(facul.getDescricaoFaculdade())) {
                        id_faculdade = facul.getIdFaculdade();
                    }
                }
                if (ativado.isSelected()) {
                    DisciplinasBEAN disc = new DisciplinasBEAN(Integer.parseInt(id.getText()), descricao.getText(), 1, horalocal, id_faculdade);
                    controle.updateDisciplina(disc);
                } else {
                    DisciplinasBEAN disc = new DisciplinasBEAN(Integer.parseInt(id.getText()), descricao.getText(), 0, horalocal, id_faculdade);
                    controle.updateDisciplina(disc);
                }
                id.setText("");
                descricao.setText("");
                ativado.setEnabled(false);
                desativado.setEnabled(false);
                List<DisciplinasBEAN> listdisciplinas = controle.listaDisciplinas();

                preencher_tabela(listdisciplinas);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void faculdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculdadeActionPerformed

    }//GEN-LAST:event_faculdadeActionPerformed

    private void ativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativadoActionPerformed

    private void desativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desativadoActionPerformed

    private void inativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativoActionPerformed
        List<DisciplinasBEAN> listdisciplinas = controle.listaDisciplinas();
        preencher_tabela(listdisciplinas);
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
            java.util.logging.Logger.getLogger(Tela_Disciplinas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Disciplinas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Disciplinas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Disciplinas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Disciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaContatosCad;
    private javax.swing.JRadioButton ativado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton desativado;
    private javax.swing.JTextField descricao;
    private javax.swing.JComboBox<String> faculdade;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox inativo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
