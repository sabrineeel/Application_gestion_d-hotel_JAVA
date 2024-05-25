
package vues;

import java.awt.*;
import javax.swing.*;

import modele.Admin;

public class admin1 extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    public admin1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 310, 180, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 370, 170, 40);

        username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        username.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(username);
        username.setBounds(580, 310, 260, 40);

        password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        password.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(password);
        password.setBounds(580, 370, 260, 40);

        jButton1.setBackground(new java.awt.Color(241, 228, 203));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 450, 180, 50);

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jCheckBox1.setText("View password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(670, 410, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/admin login.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);

        pack();
    }                       

                            
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String enteredUsername = username.getText();
        String enteredPassword = new String(password.getPassword());
        Admin admin = new Admin();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username and password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (admin.authenticateAdmin(enteredUsername, enteredPassword)) {
            admin2 adm2 = new admin2();
            adm2.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

               

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox1.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }                                          

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin1().setVisible(true);
            }
        });
    }
}
