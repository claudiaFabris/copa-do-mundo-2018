package br.estacio.prii.copa.gui;


public class FrameSplash extends javax.swing.JFrame 
{

    public FrameSplash() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconeEstacio = new javax.swing.JLabel();
        lblNomeFaculdade = new javax.swing.JLabel();
        lblDisciplinaProfessor = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAluno1 = new javax.swing.JLabel();
        lblAluno2 = new javax.swing.JLabel();
        lblAluno3 = new javax.swing.JLabel();
        lblPorcentagemCarregando = new javax.swing.JLabel();
        lblImagemSplash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Copa 2018");
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblIconeEstacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeEstacio.png"))); // NOI18N
        getContentPane().add(lblIconeEstacio);
        lblIconeEstacio.setBounds(560, 10, 70, 80);

        lblNomeFaculdade.setBackground(new java.awt.Color(51, 204, 0));
        lblNomeFaculdade.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblNomeFaculdade.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeFaculdade.setText("Centro Universitário Estácio do Ceará - Unidade Moreira Campos");
        getContentPane().add(lblNomeFaculdade);
        lblNomeFaculdade.setBounds(40, 20, 510, 40);

        lblDisciplinaProfessor.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        lblDisciplinaProfessor.setText("Programação II - Prof. Newton Gomes");
        getContentPane().add(lblDisciplinaProfessor);
        lblDisciplinaProfessor.setBounds(180, 60, 280, 40);

        lblTitulo.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 0, 0));
        lblTitulo.setText("PROJETO COPA 2018");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(40, 150, 580, 80);

        lblAluno1.setBackground(new java.awt.Color(255, 255, 255));
        lblAluno1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblAluno1.setText("Claudia Mendes Fabris - 201602272727");
        getContentPane().add(lblAluno1);
        lblAluno1.setBounds(90, 260, 460, 32);

        lblAluno2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblAluno2.setText("Dhonata Freitas Holanda - 201602186871");
        getContentPane().add(lblAluno2);
        lblAluno2.setBounds(80, 290, 470, 30);

        lblAluno3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblAluno3.setText("Maurício de Souza Porfírio - 201601327681");
        getContentPane().add(lblAluno3);
        lblAluno3.setBounds(70, 320, 490, 30);

        lblPorcentagemCarregando.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        lblPorcentagemCarregando.setText("0%");
        getContentPane().add(lblPorcentagemCarregando);
        lblPorcentagemCarregando.setBounds(290, 390, 70, 30);

        lblImagemSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgSplash.jpg"))); // NOI18N
        getContentPane().add(lblImagemSplash);
        lblImagemSplash.setBounds(0, 0, 650, 460);

        getAccessibleContext().setAccessibleName("FrameSplash");

        setSize(new java.awt.Dimension(650, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        new FrameSplash().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAluno1;
    private javax.swing.JLabel lblAluno2;
    private javax.swing.JLabel lblAluno3;
    private javax.swing.JLabel lblDisciplinaProfessor;
    private javax.swing.JLabel lblIconeEstacio;
    private javax.swing.JLabel lblImagemSplash;
    private javax.swing.JLabel lblNomeFaculdade;
    public javax.swing.JLabel lblPorcentagemCarregando;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
