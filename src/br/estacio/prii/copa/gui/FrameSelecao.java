package br.estacio.prii.copa.gui;

import br.estacio.prii.copa.dao.SelecaoDAO;
import br.estacio.prii.copa.entidade.Selecao;
import javax.swing.JOptionPane;


public class FrameSelecao extends javax.swing.JFrame {

    public FrameSelecao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSelecao = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTecnico = new javax.swing.JLabel();
        txtTecnico = new javax.swing.JTextField();
        lblGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        pnlDescricaoSelecao = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        javax.swing.JPanel pnlImagemSelecao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarSelecao = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção");
        setUndecorated(true);

        pnlSelecao.setBackground(new java.awt.Color(255, 255, 255));
        pnlSelecao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblTitulo.setText("Cadastro de Seleção");

        lblNome.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblTecnico.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblTecnico.setText("Técnico:");

        txtTecnico.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txtTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTecnicoActionPerformed(evt);
            }
        });

        lblGrupo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblGrupo.setText("Grupo:");

        txtGrupo.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        pnlDescricaoSelecao.setBackground(new java.awt.Color(255, 255, 255));
        pnlDescricaoSelecao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txtDescricao.setRows(5);
        jScrollPane.setViewportView(txtDescricao);

        javax.swing.GroupLayout pnlDescricaoSelecaoLayout = new javax.swing.GroupLayout(pnlDescricaoSelecao);
        pnlDescricaoSelecao.setLayout(pnlDescricaoSelecaoLayout);
        pnlDescricaoSelecaoLayout.setHorizontalGroup(
            pnlDescricaoSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaoSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlDescricaoSelecaoLayout.setVerticalGroup(
            pnlDescricaoSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaoSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlImagemSelecao.setBackground(new java.awt.Color(255, 255, 255));
        pnlImagemSelecao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagem:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        javax.swing.GroupLayout pnlImagemSelecaoLayout = new javax.swing.GroupLayout(pnlImagemSelecao);
        pnlImagemSelecao.setLayout(pnlImagemSelecaoLayout);
        pnlImagemSelecaoLayout.setHorizontalGroup(
            pnlImagemSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlImagemSelecaoLayout.setVerticalGroup(
            pnlImagemSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeSelecao.png"))); // NOI18N

        btnCadastrarSelecao.setBackground(new java.awt.Color(0, 51, 153));
        btnCadastrarSelecao.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnCadastrarSelecao.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarSelecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCadastrar2.png"))); // NOI18N
        btnCadastrarSelecao.setText("Cadastrar");
        btnCadastrarSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarSelecaoActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 51, 153));
        btnVoltar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeVoltar.png"))); // NOI18N
        btnVoltar.setText(" Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSelecaoLayout = new javax.swing.GroupLayout(pnlSelecao);
        pnlSelecao.setLayout(pnlSelecaoLayout);
        pnlSelecaoLayout.setHorizontalGroup(
            pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelecaoLayout.createSequentialGroup()
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSelecaoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSelecaoLayout.createSequentialGroup()
                                .addComponent(lblTecnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(lblGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSelecaoLayout.createSequentialGroup()
                                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCadastrarSelecao)
                                    .addComponent(pnlDescricaoSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(pnlImagemSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(btnVoltar)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelecaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(219, 219, 219))
        );
        pnlSelecaoLayout.setVerticalGroup(
            pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnico)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrupo))
                .addGap(35, 35, 35)
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlImagemSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDescricaoSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTecnicoActionPerformed
        
    }//GEN-LAST:event_txtTecnicoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        //new FrameMenu().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarSelecaoActionPerformed
        
        String nome      = txtNome.getText();
        String tecnico   = txtTecnico.getText();
        String grupo     = txtGrupo.getText();
        String descricao = txtDescricao.getText();
        
        if( nome.equals("") || tecnico.equals("") || grupo.equals("") || descricao.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os dados!", "OS DADOS NÃO FORAM PREENCHIDOS", JOptionPane.ERROR_MESSAGE);
        } else {
            
            Selecao selecaoSalvar = new Selecao();
            
            selecaoSalvar.setNome(nome);
            selecaoSalvar.setTecnico(tecnico);
            selecaoSalvar.setGrupo(grupo);
            selecaoSalvar.setDescricao(descricao);
            
            if(SelecaoDAO.cadastrar(selecaoSalvar)){
                JOptionPane.showMessageDialog(null, "Seleção cadastrada com sucesso.", "Cadastro seleção", JOptionPane.QUESTION_MESSAGE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Houve um erro ao tentar cadastra a seleção \nVerifique os dados.", "Erro cadastro", JOptionPane.WARNING_MESSAGE);
            }
            
            
        }
        
    }//GEN-LAST:event_btnCadastrarSelecaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSelecao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarSelecao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTecnico;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDescricaoSelecao;
    private javax.swing.JPanel pnlSelecao;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTecnico;
    // End of variables declaration//GEN-END:variables
}