/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author pc
 */
public class Loading1 extends javax.swing.JFrame {

    

    public Loading1() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBbar = new javax.swing.JProgressBar();
        lblLoading = new javax.swing.JLabel();
        lblValueNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PBbar.setBackground(new java.awt.Color(153, 153, 153));
        PBbar.setForeground(new java.awt.Color(255, 255, 255));

        lblLoading.setBackground(new java.awt.Color(255, 255, 255));
        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(0, 0, 0));
        lblLoading.setText("Loading...");

        lblValueNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblValueNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValueNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblValueNumber.setText("0%");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/function/logot trường cao đẳng fpt (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(857, 857, 857)
                .addComponent(lblValueNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(PBbar, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLoading))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(lblValueNumber))
            .addGroup(layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(PBbar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(lblLoading))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       public void startLoading() {
        Thread loadingThread = new Thread(() -> {
            setVisible(true);

            boolean isCompleted = false;

            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                    lblValueNumber.setText(i + "%");
                    switch (i) {
                        case 10:
                            lblLoading.setText("Turning on Modules...");
                            break;
                        case 20:
                            lblLoading.setText("Loading Modules...");
                            break;
                        case 50:
                            lblLoading.setText("Connecting to Database...");
                            break;
                        case 70:
                            lblLoading.setText("Connecting successful!");
                            break;
                        case 80:
                            lblLoading.setText("Launching Application...");
                            break;
                    }
                    PBbar.setValue(i);

                    if (i == 100) {
                        isCompleted = true; 
                    }

                } catch (Exception e) {
                }
            }

            if (isCompleted) {
                CafeStaffManager cr = new CafeStaffManager();
                cr.setVisible(true);
                setVisible(false);
            }
        });

        loadingThread.start();
    }

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
            java.util.logging.Logger.getLogger(Loading1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar PBbar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblLoading;
    public static javax.swing.JLabel lblValueNumber;
    // End of variables declaration//GEN-END:variables
}
