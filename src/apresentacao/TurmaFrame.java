package apresentacao;

import controle.TelaControle;
import controle.TurmaControle;
import modelo.entidades.Turma;

public class TurmaFrame extends javax.swing.JFrame {

    public TurmaFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloTurma = new javax.swing.JPanel();
        LabelTituloTurma = new javax.swing.JLabel();
        PanelBodyTurma = new javax.swing.JPanel();
        jLabelNomeTurma = new javax.swing.JLabel();
        jTextNomeTurma = new javax.swing.JTextField();
        jTextCursoTurma = new javax.swing.JTextField();
        jLabelCursoTurma = new javax.swing.JLabel();
        jTextDisciplinaTurma = new javax.swing.JTextField();
        LabelDisciplinaTurma = new javax.swing.JLabel();
        jLabelTurnoTurma = new javax.swing.JLabel();
        jComboBoxTurnoTurma = new javax.swing.JComboBox();
        LabelPeriodoTurma = new javax.swing.JLabel();
        jTextPeriodoTurma = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PanelMenuTurma = new javax.swing.JPanel();
        ToolBarMenuTurma = new javax.swing.JToolBar();
        jButtonConsultar = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneTurma = new javax.swing.JScrollPane();
        jTableTurma = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PanelTituloTurma.setBackground(new java.awt.Color(255, 255, 255));

        LabelTituloTurma.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTituloTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemTurma.png"))); // NOI18N
        LabelTituloTurma.setText("Turma");

        javax.swing.GroupLayout PanelTituloTurmaLayout = new javax.swing.GroupLayout(PanelTituloTurma);
        PanelTituloTurma.setLayout(PanelTituloTurmaLayout);
        PanelTituloTurmaLayout.setHorizontalGroup(
            PanelTituloTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloTurmaLayout.setVerticalGroup(
            PanelTituloTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBodyTurma.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelNomeTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNomeTurma.setText("Nome");

        jTextNomeTurma.setColumns(20);

        jTextCursoTurma.setColumns(20);
        jTextCursoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCursoTurmaActionPerformed(evt);
            }
        });

        jLabelCursoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCursoTurma.setText("Curso");

        jTextDisciplinaTurma.setColumns(20);

        LabelDisciplinaTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelDisciplinaTurma.setText("Disciplina");

        jLabelTurnoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelTurnoTurma.setText("Turno");

        jComboBoxTurnoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurnoTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turno", "Manhã", "Tarde", "Noite" }));
        jComboBoxTurnoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurnoTurmaActionPerformed(evt);
            }
        });

        LabelPeriodoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelPeriodoTurma.setText("Periodo");

        jTextPeriodoTurma.setColumns(2);

        javax.swing.GroupLayout PanelBodyTurmaLayout = new javax.swing.GroupLayout(PanelBodyTurma);
        PanelBodyTurma.setLayout(PanelBodyTurmaLayout);
        PanelBodyTurmaLayout.setHorizontalGroup(
            PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyTurmaLayout.createSequentialGroup()
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBodyTurmaLayout.createSequentialGroup()
                                .addComponent(jLabelNomeTurma)
                                .addGap(43, 43, 43)
                                .addComponent(jTextNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabelCursoTurma)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDisciplinaTurma)
                            .addComponent(jLabelTurnoTurma))
                        .addGap(18, 18, 18)
                        .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                                .addComponent(jComboBoxTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPeriodoTurma)
                                .addGap(18, 18, 18)
                                .addComponent(jTextPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelBodyTurmaLayout.setVerticalGroup(
            PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeTurma)
                    .addComponent(jTextNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCursoTurma)
                    .addComponent(jTextCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDisciplinaTurma)
                    .addComponent(jTextDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTurnoTurma)
                    .addComponent(jComboBoxTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPeriodoTurma)
                    .addComponent(jTextPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        PanelMenuTurma.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuTurma.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuTurma.setRollover(true);

        jButtonConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setFocusable(false);
        jButtonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonConsultar);

        ButtonAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAlterar.setText("Alterar");
        ButtonAlterar.setFocusable(false);
        ButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonAlterar);

        ButtonExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setFocusable(false);
        ButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonExcluir);
        ToolBarMenuTurma.add(jSeparator1);

        ButtonSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.setFocusable(false);
        ButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonSalvar);

        ButtonLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.setFocusable(false);
        ButtonLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonLimpar);

        ButtonVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonVoltar.setText("Voltar");
        ButtonVoltar.setFocusable(false);
        ButtonVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(ButtonVoltar);

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turmas Cadastradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneTurma.setBackground(new java.awt.Color(204, 204, 204));

        jTableTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoTurma", "Turma", "Curso", "Disciplina", "Periodo", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTurmaMouseClicked(evt);
            }
        });
        jScrollPaneTurma.setViewportView(jTableTurma);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTurma)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTurma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBodyTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTurnoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurnoTurmaActionPerformed

    }//GEN-LAST:event_jComboBoxTurnoTurmaActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        TurmaControle turmaControle = new TurmaControle();
        turmaControle.salvarCampos(this);
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void jTextCursoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCursoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCursoTurmaActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        TurmaControle turmaControle = new TurmaControle();
        turmaControle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
        if(TelaControle.TelaTurmaAlter != null){
            TelaControle.TelaTurmaAlter.setVisible(true);
        }else{
          TelaControle.TelaTurmaAlter = new TurmaAlterarFrame();
          TelaControle.TelaTurmaAlter.setVisible(true);          
         }       
        TelaControle.TelaTurma.setVisible(false);
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        TurmaControle turmaControle = new TurmaControle();
        Turma turma = new Turma();
        turmaControle.Deletar(turma);
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        TurmaControle turmaControle = new TurmaControle();
        turmaControle.consultar(this);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jTableTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTurmaMouseClicked

    }//GEN-LAST:event_jTableTurmaMouseClicked

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        TelaControle.TelaTurma.setVisible(false);
        TelaControle.TelaHome.setVisible(true);
    }//GEN-LAST:event_ButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TurmaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelDisciplinaTurma;
    private javax.swing.JLabel LabelPeriodoTurma;
    private javax.swing.JLabel LabelTituloTurma;
    private javax.swing.JPanel PanelBodyTurma;
    private javax.swing.JPanel PanelMenuTurma;
    private javax.swing.JPanel PanelTituloTurma;
    private javax.swing.JToolBar ToolBarMenuTurma;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JComboBox jComboBoxTurnoTurma;
    private javax.swing.JLabel jLabelCursoTurma;
    private javax.swing.JLabel jLabelNomeTurma;
    private javax.swing.JLabel jLabelTurnoTurma;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneTurma;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableTurma;
    private javax.swing.JTextField jTextCursoTurma;
    private javax.swing.JTextField jTextDisciplinaTurma;
    private javax.swing.JTextField jTextNomeTurma;
    private javax.swing.JTextField jTextPeriodoTurma;
    // End of variables declaration//GEN-END:variables
        
