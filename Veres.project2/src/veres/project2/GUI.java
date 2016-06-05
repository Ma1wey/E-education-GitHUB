package veres.project2;

import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    
    private void showSI31Math(){
        DefaultTableModel defaultTableModel = new ShowDBContent().getDataSI31Math();
        studentListTable.setModel(defaultTableModel);
    }
       
    private void showSI32Math(){
        DefaultTableModel defaultTableModel = new ShowDBContent().getDataSI32Math();
        studentListTable.setModel(defaultTableModel);
    }
        
    private void showSI31DB(){
        DefaultTableModel defaultTableModel = new ShowDBContent().getDataSI31DB();
        studentListTable.setModel(defaultTableModel);
    }
    
    private void showSI32DB(){
        DefaultTableModel defaultTableModel = new ShowDBContent().getDataSI32DB();
        studentListTable.setModel(defaultTableModel);
    }
    
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentListTable = new javax.swing.JTable();
        SI31MathBut = new javax.swing.JButton();
        SI32MathBut = new javax.swing.JButton();
        SI32DBBut = new javax.swing.JButton();
        SI31DBBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 48)); // NOI18N
        jLabel2.setText("Список Студентів");

        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(studentListTable);

        SI31MathBut.setText("СІ-31, Математика");
        SI31MathBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SI31MathButActionPerformed(evt);
            }
        });

        SI32MathBut.setText("СІ-32, Математика");
        SI32MathBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SI32MathButActionPerformed(evt);
            }
        });

        SI32DBBut.setText("СІ-32, Бази Даних");
        SI32DBBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SI32DBButActionPerformed(evt);
            }
        });

        SI31DBBut.setText("СІ-31, Бази Даних");
        SI31DBBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SI31DBButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel2)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SI31MathBut)
                    .addComponent(SI31DBBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SI32MathBut)
                    .addComponent(SI32DBBut))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SI31MathBut)
                    .addComponent(SI32MathBut))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SI32DBBut)
                    .addComponent(SI31DBBut))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SI31MathButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SI31MathButActionPerformed
        showSI31Math();
    }//GEN-LAST:event_SI31MathButActionPerformed

    private void SI32MathButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SI32MathButActionPerformed
        showSI32Math();
    }//GEN-LAST:event_SI32MathButActionPerformed

    private void SI32DBButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SI32DBButActionPerformed
        showSI32DB();
    }//GEN-LAST:event_SI32DBButActionPerformed

    private void SI31DBButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SI31DBButActionPerformed
        showSI31DB();
    }//GEN-LAST:event_SI31DBButActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SI31DBBut;
    private javax.swing.JButton SI31MathBut;
    private javax.swing.JButton SI32DBBut;
    private javax.swing.JButton SI32MathBut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentListTable;
    // End of variables declaration//GEN-END:variables
}
