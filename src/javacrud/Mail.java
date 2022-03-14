/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud;

import javacrud.tech.GestionSMTP;

/**
 *
 * @author g.viney
 */
public class Mail extends javax.swing.JFrame {

    /**
     * Creates new form Mail
     */
    private GestionSMTP gestionMail;
    
    public Mail(String destinataire) {
        initComponents();
        jScrollPanel.getViewport().setBackground(new java.awt.Color(255, 255, 255, 100));
        uiMail.setText(destinataire);
        this.gestionMail = new GestionSMTP();  
    }
    
    private void AbandonnerMouseClicked(java.awt.event.MouseEvent evt){
        gestionMail.closeSMTPCon();
        gestionMail = null;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DestinationText = new javax.swing.JScrollPane();
        uiMail = new javax.swing.JTextArea();
        ObjetText = new javax.swing.JScrollPane();
        uiObjet = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPanel = new javax.swing.JScrollPane();
        uiMsg = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        Abandonner = new javax.swing.JButton();
        Envoyer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        uiMail.setColumns(20);
        uiMail.setRows(5);
        DestinationText.setViewportView(uiMail);

        uiObjet.setColumns(20);
        uiObjet.setRows(5);
        ObjetText.setViewportView(uiObjet);

        jLabel1.setText("Destinataire :");

        jLabel2.setText("Objet :");

        uiMsg.setColumns(20);
        uiMsg.setRows(5);
        jScrollPanel.setViewportView(uiMsg);

        jLabel3.setText("Mail : ");

        jButton.setText("Envoyer ! ");
        jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnvoyerMouseClicked(evt);
            }
        });
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        Abandonner.setText("Abandonner");
        Abandonner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbandonnerActionPerformed(evt);
            }
        });

        Envoyer.setText("Envoyer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(ObjetText)
                    .addComponent(DestinationText))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Envoyer)
                .addGap(109, 109, 109)
                .addComponent(jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Abandonner)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(DestinationText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ObjetText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Abandonner, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Envoyer))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActionPerformed
    @SuppressWarnings("CallToPrintStackTrace")
    private void EnvoyerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnvoyerMouseClicked
        gestionMail.setMailTo(uiMail.getText().strip());
        gestionMail.setMailObj(uiObjet.getText().strip());
        gestionMail.setMailMsg(uiMsg.getText());
            try{
                gestionMail.sendMsg();
            } catch (Exception ev){
                ev.printStackTrace();
            }
            
    }//GEN-LAST:event_EnvoyerMouseClicked

    private void AbandonnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbandonnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbandonnerActionPerformed

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
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mail("guillaume.viney@st2msi.net").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abandonner;
    private javax.swing.JScrollPane DestinationText;
    private javax.swing.JButton Envoyer;
    private javax.swing.JScrollPane ObjetText;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JTextArea uiMail;
    private javax.swing.JTextArea uiMsg;
    private javax.swing.JTextArea uiObjet;
    // End of variables declaration//GEN-END:variables

    void setVisibile(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}