//Get and Set
    /**
     * @return the jTableTurma
     */
    public javax.swing.JTable getjTableTurma() {
        return jTableTurma;
    }

    /**
     * @param jTableTurma the jTableTurma to set
     */
    public void setjTableTurma(javax.swing.JTable jTableTurma) {
        this.jTableTurma = jTableTurma;
    }


    /**
     * @return the jTextCursoTurma
     */
    public javax.swing.JTextField getjTextCursoTurma() {
        return jTextCursoTurma;
    }

    /**
     * @param jTextCursoTurma the jTextCursoTurma to set
     */
    public void setjTextCursoTurma(javax.swing.JTextField jTextCursoTurma) {
        this.jTextCursoTurma = jTextCursoTurma;
    }

    /**
     * @return the jTextDisciplinaTurma
     */
    public javax.swing.JTextField getjTextDisciplinaTurma() {
        return jTextDisciplinaTurma;
    }

    /**
     * @param jTextDisciplinaTurma the jTextDisciplinaTurma to set
     */
    public void setjTextDisciplinaTurma(javax.swing.JTextField jTextDisciplinaTurma) {
        this.jTextDisciplinaTurma = jTextDisciplinaTurma;
    }

    /**
     * @return the jTextNomeTurma
     */
    public javax.swing.JTextField getjTextNomeTurma() {
        return jTextNomeTurma;
    }

    /**
     * @param jTextNomeTurma the jTextNomeTurma to set
     */
    public void setjTextNomeTurma(javax.swing.JTextField jTextNomeTurma) {
        this.jTextNomeTurma = jTextNomeTurma;
    }

    /**
     * @return the jTextPeriodoTurma
     */
    public javax.swing.JTextField getjTextPeriodoTurma() {
        return jTextPeriodoTurma;
    }

    /**
     * @param jTextPeriodoTurma the jTextPeriodoTurma to set
     */
    public void setjTextPeriodoTurma(javax.swing.JTextField jTextPeriodoTurma) {
        this.jTextPeriodoTurma = jTextPeriodoTurma;
    }

    /**
     * @return the jComboBoxTurnoTurma
     */
    public javax.swing.JComboBox getjComboBoxTurnoTurma() {
        return jComboBoxTurnoTurma;
    }

    /**
     * @param jComboBoxTurnoTurma the jComboBoxTurnoTurma to set
     */
    public void setjComboBoxTurnoTurma(javax.swing.JComboBox jComboBoxTurnoTurma) {
        this.jComboBoxTurnoTurma = jComboBoxTurnoTurma;
    } 
}

