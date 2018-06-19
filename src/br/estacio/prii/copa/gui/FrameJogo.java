package br.estacio.prii.copa.gui;

import br.estacio.prii.copa.dao.EstadioDAO;
import br.estacio.prii.copa.dao.JogoDAO;
import br.estacio.prii.copa.dao.SelecaoDAO;
import br.estacio.prii.copa.entidade.Jogo;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class FrameJogo extends javax.swing.JFrame {
    
    public FrameJogo() {
        
        initComponents();
        
        ArrayList<String> locais   = EstadioDAO.fillComboBox();
        ArrayList<String> selecoes = SelecaoDAO.fillComboBox();
                
        locais.forEach(FrameJogo.this.jcbLocal::addItem);
        selecoes.forEach(FrameJogo.this.jcbSelecaoA::addItem);
        selecoes.forEach(FrameJogo.this.jcbSelecaoB::addItem);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIcone = new javax.swing.JLabel();
        lblSelecaoA = new javax.swing.JLabel();
        lblSelecaoB = new javax.swing.JLabel();
        txtPlacarA = new javax.swing.JTextField();
        lblPlacarA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPlacarB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDataHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jcbLocal = new javax.swing.JComboBox<>();
        jcbFase = new javax.swing.JComboBox<>();
        jcbSelecaoB = new javax.swing.JComboBox<>();
        jcbSelecaoA = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblTitulo.setText("Cadastro de Jogos");

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeJogos.png"))); // NOI18N

        lblSelecaoA.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblSelecaoA.setText("Seleção A: ");

        lblSelecaoB.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblSelecaoB.setText("Seleção B:");

        txtPlacarA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        lblPlacarA.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblPlacarA.setText("Placar A:");

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("Placar B:");

        txtPlacarB.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setText("Local:");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setText("Data/Hora:");

        txtDataHora.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setText("Fase:");

        lblGrupo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblGrupo.setText("Grupo:");

        txtGrupo.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 153));
        btnCadastrar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCadastrar2.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 102, 153));
        btnVoltar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeVoltar.png"))); // NOI18N
        btnVoltar.setText(" Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jcbLocal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jcbFase.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRUPOS", "OITAVAS", "QUARTAS", "SEMI", "FINAL" }));
        jcbFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFaseActionPerformed(evt);
            }
        });

        jcbSelecaoB.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbSelecaoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbSelecaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecaoBActionPerformed(evt);
            }
        });

        jcbSelecaoA.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbSelecaoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbSelecaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecaoAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblSelecaoB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbSelecaoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblSelecaoA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbSelecaoA, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblIcone)
                        .addGap(79, 79, 79)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGrupo)
                                .addGap(7, 7, 7)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlacarA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlacarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlacarB))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(lblIcone))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelecaoA)
                            .addComponent(jcbSelecaoA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlacarA)
                            .addComponent(txtPlacarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecaoB)
                    .addComponent(jLabel1)
                    .addComponent(txtPlacarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSelecaoB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrupo)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        Jogo jogoSalvar = new Jogo();
        
        String selecaoA = (String)jcbSelecaoA.getSelectedItem();
        String selecaoB = (String)jcbSelecaoB.getSelectedItem();
        String grupo    = null;
        String dataHora = txtDataHora.getText();
        String fase     = (String)jcbFase.getSelectedItem();
        int placarA     = 0;
        int placarB     = 0;
        
        if(!txtGrupo.getText().equals("")){
            grupo = txtGrupo.getText();
        }
        if(!txtPlacarA.getText().equals("")){
            placarA    = Integer.parseInt(txtPlacarA.getText());
        }
        if(!txtPlacarB.getText().equals("")){
            placarB    = Integer.parseInt(txtPlacarB.getText());
        }
        
        jogoSalvar.setSelecaoA(selecaoA);
        jogoSalvar.setSelecaoB(selecaoB);
        jogoSalvar.setPlacarA(placarA);
        jogoSalvar.setPlacarB(placarB);
        jogoSalvar.setGrupo(grupo);
        jogoSalvar.setDatahora(dataHora);
        jogoSalvar.setFase(fase);
        
        if(JogoDAO.cadastrar(jogoSalvar)){
            JOptionPane.showMessageDialog(null, "Jogo cadastrado com sucesso.", "Cadastro jogo", JOptionPane.QUESTION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar cadastra o jogo \nVerifique os dados.", "Erro jogo", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jcbFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFaseActionPerformed
        
        String valor = (String) jcbFase.getSelectedItem();
        
        if(!valor.equals("GRUPOS")){
            lblGrupo.setVisible(false);
            txtGrupo.setVisible(false);
        }else{
            lblGrupo.setVisible(true);
            txtGrupo.setVisible(true);
        }
        
    }//GEN-LAST:event_jcbFaseActionPerformed

    private void jcbSelecaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecaoAActionPerformed
        
        ArrayList<String> selecoes = SelecaoDAO.fillComboBox();
        String selecionado = (String) jcbSelecaoB.getSelectedItem();
        
        selecoes.remove(jcbSelecaoA.getSelectedItem());
        
        jcbSelecaoB.removeAllItems();
        jcbSelecaoB.addItem(selecionado);
        selecoes.forEach(FrameJogo.this.jcbSelecaoB::addItem);
        
    }//GEN-LAST:event_jcbSelecaoAActionPerformed

    private void jcbSelecaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecaoBActionPerformed

        ArrayList<String> selecoes = SelecaoDAO.fillComboBox();
        String selecionado = (String) jcbSelecaoA.getSelectedItem();

        selecoes.remove(jcbSelecaoB.getSelectedItem());

        jcbSelecaoA.removeAllItems();
        jcbSelecaoA.addItem(selecionado);
        selecoes.forEach(FrameJogo.this.jcbSelecaoA::addItem);

    }//GEN-LAST:event_jcbSelecaoBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbFase;
    private javax.swing.JComboBox<String> jcbLocal;
    private javax.swing.JComboBox<String> jcbSelecaoA;
    private javax.swing.JComboBox<String> jcbSelecaoB;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblPlacarA;
    private javax.swing.JLabel lblSelecaoA;
    private javax.swing.JLabel lblSelecaoB;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDataHora;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtPlacarA;
    private javax.swing.JTextField txtPlacarB;
    // End of variables declaration//GEN-END:variables
}