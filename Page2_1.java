package vues;

import javax.swing.JOptionPane;

public class Page2_1 extends javax.swing.JFrame {
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton Login;
      private javax.swing.JTextField Username;
      private javax.swing.JCheckBox jCheckBox1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JPasswordField jPasswordField1;

    public Page2_1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Login = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setBackground(new java.awt.Color(249, 235, 199));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Login.setText("Signup");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(740, 470, 170, 45);

        Username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username);
        Username.setBounds(460, 300, 450, 45);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPasswordField1.setMinimumSize(new java.awt.Dimension(400, 45));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(460, 380, 450, 45);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user.png"))); // NOI18N
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 300, 200, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/eye closed.png"))); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 380, 190, 40);

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jCheckBox1.setText("View password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(740, 430, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/loginpageee.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1020, 580);

        pack();
    }// </editor-fold>                        

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String username = Username.getText();
        String password = new String(jPasswordField1.getPassword());

        if(username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "You must fill in both username and password fields.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
        } else {                              
            // Créer une instance de la page3
            Page3 page3 = new Page3();
    
            // Rendre la page3 visible
            page3.setVisible(true);
    
            // Fermer la page actuelle (Page1)
            this.dispose();
        }
    }                                     

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        } else {
            jPasswordField1.setEchoChar('*');
        }
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
            java.util.logging.Logger.getLogger(Page2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page2_1().setVisible(true);
            }
        });
    }

  
}
