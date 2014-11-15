package apresentacao;

import controle.AlunoControle;
import controle.TelaControle;
import modelo.entidades.Aluno;
import persistencia.AlunoDao;
import persistencia.TurmaDao;

public class AlunoFrame extends javax.swing.JFrame {
             
    public AlunoFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloAluno = new javax.swing.JPanel();
        LabelTituloAluno = new javax.swing.JLabel();
        PanelMenuAluno = new javax.swing.JPanel();
        ToolBarMenuAluno = new javax.swing.JToolBar();
        jButtonConsultarAluno = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        PanelBodyAluno = new javax.swing.JPanel();
        LabelNomeAluno = new javax.swing.JLabel();
        jTextNomeAluno = new javax.swing.JTextField();
        LabelTurmaAluno = new javax.swing.JLabel();
        jComboBoxTurmaAluno = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMatriculaAluno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneAluno = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        PanelTituloAluno.setBackground(new java.awt.Color(255, 255, 255));

        LabelTituloAluno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTituloAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAluno.png"))); // NOI18N
        LabelTituloAluno.setText("Aluno");

        javax.swing.GroupLayout PanelTituloAlunoLayout = new javax.swing.GroupLayout(PanelTituloAluno);
        PanelTituloAluno.setLayout(PanelTituloAlunoLayout);
        PanelTituloAlunoLayout.setHorizontalGroup(
            PanelTituloAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloAlunoLayout.setVerticalGroup(
            PanelTituloAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMenuAluno.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuAluno.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuAluno.setRollover(true);

        jButtonConsultarAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultarAluno.setText("Consultar");
        jButtonConsultarAluno.setFocusable(false);
        jButtonConsultarAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultarAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAlunoActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(jButtonConsultarAluno);

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
        ToolBarMenuAluno.add(ButtonAlterar);

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
        ToolBarMenuAluno.add(ButtonExcluir);
        ToolBarMenuAluno.add(jSeparator1);

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
        ToolBarMenuAluno.add(ButtonSalvar);

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
        ToolBarMenuAluno.add(ButtonLimpar);

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
        ToolBarMenuAluno.add(ButtonVoltar);

        javax.swing.GroupLayout PanelMenuAlunoLayout = new javax.swing.GroupLayout(PanelMenuAluno);
        PanelMenuAluno.setLayout(PanelMenuAlunoLayout);
        PanelMenuAlunoLayout.setHorizontalGroup(
            PanelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuAlunoLayout.setVerticalGroup(
            PanelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelBodyAluno.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        LabelNomeAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelNomeAluno.setText("Nome");

        jTextNomeAluno.setColumns(20);

        LabelTurmaAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelTurmaAluno.setText("Turma");

        jComboBoxTurmaAluno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurmaAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turma" }));
        jComboBoxTurmaAluno.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxTurmaAlunoComponentShown(evt);
            }
        });
        jComboBoxTurmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaAlunoActionPerformed(evt);
            }
        });
        jComboBoxTurmaAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxTurmaAlunoFocusGained(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Matricula:");

        jTextFieldMatriculaAluno.setColumns(10);

        javax.swing.GroupLayout PanelBodyAlunoLayout = new javax.swing.GroupLayout(PanelBodyAluno);
        PanelBodyAluno.setLayout(PanelBodyAlunoLayout);
        PanelBodyAlunoLayout.setHorizontalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LabelNomeAluno))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(LabelTurmaAluno)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBodyAlunoLayout.setVerticalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeAluno)
                    .addComponent(jTextNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTurmaAluno)
                    .addComponent(jComboBoxTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPaneAluno.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPaneAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoAluno", "Matricula", "Nome", "Turma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAluno.setEnabled(false);
        jScrollPaneAluno.setViewportView(jTableAluno);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAluno, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        jScrollPaneAluno.getAccessibleContext().setAccessibleName("");
        jScrollPaneAluno.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBodyAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenuAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        AlunoControle controle = new AlunoControle();
        controle.salvarCampos(this);
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        AlunoControle controle = new AlunoControle();
        controle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void jComboBoxTurmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoActionPerformed

    }//GEN-LAST:event_jComboBoxTurmaAlunoActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
           if(TelaControle.TelaAlunoAlter != null){
            TelaControle.TelaAlunoAlter.setVisible(true);
        }else{
          TelaControle.TelaAlunoAlter = new AlunoAlterarFrame();
          TelaControle.TelaAlunoAlter.setVisible(true);          
         }       
        TelaControle.TelaAluno.setVisible(false);
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        AlunoControle controle = new AlunoControle();
        Aluno aluno = new Aluno();
        controle.Deletar(aluno);
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButtonConsultarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAlunoActionPerformed
       AlunoControle controle = new AlunoControle();
       controle.consultar(this);
    }//GEN-LAST:event_jButtonConsultarAlunoActionPerformed

    private void jComboBoxTurmaAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoFocusGained

    }//GEN-LAST:event_jComboBoxTurmaAlunoFocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jComboBoxTurmaAlunoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAlunoComponentShown

    }//GEN-LAST:event_jComboBoxTurmaAlunoComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AlunoDao dao = new AlunoDao();
        dao.preencherCombo(this);
    }//GEN-LAST:event_formWindowOpened

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        TelaControle.TelaAluno.setVisible(false);
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
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
    
            public void run() {
                
                new AlunoFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelNomeAluno;
    private javax.swing.JLabel LabelTituloAluno;
    private javax.swing.JLabel LabelTurmaAluno;
    private javax.swing.JPanel PanelBodyAluno;
    private javax.swing.JPanel PanelMenuAluno;
    private javax.swing.JPanel PanelTituloAluno;
    private javax.swing.JToolBar ToolBarMenuAluno;
    private javax.swing.JButton jButtonConsultarAluno;
    private javax.swing.JComboBox jComboBoxTurmaAluno;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAluno;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldMatriculaAluno;
    private javax.swing.JTextField jTextNomeAluno;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTableAluno
     */
    public javax.swing.JTable getjTableAluno() {
        return jTableAluno;
    }

    /**
     * @param jTableAluno the jTableAluno to set
     */
    public void setjTableAluno(javax.swing.JTable jTableAluno) {
        this.jTableAluno = jTableAluno;
    }

    /**
     * @return the jTextFieldMatriculaAluno
     */
    public javax.swing.JTextField getjTextFieldMatriculaAluno() {
        return jTextFieldMatriculaAluno;
    }

    /**
     * @param jTextFieldMatriculaAluno the jTextFieldMatriculaAluno to set
     */
    public void setjTextFieldMatriculaAluno(javax.swing.JTextField jTextFieldMatriculaAluno) {
        this.jTextFieldMatriculaAluno = jTextFieldMatriculaAluno;
    }

    /**
     * @return the jTextNomeAluno
     */
    public javax.swing.JTextField getjTextNomeAluno() {
        return jTextNomeAluno;
    }

    /**
     * @param jTextNomeAluno the jTextNomeAluno to set
     */
    public void setjTextNomeAluno(javax.swing.JTextField jTextNomeAluno) {
        this.jTextNomeAluno = jTextNomeAluno;
    }

    /**
     * @return the jComboBoxTurmaAluno
     */
    public javax.swing.JComboBox getjComboBoxTurmaAluno() {
        return jComboBoxTurmaAluno;
    }

    /**
     * @param jComboBoxTurmaAluno the jComboBoxTurmaAluno to set
     */
    public void setjComboBoxTurmaAluno(javax.swing.JComboBox jComboBoxTurmaAluno) {
        this.jComboBoxTurmaAluno = jComboBoxTurmaAluno;
    }
}
