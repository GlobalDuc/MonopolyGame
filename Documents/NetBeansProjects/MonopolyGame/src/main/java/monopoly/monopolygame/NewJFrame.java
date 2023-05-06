/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package monopoly.monopolygame;

/**
 *
 * @author hadot
 */
import javax.swing.*;
import java.awt.*;
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        this.setTitle("Monopoly");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 0, 51));
        welcome.setText("WELCOME TO MONOPOLY");
        jPanel1.add(welcome);
        welcome.setBounds(470, 280, 1160, 220);

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 0, 0));
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart);
        btnStart.setBounds(700, 490, 240, 110);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(700, 610, 240, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\mono.png"));
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1800, 850);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        btnExit.setFocusable(false);
        NewJFrame.this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        btnStart.setFocusable(false);
        dispose();
        new Board();
    }//GEN-LAST:event_btnStartActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
