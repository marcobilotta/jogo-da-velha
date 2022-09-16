/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bilotta.jogodavelha;

import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class TelaJogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogoDaVelha
     */
    public TelaJogoDaVelha() {
        initComponents();
        panJogo.setVisible(false);
        panJogadores.setVisible(false);
        lblTabuleiro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sptCabecalho = new javax.swing.JSeparator();
        panJogo = new java.awt.Panel();
        lblP00 = new javax.swing.JLabel();
        lblP01 = new javax.swing.JLabel();
        lblP03 = new javax.swing.JLabel();
        lblP10 = new javax.swing.JLabel();
        lblP11 = new javax.swing.JLabel();
        lblP12 = new javax.swing.JLabel();
        lblP20 = new javax.swing.JLabel();
        lblP21 = new javax.swing.JLabel();
        lblP22 = new javax.swing.JLabel();
        lblTabuleiro = new javax.swing.JLabel();
        panJogadores = new java.awt.Panel();
        lblJogador1 = new javax.swing.JLabel();
        lblNomeJogador1 = new javax.swing.JLabel();
        lblNomeJogador2 = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        panBotoes = new java.awt.Panel();
        btnSair = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 700));
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sptCabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 680, -1));

        panJogo.setBackground(new java.awt.Color(242, 242, 242));
        panJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblP00.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP00.setText("X");
        lblP00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP00, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, 120));

        lblP01.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP01.setText("X");
        lblP01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP01, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 120, 120));

        lblP03.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP03.setText("X");
        lblP03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP03, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 130, 120));

        lblP10.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP10.setText("X");
        lblP10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 120, 120));

        lblP11.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP11.setText("X");
        lblP11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, 120));

        lblP12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP12.setText("X");
        lblP12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, 120));

        lblP20.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP20.setText("X");
        lblP20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, 120));

        lblP21.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP21.setText("X");
        lblP21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 120, 120));

        lblP22.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblP22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP22.setText("X");
        lblP22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblP22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 120, 120));

        lblTabuleiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTabuleiro.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\GitHub\\Projetos\\jogo-da-velha\\src\\main\\java\\bilotta\\images\\tabuleiroColorido400x400.png")); // NOI18N
        lblTabuleiro.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblTabuleiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panJogo.add(lblTabuleiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 680, 460));

        getContentPane().add(panJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 680, 450));

        panJogadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJogador1.setForeground(new java.awt.Color(255, 51, 51));
        lblJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador1.setText("JOGADOR 1");
        panJogadores.add(lblJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblNomeJogador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeJogador1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panJogadores.add(lblNomeJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, 30));

        lblNomeJogador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeJogador2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panJogadores.add(lblNomeJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 330, 30));

        lblJogador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJogador2.setForeground(new java.awt.Color(255, 51, 51));
        lblJogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador2.setText("JOGADOR 2");
        panJogadores.add(lblJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        getContentPane().add(panJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 100));

        panBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        panBotoes.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 170, 70));

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("NOVO JOGO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panBotoes.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 70));

        getContentPane().add(panBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 680, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int saidaDoJogo = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do jogo?", "ENCERRAR JOGO", JOptionPane.YES_NO_OPTION);
        if (saidaDoJogo == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panBotoes.setVisible(false);
        panJogadores.setVisible(true);
        Game game = new Game();
        lblNomeJogador1.setText(game.getJogador1().getNome());
        lblNomeJogador2.setText(game.getJogador2().getNome());
        panJogo.setVisible(true);
        lblTabuleiro.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblNomeJogador1;
    private javax.swing.JLabel lblNomeJogador2;
    private javax.swing.JLabel lblP00;
    private javax.swing.JLabel lblP01;
    private javax.swing.JLabel lblP03;
    private javax.swing.JLabel lblP10;
    private javax.swing.JLabel lblP11;
    private javax.swing.JLabel lblP12;
    private javax.swing.JLabel lblP20;
    private javax.swing.JLabel lblP21;
    private javax.swing.JLabel lblP22;
    private javax.swing.JLabel lblTabuleiro;
    private java.awt.Panel panBotoes;
    private java.awt.Panel panJogadores;
    private java.awt.Panel panJogo;
    private javax.swing.JSeparator sptCabecalho;
    // End of variables declaration//GEN-END:variables
}
