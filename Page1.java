package vues;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Page1 extends javax.swing.JFrame {

    public Page1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Singup = new JButton();
        Login = new JButton();
        Username = new JTextField();
        jPasswordField1 = new JPasswordField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jCheckBox1 = new JCheckBox();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Singup.setBackground(new java.awt.Color(249, 235, 199));
        Singup.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Singup.setText("Signup");
        Singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingupActionPerformed(evt);
            }
        });
        getContentPane().add(Singup);
        Singup.setBounds(560, 470, 160, 45);

        Login.setBackground(new java.awt.Color(249, 235, 199));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(750, 470, 160, 45);

        Username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(Username);
        Username.setBounds(460, 300, 450, 45);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("You don't have an account?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 480, 350, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/loginpageee.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1080, 650);

        pack();
    }// </editor-fold>

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = Username.getText();
        String password = new String(jPasswordField1.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
         JOptionPane.showMessageDialog(null, "You must fill in both username and password fields.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);

        } else {
            // Créer une instance de la page3
            Page3 page3 = new Page3();

            // Rendre la page3 visible
            page3.setVisible(true);

            // Fermer la page actuelle (Page1)
            this.dispose();
        }
    }

    private void SingupActionPerformed(java.awt.event.ActionEvent evt) {
        // Créer une instance de la Page2
        Page2 page2 = new Page2();

        // Rendre la Page2 visible
        page2.setVisible(true);

        // Fermer la page actuelle (Page1)
        this.dispose();
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
        }
    }
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
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Login;
    private javax.swing.JButton Singup;
    private javax.swing.JTextField Username;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    // End of
}