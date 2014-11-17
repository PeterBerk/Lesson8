import javax.swing.ImageIcon;
public class CrapsGUI extends javax.swing.JFrame {
    private CrapsGame game;
    public CrapsGUI() {
        game = new CrapsGame();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlDice1Pic = new javax.swing.JLabel();
        jlDice2Pic = new javax.swing.JLabel();
        jbRoll = new javax.swing.JButton();
        jlMoney = new javax.swing.JLabel();
        jlDiceTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFeedback = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlDice1Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d1.JPG"))); // NOI18N
        jlDice1Pic.setText("jLabel1");

        jlDice2Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d1.JPG"))); // NOI18N
        jlDice2Pic.setText("jLabel2");

        jbRoll.setText("Roll!");
        jbRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRollActionPerformed(evt);
            }
        });

        jlMoney.setText("$100");

        jlDiceTotal.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jlDiceTotal.setText("2");

        jtFeedback.setColumns(20);
        jtFeedback.setRows(5);
        jScrollPane1.setViewportView(jtFeedback);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlDice1Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlDice2Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbRoll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMoney)
                            .addComponent(jlDiceTotal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDice2Pic)
                    .addComponent(jlDice1Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDiceTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRollActionPerformed
        if (game.roll()){
            updateLabels();
            game = new CrapsGame();
        }
        else{
            updateLabels();
        }
    }//GEN-LAST:event_jbRollActionPerformed

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
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
        
    }
    private void updateLabels(){
        jlDiceTotal.setText(Integer.toString(game.returnTotalDiceValue()));
        jbRoll.setText(game.returnButton());
        jtFeedback.setText(game.returnFeedback());
        jlMoney.setText(game.returnMoney());
        jlDice1Pic.setIcon(game.getDicePictures(1));
        jlDice2Pic.setIcon(game.getDicePictures(2));
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlDice1Pic;
    private javax.swing.JLabel jlDice2Pic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRoll;
    private javax.swing.JLabel jlDiceTotal;
    private javax.swing.JLabel jlMoney;
    private javax.swing.JTextArea jtFeedback;
    // End of variables declaration//GEN-END:variables
}
