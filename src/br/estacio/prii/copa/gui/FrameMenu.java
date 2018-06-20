package br.estacio.prii.copa.gui;

import br.estacio.prii.copa.entidade.SessaoUsuario;
import br.estacio.prii.copa.entidade.Usuario;
import javax.swing.JOptionPane;


public class FrameMenu extends javax.swing.JFrame 
{
    
    public FrameMenu() 
    {   
        initComponents();
        
        Usuario usuario = SessaoUsuario.getUsuario();
        
        //lblUsuarioLogado.setText(usuario.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsuario = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        lblImagemCentro = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUsuario.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 102, 153));
        lblUsuario.setText("Usuário:");

        lblUsuarioLogado.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, -1));

        lblImagemCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPrincipal.jpeg"))); // NOI18N
        getContentPane().add(lblImagemCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 519));

        menuPrincipal.setBackground(new java.awt.Color(153, 0, 0));
        menuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuPrincipal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

        menuCadastros.setBackground(new java.awt.Color(204, 0, 51));
        menuCadastros.setForeground(new java.awt.Color(255, 255, 255));
        menuCadastros.setText("Cadastros");

        menuSelecoes.setBackground(new java.awt.Color(153, 0, 0));
        menuSelecoes.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuSelecoes.setForeground(new java.awt.Color(255, 255, 255));
        menuSelecoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeMenuSelecao.png"))); // NOI18N
        menuSelecoes.setText("Seleções");
        menuSelecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSelecoesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuSelecoes);

        menuEstadios.setBackground(new java.awt.Color(153, 0, 0));
        menuEstadios.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuEstadios.setForeground(new java.awt.Color(255, 255, 255));
        menuEstadios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeMenuEstadio.png"))); // NOI18N
        menuEstadios.setText("Estádios");
        menuEstadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstadiosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuEstadios);

        menuJogos.setBackground(new java.awt.Color(153, 0, 0));
        menuJogos.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuJogos.setForeground(new java.awt.Color(255, 255, 255));
        menuJogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeMenuJogos.png"))); // NOI18N
        menuJogos.setText("Jogos da Copa");
        menuJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJogosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuJogos);

        menuPrincipal.add(menuCadastros);

        menuTabelas.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelas.setText("Tabelas de Jogos");

        menuTabelaCompleta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuTabelaCompleta.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaCompleta.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuTabelaCompleta.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaCompleta.setText("Completa");
        menuTabelaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaCompletaActionPerformed(evt);
            }
        });
        menuTabelas.add(menuTabelaCompleta);

        menuTabelaDiaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuTabelaDiaria.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaDiaria.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuTabelaDiaria.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaDiaria.setText("Diária");
        menuTabelaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaDiariaActionPerformed(evt);
            }
        });
        menuTabelas.add(menuTabelaDiaria);

        menuTabelaFases.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        menuTabelaFases.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaFases.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuTabelaFases.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaFases.setText("Fases");
        menuTabelaFases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaFasesActionPerformed(evt);
            }
        });
        menuTabelas.add(menuTabelaFases);

        menuTabelaGrupos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        menuTabelaGrupos.setBackground(new java.awt.Color(153, 0, 0));
        menuTabelaGrupos.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuTabelaGrupos.setForeground(new java.awt.Color(255, 255, 255));
        menuTabelaGrupos.setText("Grupos");
        menuTabelaGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaGruposActionPerformed(evt);
            }
        });
        menuTabelas.add(menuTabelaGrupos);

        menuPrincipal.add(menuTabelas);

        menuSistema.setForeground(new java.awt.Color(255, 255, 255));
        menuSistema.setText("Sistema");

        menuCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastro.setBackground(new java.awt.Color(153, 0, 0));
        menuCadastro.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeNovo.png"))); // NOI18N
        menuCadastro.setText("Cadastro de Usuários");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });
        menuSistema.add(menuCadastro);

        menuLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        menuLogoff.setBackground(new java.awt.Color(153, 0, 0));
        menuLogoff.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuLogoff.setForeground(new java.awt.Color(255, 255, 255));
        menuLogoff.setText("Logoff do Usuário");
        menuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoffActionPerformed(evt);
            }
        });
        menuSistema.add(menuLogoff);

        menuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        menuSobre.setBackground(new java.awt.Color(153, 0, 0));
        menuSobre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
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
        menuSair.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSelecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSelecoesActionPerformed
        new FrameSelecao().setVisible(true);
    }//GEN-LAST:event_menuSelecoesActionPerformed

    private void menuEstadiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstadiosActionPerformed
       new FrameEstadio().setVisible(true);
    }//GEN-LAST:event_menuEstadiosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoffActionPerformed
        JOptionPane.showMessageDialog(null, "Logoff efetuado com sucesso!", 
                                     "Saindo...", JOptionPane.QUESTION_MESSAGE
        );
        new FrameLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLogoffActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        new FrameSobre().setVisible(true);     
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        new FrameUsuarios().setVisible(true);
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJogosActionPerformed
        new FrameJogo().setVisible(true);
    }//GEN-LAST:event_menuJogosActionPerformed

    private void menuTabelaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaCompletaActionPerformed
        new FrameTabelaCompleta().setVisible(true);
    }//GEN-LAST:event_menuTabelaCompletaActionPerformed

    private void menuTabelaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaDiariaActionPerformed
        new FrameTabelaDiaria().setVisible(true);
    }//GEN-LAST:event_menuTabelaDiariaActionPerformed

    private void menuTabelaFasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaFasesActionPerformed
        new FrameTabelaFases().setVisible(true);
    }//GEN-LAST:event_menuTabelaFasesActionPerformed

    private void menuTabelaGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaGruposActionPerformed
        new FrameTabelaGrupos().setVisible(true);
    }//GEN-LAST:event_menuTabelaGruposActionPerformed

    public static void main(String args[]) 
    {
        new FrameMenu().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImagemCentro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioLogado;
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
    private javax.swing.JPanel pnlUsuario;
    // End of variables declaration//GEN-END:variables
}