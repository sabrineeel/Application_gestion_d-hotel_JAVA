package vues;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class page0 extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;

    public page0() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton6 = new JButton();
        jButton3 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        jButton1.setBackground(new java.awt.Color(241, 228, 203));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton1.setText("User");
        jButton1.setPreferredSize(new java.awt.Dimension(250, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 520, 300, 60);

        jButton2.setBackground(new java.awt.Color(241, 228, 203));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton2.setText("Admin");
        jButton2.setPreferredSize(new java.awt.Dimension(250, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 520, 300, 60);

        jButton6.setBackground(new java.awt.Color(241, 228, 203));
        jButton6.setForeground(new java.awt.Color(241, 228, 203));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-en-bas-à-gauche-30.png"))); // NOI18N
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1040, 20, 40, 40);

        jButton3.setBackground(new java.awt.Color(241, 228, 203));
        jButton3.setForeground(new java.awt.Color(241, 228, 203));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-déconnexion-arrondi-30.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1090, 20, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/page0.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 650);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Créer une instance de la page3
        Page1 p1 = new Page1();

        // Rendre la page3 visible
        p1.setVisible(true);

        // Fermer la page actuelle (Page1)
        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        admin1 adm1 = new admin1();

        // Rendre la page3 visible
        adm1.setVisible(true);

        // Fermer la page actuelle (Page1)
        this.dispose();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        admin1 adm1 = new admin1();

        // Rendre la page3 visible
        adm1.setVisible(true);

        // Fermer la page actuelle (Page1)
        this.dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        admin1 adm1 = new admin1();

        // Rendre la page3 visible
        adm1.setVisible(true);

        // Fermer la page actuelle (Page1)
        this.dispose();
    }

   
  
}
