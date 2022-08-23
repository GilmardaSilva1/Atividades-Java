/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.AlunoControl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class FrmAluno extends javax.swing.JFrame {
    private AlunoControl alControle;
    /**
     * Creates new form FrmAluno
     */
    public FrmAluno() {
        alControle = new AlunoControl();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRA = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtRA = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnBuscarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        txtProcurarEspecífico = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRA.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblRA.setText("RA");
        lblRA.setName(""); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblNome.setText("Nome");

        txtRA.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRAActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnBuscarTodos.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnBuscarTodos.setText("Buscar Todos");
        btnBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodosActionPerformed(evt);
            }
        });

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Nome"
            }
        ));
        tblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        txtProcurarEspecífico.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtProcurarEspecífico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcurarEspecíficoActionPerformed(evt);
            }
        });

        btnProcurar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnProcurar.setText("Procurar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProcurarEspecífico, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRA)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarTodos))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRA)
                    .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurarEspecífico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRAActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = this.txtNome.getText();
        int ra = Integer.parseInt(this.txtRA.getText());
        alControle.Cadastrar(nome,ra);
        this.txtNome.setText("");
        this.txtRA.setText("");
        this.txtRA.requestFocus();
        this.btnBuscarTodosActionPerformed(evt);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodosActionPerformed
        ArrayList<Aluno> lista  = alControle.buscarTodosAlunos();
        DefaultTableModel dados = new DefaultTableModel();
        dados.setNumRows(0);
        dados.addColumn("RA");
        dados.addColumn("Nome");
        
        //percorre arraylist
        for (Aluno a: lista)
        {
            dados.addRow(new Object []{a.getRa(), a.getNome()});
        }
        
        tblAlunos.setModel(dados);
        /*String result = "";
        //for (Aluno a: lista){
       result = result.concat (a.getRa() + "" + a.getNome());        
    }
        JOptionPane.showMessageDialog(null, result);*/
    }//GEN-LAST:event_btnBuscarTodosActionPerformed

    private void tblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseClicked
        int linhaSelecionada = this.tblAlunos.getSelectedRow();
        String raSelecionado = this.tblAlunos.getValueAt(linhaSelecionada, 0).toString();
        txtProcurarEspecífico.setText(raSelecionado);
    }//GEN-LAST:event_tblAlunosMouseClicked

    private void txtProcurarEspecíficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcurarEspecíficoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcurarEspecíficoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTodos;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRA;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProcurarEspecífico;
    private javax.swing.JTextField txtRA;
    // End of variables declaration//GEN-END:variables
}