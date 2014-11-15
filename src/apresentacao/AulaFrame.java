package apresentacao;

import controle.AulaControle;
import controle.TelaControle;
import javax.swing.JTextField;
import modelo.entidades.Aula;
import persistencia.AulaDao;

public class AulaFrame extends javax.swing.JFrame {

    public AulaFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloAula = new javax.swing.JPanel();
        LabelTituloAula = new javax.swing.JLabel();
        PanelMenuAula = new javax.swing.JPanel();
        ToolBarMenuAula = new javax.swing.JToolBar();
        jButtonConsultarAula = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        jPanelBodyAula = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jDateChooserAula = new com.toedter.calendar.JDateChooser();
        jPanelPrensencaAula = new javax.swing.JPanel();
        jLabelAlunoTurma = new javax.swing.JLabel();
        jComboBoxTurmaAula = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePresenca = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelTituloAula.setBackground(new java.awt.Color(255, 255, 255));
        PanelTituloAula.setAutoscrolls(true);
        PanelTituloAula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PanelTituloAulaFocusGained(evt);
            }
        });

        LabelTituloAula.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTituloAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAula.gif"))); // NOI18N
        LabelTituloAula.setText("Aula");

        javax.swing.GroupLayout PanelTituloAulaLayout = new javax.swing.GroupLayout(PanelTituloAula);
        PanelTituloAula.setLayout(PanelTituloAulaLayout);
        PanelTituloAulaLayout.setHorizontalGroup(
            PanelTituloAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloAulaLayout.setVerticalGroup(
            PanelTituloAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloAula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMenuAula.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuAula.setAutoscrolls(true);

        ToolBarMenuAula.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuAula.setRollover(true);

        jButtonConsultarAula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultarAula.setText("Consultar");
        jButtonConsultarAula.setFocusable(false);
        jButtonConsultarAula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultarAula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAulaActionPerformed(evt);
            }
        });
        ToolBarMenuAula.add(jButtonConsultarAula);

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
        ToolBarMenuAula.add(ButtonAlterar);

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
        ToolBarMenuAula.add(ButtonExcluir);
        ToolBarMenuAula.add(jSeparator1);

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
        ToolBarMenuAula.add(ButtonSalvar);

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
        ToolBarMenuAula.add(ButtonLimpar);

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
        ToolBarMenuAula.add(ButtonVoltar);

        javax.swing.GroupLayout PanelMenuAulaLayout = new javax.swing.GroupLayout(PanelMenuAula);
        PanelMenuAula.setLayout(PanelMenuAulaLayout);
        PanelMenuAulaLayout.setHorizontalGroup(
            PanelMenuAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAula, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuAulaLayout.setVerticalGroup(
            PanelMenuAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBodyAula.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBodyAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data - Aula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanelBodyAula.setPreferredSize(new java.awt.Dimension(435, 153));

        jLabelData.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelData.setText("Data");

        jDateChooserAula.setDateFormatString("yyyy-MM-dd");
        jDateChooserAula.setInheritsPopupMenu(true);
        jDateChooserAula.setMinSelectableDate(new java.util.Date(-62135755084000L));

        javax.swing.GroupLayout jPanelBodyAulaLayout = new javax.swing.GroupLayout(jPanelBodyAula);
        jPanelBodyAula.setLayout(jPanelBodyAulaLayout);
        jPanelBodyAulaLayout.setHorizontalGroup(
            jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelData)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyAulaLayout.setVerticalGroup(
            jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPrensencaAula.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPrensencaAula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanelPrensencaAula.setPreferredSize(new java.awt.Dimension(435, 153));

        jLabelAlunoTurma.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAlunoTurma.setText("Turma");

        jComboBoxTurmaAula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTurmaAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Turma" }));
        jComboBoxTurmaAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTurmaAulaItemStateChanged(evt);
            }
        });
        jComboBoxTurmaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaAulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrensencaAulaLayout = new javax.swing.GroupLayout(jPanelPrensencaAula);
        jPanelPrensencaAula.setLayout(jPanelPrensencaAulaLayout);
        jPanelPrensencaAulaLayout.setHorizontalGroup(
            jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrensencaAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlunoTurma)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrensencaAulaLayout.setVerticalGroup(
            jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrensencaAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrensencaAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlunoTurma)
                    .addComponent(jComboBoxTurmaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Presença em Aulas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTablePresenca.setBackground(new java.awt.Color(204, 204, 204));
        jTablePresenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Aluno", "Presente"
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

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela Aula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTableAula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo-Aula", "Data-Aula", "Turma", "Aluno", "Presente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAula);
        if (jTableAula.getColumnModel().getColumnCount() > 0) {
            jTableAula.getColumnModel().getColumn(0).setResizable(false);
            jTableAula.getColumnModel().getColumn(1).setResizable(false);
            jTableAula.getColumnModel().getColumn(2).setResizable(false);
            jTableAula.getColumnModel().getColumn(3).setResizable(false);
            jTableAula.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelBodyAula, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrensencaAula, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PanelMenuAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPrensencaAula, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jPanelBodyAula, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed

        AulaControle controle = new AulaControle();
        controle.salvarCampos(this);
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        AulaControle controle = new AulaControle();
        controle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
          if(TelaControle.TelaAulaAlter != null){
            TelaControle.TelaAulaAlter.setVisible(true);
        }else{
          TelaControle.TelaAulaAlter = new AulaAlterarFrame();
          TelaControle.TelaAulaAlter.setVisible(true);          
         }       
        TelaControle.TelaAula.setVisible(false);
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        AulaControle controle = new AulaControle();
        Aula aula = new Aula();
        controle.Deletar(aula);
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButtonConsultarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAulaActionPerformed
        AulaControle controle = new AulaControle();
        controle.consultar(this);
    }//GEN-LAST:event_jButtonConsultarAulaActionPerformed

    private void PanelTituloAulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PanelTituloAulaFocusGained

    }//GEN-LAST:event_PanelTituloAulaFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AulaDao dao = new AulaDao();
        dao.preencherCombo(this);
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxTurmaAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAulaActionPerformed

    }//GEN-LAST:event_jComboBoxTurmaAulaActionPerformed

    private void jComboBoxTurmaAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTurmaAulaItemStateChanged
        AulaDao dao = new AulaDao();
        dao.preencherJTable(this);
    }//GEN-LAST:event_jComboBoxTurmaAulaItemStateChanged

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
          TelaControle.TelaAula.setVisible(false);
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
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AulaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AulaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelTituloAula;
    private javax.swing.JPanel PanelMenuAula;
    private javax.swing.JPanel PanelTituloAula;
    private javax.swing.JToolBar ToolBarMenuAula;
    private javax.swing.JButton jButtonConsultarAula;
    private javax.swing.JComboBox jComboBoxTurmaAula;
    private com.toedter.calendar.JDateChooser jDateChooserAula;
    private javax.swing.JLabel jLabelAlunoTurma;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JPanel jPanelBodyAula;
    private javax.swing.JPanel jPanelPrensencaAula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTableAula;
    private javax.swing.JTable jTablePresenca;
    // End of variables declaration//GEN-END:variables


    /**
     * @return the jComboBoxTurmaAula
     */
    public javax.swing.JComboBox getjComboBoxTurmaAula() {
        return jComboBoxTurmaAula;
    }

    /**
     * @param jComboBoxTurmaAula the jComboBoxTurmaAula to set
     */
    public void setjComboBoxTurmaAula(javax.swing.JComboBox jComboBoxTurmaAula) {
        this.jComboBoxTurmaAula = jComboBoxTurmaAula;
    }

    /**
     * @return the jTableAula
     */
    public javax.swing.JTable getjTableAula() {
        return jTableAula;
    }

    /**
     * @param jTableAula the jTableAula to set
     */
    public void setjTableAula(javax.swing.JTable jTableAula) {
        this.jTableAula = jTableAula;
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

    /**
     * @return the jDateChooserAula
     */
    public com.toedter.calendar.JDateChooser getjDateChooserAula() {
        return jDateChooserAula;
    }

    /**
     * @param jDateChooserAula the jDateChooserAula to set
     */
    public void setjDateChooserAula(com.toedter.calendar.JDateChooser jDateChooserAula) {
        this.jDateChooserAula = jDateChooserAula;
    }
    
    
}
