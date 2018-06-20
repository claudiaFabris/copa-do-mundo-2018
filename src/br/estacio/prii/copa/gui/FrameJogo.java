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
        lblIcone = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSelecaoA = new javax.swing.JLabel();
        jcbSelecaoA = new javax.swing.JComboBox<>();
        lblSelecaoB = new javax.swing.JLabel();
        jcbSelecaoB = new javax.swing.JComboBox<>();
        txtPlacarA = new javax.swing.JTextField();
        lblPlacarA = new javax.swing.JLabel();
        lblPlacarB = new javax.swing.JLabel();
        txtPlacarB = new javax.swing.JTextField();
        lblLocal = new javax.swing.JLabel();
        jcbLocal = new javax.swing.JComboBox<>();
        lblFase = new javax.swing.JLabel();
        jcbFase = new javax.swing.JComboBox<>();
        lblDataHora = new javax.swing.JLabel();
        txtDataHora = new javax.swing.JTextField();
        lblGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeJogos.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblTitulo.setText("Cadastro de Jogos");

        lblSelecaoA.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblSelecaoA.setText("Seleção A: ");

        jcbSelecaoA.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbSelecaoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbSelecaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecaoAActionPerformed(evt);
            }
        });

        lblSelecaoB.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblSelecaoB.setText("Seleção B:");

        jcbSelecaoB.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbSelecaoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbSelecaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecaoBActionPerformed(evt);
            }
        });

        txtPlacarA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        lblPlacarA.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblPlacarA.setText("Placar A:");

        lblPlacarB.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblPlacarB.setText("Placar B:");

        txtPlacarB.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        lblLocal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblLocal.setText("Local:");

        jcbLocal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        lblFase.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblFase.setText("Fase:");

        jcbFase.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRUPOS", "OITAVAS", "QUARTAS", "SEMI", "FINAL" }));
        jcbFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFaseActionPerformed(evt);
            }
        });

        lblDataHora.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblDataHora.setText("Data/Hora:");

        txtDataHora.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(lblIcone)
                                .addGap(18, 18, 18)
                                .addComponent(lblTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbLocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSelecaoA)
                                    .addComponent(lblSelecaoB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbSelecaoA, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbSelecaoB, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPlacarA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPlacarA))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPlacarB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPlacarB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(lblDataHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnCadastrar)
                        .addGap(45, 45, 45)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(lblIcone))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecaoA)
                    .addComponent(jcbSelecaoA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlacarA)
                    .addComponent(txtPlacarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlacarB)
                    .addComponent(txtPlacarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSelecaoB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelecaoB))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFase)
                    .addComponent(jcbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataHora)
                    .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrupo))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal)
                    .addComponent(jcbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbFase;
    private javax.swing.JComboBox<String> jcbLocal;
    private javax.swing.JComboBox<String> jcbSelecaoA;
    private javax.swing.JComboBox<String> jcbSelecaoB;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblFase;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblPlacarA;
    private javax.swing.JLabel lblPlacarB;
    private javax.swing.JLabel lblSelecaoA;
    private javax.swing.JLabel lblSelecaoB;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDataHora;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtPlacarA;
    private javax.swing.JTextField txtPlacarB;
    // End of variables declaration//GEN-END:variables
}