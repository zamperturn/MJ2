/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nz.ac.aut.ense701.gui;

import nz.ac.aut.ense701.gameModel.Game;

/**
 *
 * @author Administrator
 */
public class InstructionNew extends javax.swing.JFrame {

    /**
     * Creates new form InstructionNew
     */
    public InstructionNew(Game game) {
        this.game = game;
        initComponents();
    }

    private InstructionNew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(833, 638));
        setMinimumSize(new java.awt.Dimension(833, 638));
        setPreferredSize(new java.awt.Dimension(833, 638));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nz/ac/aut/ense701/gui/Instruction.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(355, 230));
        jLabel2.setMinimumSize(new java.awt.Dimension(355, 230));
        jLabel2.setPreferredSize(new java.awt.Dimension(355, 230));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 350, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nz/ac/aut/ense701/gui/Instruction2.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(355, 230));
        jLabel3.setMinimumSize(new java.awt.Dimension(355, 230));
        jLabel3.setPreferredSize(new java.awt.Dimension(355, 230));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 90, 350, 230);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nz/ac/aut/ense701/gui/Instruction3.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 350, 555, 110);

        returnBtn.setBackground(new java.awt.Color(176, 255, 176));
        returnBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        returnBtn.setText("RETURN");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn);
        returnBtn.setBounds(360, 520, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nz/ac/aut/ense701/gui/InstructionBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 833, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainMenu menu = new MainMenu(game);
        menu.setVisible(true);
    }//GEN-LAST:event_returnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InstructionNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructionNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructionNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructionNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables
    public Game game;
}
