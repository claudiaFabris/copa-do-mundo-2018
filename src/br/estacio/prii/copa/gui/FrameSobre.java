package br.estacio.prii.copa.gui;


public class FrameSobre extends javax.swing.JFrame {

    public FrameSobre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSobre = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        plnTexto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sobre");
        setBackground(new java.awt.Color(255, 255, 255));

        pnlSobre.setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/copa-do-mundo-russia-2018-logo.png"))); // NOI18N

        plnTexto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel1.setText("Copa 2018 é um projeto idealizado especialmente  ");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel2.setText("para aplicação prática da disciplina de Programação II");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel3.setText("no Centro Universitário Estácio do Ceará em 2018.1");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel4.setText("O desenvolvimento do projeto ocorreu durante o período ");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel5.setText("de estudos para a Av2 como nota parcial para a avaliação,");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel6.setText("com a orientação do professor Newton Gomes");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel7.setText("O objetivo principal é fornecer informações sobre as seleções, ");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel8.setText("e os jogos, através de autenticação do usuário e cadastro");

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel9.setText("das informações principais. ");

        btnVoltar.setBackground(new java.awt.Color(204, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeVoltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plnTextoLayout = new javax.swing.GroupLayout(plnTexto);
        plnTexto.setLayout(plnTextoLayout);
        plnTextoLayout.setHorizontalGroup(
            plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnTextoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnTextoLayout.createSequentialGroup()
                        .addGroup(plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(plnTextoLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel3))
                                .addGroup(plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnTextoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnTextoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnTextoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plnTextoLayout.createSequentialGroup()
                        .addGroup(plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(145, 145, 145))))
        );
        plnTextoLayout.setVerticalGroup(
            plnTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnTextoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlSobreLayout = new javax.swing.GroupLayout(pnlSobre);
        pnlSobre.setLayout(pnlSobreLayout);
        pnlSobreLayout.setHorizontalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plnTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlSobreLayout.setVerticalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addComponent(lblImagem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobreLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(plnTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new FrameMenu().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FrameSobre().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JPanel plnTexto;
    private javax.swing.JPanel pnlSobre;
    // End of variables declaration//GEN-END:variables
}