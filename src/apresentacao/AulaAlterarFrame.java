/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import controle.AulaControle;
import controle.TelaControle;
import persistencia.AulaDao;

/**
 *
 * @author Ninja
 */
public class AulaAlterarFrame extends javax.swing.JFrame {

    /**
     * Creates new form AulaAlterarFrame
     */
    public AulaAlterarFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuTurma = new javax.swing.JPanel();
        ToolBarMenuTurma = new javax.swing.JToolBar();
        ButtonAtualizarAulaAlterar = new javax.swing.JButton();
        ButtonLimparAulaAlterar = new javax.swing.JButton();
        ButtonVoltarAulaAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigoAulaAlterar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBoxCodigoAula = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePresenca = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelMenuTurma.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuTurma.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuTurma.setRollover(true);

        ButtonAtualizarAulaAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAtualizarAulaAlterar.setText("Atualizar");
        ButtonAtualizarAulaAlterar.setFocusable(false);
        ButtonAtualizarAulaAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAtualizarAulaAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonAtualizarAulaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtualizarAulaAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonAtualizarAulaAlterar);

        ButtonLimparAulaAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonLimparAulaAlterar.setText("Limpar");
        ButtonLimparAulaAlterar.setFocusable(false);
        ButtonLimparAulaAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLimparAulaAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLimparAulaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparAulaAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonLimparAulaAlterar);

        ButtonVoltarAulaAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonVoltarAulaAlterar.setText("Voltar");
        ButtonVoltarAulaAlterar.setFocusable(false);
        ButtonVoltarAulaAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonVoltarAulaAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonVoltarAulaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarAulaAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonVoltarAulaAlterar);

        javax.swing.GroupLayout PanelMenuTurmaLayout = new javax.swing.GroupLayout(PanelMenuTurma);
        PanelMenuTurma.setLayout(PanelMenuTurmaLayout);
        PanelMenuTurmaLayout.setHorizontalGroup(
            PanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuTurmaLayout.setVerticalGroup(
            PanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar Aula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelCodigoAulaAlterar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCodigoAulaAlterar.setText("Codigo Aula");

        jComboBoxCodigoAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCodigoAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Codigo" }));
        jComboBoxCodigoAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCodigoAulaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCodigoAulaAlterar)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoAulaAlterar)
                    .addComponent(jComboBoxCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar Presença", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTablePresenca.setBackground(new java.awt.Color(204, 204, 204));
        jTablePresenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Aluno", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePresenca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAtualizarAulaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtualizarAulaAlterarActionPerformed
        AulaControle controle = new AulaControle();
        controle.Atualizar(this);
    }//GEN-LAST:event_ButtonAtualizarAulaAlterarActionPerformed

    private void ButtonLimparAulaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparAulaAlterarActionPerformed
       AulaControle controle = new AulaControle();
       controle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparAulaAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AulaDao dao = new AulaDao();
        dao.preencherComboCodigo(this);
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxCodigoAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCodigoAulaItemStateChanged
        AulaDao dao = new AulaDao();
        dao.preencherJTableCodigo(this);
    }//GEN-LAST:event_jComboBoxCodigoAulaItemStateChanged

    private void ButtonVoltarAulaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarAulaAlterarActionPerformed
       TelaControle.TelaAulaAlter.setVisible(false);
       TelaControle.TelaAula.setVisible(true);
    }//GEN-LAST:event_ButtonVoltarAulaAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(AulaAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AulaAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AulaAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AulaAlterarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AulaAlterarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtualizarAulaAlterar;
    private javax.swing.JButton ButtonLimparAulaAlterar;
    private javax.swing.JButton ButtonVoltarAulaAlterar;
    private javax.swing.JPanel PanelMenuTurma;
    private javax.swing.JToolBar ToolBarMenuTurma;
    private javax.swing.JComboBox jComboBoxCodigoAula;
    private javax.swing.JLabel jLabelCodigoAulaAlterar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTablePresenca;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jComboBoxCodigoAula
     */
    public javax.swing.JComboBox getjComboBoxCodigoAula() {
        return jComboBoxCodigoAula;
    }

    /**
     * @param jComboBoxCodigoAula the jComboBoxCodigoAula to set
     */
    public void setjComboBoxCodigoAula(javax.swing.JComboBox jComboBoxCodigoAula) {
        this.jComboBoxCodigoAula = jComboBoxCodigoAula;
    }

    /**
     * @return the jTablePresenca
     */
    public javax.swing.JTable getjTablePresenca() {
        return jTablePresenca;
    }

    /**
     * @param jTablePresenca the jTablePresenca to set
     */
    public void setjTablePresenca(javax.swing.JTable jTablePresenca) {
        this.jTablePresenca = jTablePresenca;
    }
}
