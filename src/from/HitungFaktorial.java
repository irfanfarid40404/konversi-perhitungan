/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package from;

import static java.lang.Integer.parseInt;

/**
 *
 * @author ACER
 */
public class HitungFaktorial extends javax.swing.JFrame {

    /**
     * Creates new form HitungFaktorial
     */
    public HitungFaktorial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_HitungFaktorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtField_Bilangan = new javax.swing.JTextField();
        jButton_Hapus = new javax.swing.JButton();
        jButton_Hapus1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_HitungFaktorial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_HitungFaktorial.setText("Hitung Faktorial");
        jButton_HitungFaktorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HitungFaktorialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Masukkan Bilangan : ");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("PROGRAM FAKTORIAL");

        txtField_Bilangan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton_Hapus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Hapus.setText("Hapus");
        jButton_Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_HapusMouseClicked(evt);
            }
        });
        jButton_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HapusActionPerformed(evt);
            }
        });

        jButton_Hapus1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_Hapus1.setText("Kembali");
        jButton_Hapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Hapus1MouseClicked(evt);
            }
        });
        jButton_Hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Hapus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtField_Bilangan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_HitungFaktorial, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtField_Bilangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_HitungFaktorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Hapus1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_HitungFaktorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HitungFaktorialActionPerformed
        int bil = parseInt(txtField_Bilangan.getText());
        int store = 1;
        for (int i = 1; i < bil; i++) {
            store = store * (i + 1);
        }
        System.out.println("Hasil Bilangan Faktorial = "+store);
    }//GEN-LAST:event_jButton_HitungFaktorialActionPerformed

    private void jButton_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_HapusActionPerformed

    private void jButton_HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_HapusMouseClicked
        try {
                
                txtField_Bilangan.setText("");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_jButton_HapusMouseClicked

    private void jButton_Hapus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Hapus1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_Hapus1MouseClicked

    private void jButton_Hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Hapus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Hapus1ActionPerformed

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
            java.util.logging.Logger.getLogger(HitungFaktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungFaktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungFaktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungFaktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungFaktorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Hapus;
    private javax.swing.JButton jButton_Hapus1;
    private javax.swing.JButton jButton_HitungFaktorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtField_Bilangan;
    // End of variables declaration//GEN-END:variables
}
