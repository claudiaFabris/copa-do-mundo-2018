package br.estacio.prii.copa.gui;

import br.estacio.prii.copa.dao.SelecaoDAO;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class FrameTabelaGrupos extends javax.swing.JFrame {

    public FrameTabelaGrupos() {
        
        model = new DefaultListModel();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        jcbGrupo = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaJogosGrupo = new javax.swing.JList<>();
        btnNovoJogo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblTitulo.setText("Lista de Jogos por Grupo - Copa do Mundo 2018");

        lblGrupo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblGrupo.setText("Grupo:");

        jcbGrupo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jcbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "G", "H" }));
        jcbGrupo.setToolTipText("");

        btnPesquisar.setBackground(new java.awt.Color(0, 102, 153));
        btnPesquisar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        listaJogosGrupo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        listaJogosGrupo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(listaJogosGrupo);

        btnNovoJogo.setBackground(new java.awt.Color(0, 102, 153));
        btnNovoJogo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnNovoJogo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeSelecao.png"))); // NOI18N
        btnNovoJogo.setText("Nova Seleção");
        btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoJogoActionPerformed(evt);
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

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblTitulo))))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnNovoJogo)
                        .addGap(40, 40, 40)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo)
                .addGap(43, 43, 43)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrupo)
                    .addComponent(jcbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoJogo))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        model.clear();
        
        ArrayList<String> selecoes = SelecaoDAO.getSelecoesGrupo((String) jcbGrupo.getSelectedItem());
        
        listaJogosGrupo.setModel(model);
        
        selecoes.forEach(FrameTabelaGrupos.this.model::addElement);
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
        new FrameSelecao().setVisible(true);
    }//GEN-LAST:event_btnNovoJogoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTabelaGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoJogo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbGrupo;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listaJogosGrupo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
    private final DefaultListModel model;
}