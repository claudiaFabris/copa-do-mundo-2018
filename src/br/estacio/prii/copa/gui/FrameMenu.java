package br.estacio.prii.copa.gui;

import javax.swing.JOptionPane;


public class FrameMenu extends javax.swing.JFrame 
{

    public FrameMenu() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuSelecoes = new javax.swing.JMenuItem();
        menuEstadios = new javax.swing.JMenuItem();
        menuJogos = new javax.swing.JMenuItem();
        menuTabelas = new javax.swing.JMenu();
        menuTabelaCompleta = new javax.swing.JMenuItem();
        menuTabelaDiaria = new javax.swing.JMenuItem();
        menuTabelaFases = new javax.swing.JMenuItem();
        menuTabelaGrupos = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        menuCadastro = new javax.swing.JMenuItem();
        menuLogoff = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Copa 2018");
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPrincipal.jpeg"))); // NOI18N

        menuPrincipal.setBackground(new java.awt.Color(153, 0, 0));
        menuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuPrincipal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

        menuCadastros.setBackground(new java.awt.Color(204, 0, 51));
        menuCadastros.setForeground(new java.awt.Color(255, 255, 255));
        menuCadastros.setText("Cadastros");

        menuSelecoes.setBackground(new java.awt.Color(153, 0, 0));
        menuSelecoes.setForeground(new java.awt.Color(255, 255, 255));
        menuSelecoes.setText("Seleções");
        menuSelecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSelecoesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuSelecoes);

        menuEstadios.setBackground(new java.awt.Color(153, 0, 0));
        menuEstadios.setForeground(new java.awt.Color(255, 255, 255));
        menuEstadios.setText("Estádios");
        menuEstadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstadiosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuEstadios);

        menuJogos.setBackground(new java.awt.Color(153, 0, 0));
        menuJogos.setForeground(new java.awt.Color(255, 255, 255));
        menuJogos.setText("Jogos da Copa");
        menuCadastros.add(menuJogos);

        menuPrincipal.add(menuCadastros);

        menuTabelas.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelas.setText("Tabelas de Jogos");

        menuTabelaCompleta.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaCompleta.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaCompleta.setText("Completa");
        menuTabelas.add(menuTabelaCompleta);

        menuTabelaDiaria.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaDiaria.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaDiaria.setText("Diária");
        menuTabelas.add(menuTabelaDiaria);

        menuTabelaFases.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        menuTabelaFases.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaFases.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaFases.setText("Fases");
        menuTabelas.add(menuTabelaFases);

        menuTabelaGrupos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        menuTabelaGrupos.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaGrupos.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaGrupos.setText("Grupos");
        menuTabelas.add(menuTabelaGrupos);

        menuPrincipal.add(menuTabelas);

        menuSistema.setForeground(new java.awt.Color(255, 255, 255));
        menuSistema.setText("Sistema");

        menuCadastro.setBackground(new java.awt.Color(153, 0, 0));
        menuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        menuCadastro.setText("Cadastro de Usuários");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });
        menuSistema.add(menuCadastro);

        menuLogoff.setBackground(new java.awt.Color(153, 0, 0));
        menuLogoff.setForeground(new java.awt.Color(255, 255, 255));
        menuLogoff.setText("Logoff do Usuário");
        menuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoffActionPerformed(evt);
            }
        });
        menuSistema.add(menuLogoff);

        menuSobre.setBackground(new java.awt.Color(153, 0, 0));
        menuSobre.setForeground(new java.awt.Color(255, 255, 255));
        menuSobre.setText("Sobre o Sistema");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuSistema.add(menuSobre);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setBackground(new java.awt.Color(153, 0, 0));
        menuSair.setForeground(new java.awt.Color(255, 255, 255));
        menuSair.setText("Sair - Finalizar");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuSistema.add(menuSair);

        menuPrincipal.add(menuSistema);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSelecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSelecoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSelecoesActionPerformed

    private void menuEstadiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstadiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEstadiosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoffActionPerformed
        JOptionPane.showMessageDialog(null, "Logout efetuado com sucesso.", "Sair", JOptionPane.QUESTION_MESSAGE);
        new FrameLogin().show();
        this.dispose();
    }//GEN-LAST:event_menuLogoffActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed

        new FrameSobre().setVisible(true);
        
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        
        new FrameUsuarios().setVisible(true);
        
    }//GEN-LAST:event_menuCadastroActionPerformed

    public static void main(String args[]) 
    {
        new FrameMenu().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem menuCadastro;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuEstadios;
    private javax.swing.JMenuItem menuJogos;
    private javax.swing.JMenuItem menuLogoff;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSelecoes;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuTabelaCompleta;
    private javax.swing.JMenuItem menuTabelaDiaria;
    private javax.swing.JMenuItem menuTabelaFases;
    private javax.swing.JMenuItem menuTabelaGrupos;
    private javax.swing.JMenu menuTabelas;
    // End of variables declaration//GEN-END:variables
}