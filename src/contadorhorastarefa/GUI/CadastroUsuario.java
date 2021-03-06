/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorhorastarefa.GUI;

import contadorhorastarefa.DAO.Usuario;
import contadorhorastarefa.DAO.UsuarioTableModel;

/**
 https://www.youtube.com/watch?v=wK_rDHZkLdY&list=PLWd_VnthxxLfA37A4Lb7VJZjqPYpes96X&index=2
 * Aula 02
  @author Fabinhu
 */
public class CadastroUsuario extends javax.swing.JFrame {

    UsuarioTableModel UsuarioTM = new UsuarioTableModel();
    
    public CadastroUsuario() {
        initComponents();
        //inciando o JTable e instanciando a classe onde colocamos os metodos abstratos
        jtCadastroUsuario.setModel(UsuarioTM);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNonmeUsuario = new javax.swing.JTextField();
        txtNomeLogin = new javax.swing.JTextField();
        txtDataAdmissao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrousuarioSair = new javax.swing.JButton();
        btnCadastrousuarioIncluir = new javax.swing.JButton();
        btnCadastrousuarioExcluir = new javax.swing.JButton();
        jcbStatus = new javax.swing.JCheckBox();
        btnCadastrousuarioEditar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCadastroUsuario = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Usuario");

        jLabel1.setText("Usuario");

        jLabel2.setText("Login");

        jLabel3.setText("Data Admiss??o");

        jLabel4.setText("C??digo");

        btnCadastrousuarioSair.setText("Sair");
        btnCadastrousuarioSair.setPreferredSize(new java.awt.Dimension(63, 32));
        btnCadastrousuarioSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrousuarioSairActionPerformed(evt);
            }
        });

        btnCadastrousuarioIncluir.setText("Incluir");
        btnCadastrousuarioIncluir.setPreferredSize(new java.awt.Dimension(63, 32));
        btnCadastrousuarioIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrousuarioIncluirActionPerformed(evt);
            }
        });

        btnCadastrousuarioExcluir.setText("Excluir");
        btnCadastrousuarioExcluir.setPreferredSize(new java.awt.Dimension(63, 32));
        btnCadastrousuarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrousuarioExcluirActionPerformed(evt);
            }
        });

        jcbStatus.setText("Excluido");

        btnCadastrousuarioEditar1.setText("Editar");
        btnCadastrousuarioEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrousuarioEditar1ActionPerformed(evt);
            }
        });

        jtCadastroUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Data Admissao", "Login"
            }
        ));
        jScrollPane2.setViewportView(jtCadastroUsuario);

        jMenu1.setText("Menu");

        jMenuItem1.setText("Incluir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salvar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Editar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrousuarioExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(btnCadastrousuarioIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrousuarioEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrousuarioSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNonmeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbStatus)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrousuarioIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnCadastrousuarioExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNonmeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrousuarioEditar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrousuarioSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbStatus)
                        .addGap(22, 22, 22)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrousuarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrousuarioExcluirActionPerformed
      
        if(jtCadastroUsuario.getSelectedRow() != -1){
            UsuarioTM.removerLinhas(jtCadastroUsuario.getSelectedRow());
            
        }
        
    }//GEN-LAST:event_btnCadastrousuarioExcluirActionPerformed

    private void btnCadastrousuarioSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrousuarioSairActionPerformed
        //Runtime.getRuntime().exit(0);
        this.dispose();
    }//GEN-LAST:event_btnCadastrousuarioSairActionPerformed

    private void btnCadastrousuarioIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrousuarioIncluirActionPerformed
        Usuario usuarioCadastro = new Usuario();
        usuarioCadastro.setMatricula(Integer.parseInt(txtMatricula.getText()));
        usuarioCadastro.setNome(txtNonmeUsuario.getText());
        usuarioCadastro.setDataAdmissao(txtDataAdmissao.getText());
        usuarioCadastro.setLogin(txtNomeLogin.getText());
        
        //instanciando tablemodel
        UsuarioTM.adicionarLinhas(usuarioCadastro);    }//GEN-LAST:event_btnCadastrousuarioIncluirActionPerformed

    private void btnCadastrousuarioEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrousuarioEditar1ActionPerformed

            if(jtCadastroUsuario.getSelectedRow() != -1){
            UsuarioTM.setValueAt(txtMatricula.getText(),jtCadastroUsuario.getSelectedRow(),0);
            UsuarioTM.setValueAt(txtNonmeUsuario.getText(),jtCadastroUsuario.getSelectedRow(),1);
            UsuarioTM.setValueAt(txtDataAdmissao.getText(),jtCadastroUsuario.getSelectedRow(),2);
            UsuarioTM.setValueAt(txtNomeLogin.getText(),jtCadastroUsuario.getSelectedRow(),3);
            
        }
        
    }//GEN-LAST:event_btnCadastrousuarioEditar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrousuarioEditar1;
    private javax.swing.JButton btnCadastrousuarioExcluir;
    private javax.swing.JButton btnCadastrousuarioIncluir;
    private javax.swing.JButton btnCadastrousuarioSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox jcbStatus;
    private javax.swing.JTable jtCadastroUsuario;
    private javax.swing.JTextField txtDataAdmissao;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeLogin;
    private javax.swing.JTextField txtNonmeUsuario;
    // End of variables declaration//GEN-END:variables
}
