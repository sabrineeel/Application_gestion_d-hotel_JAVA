package vues;
public class admin2 extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
   public admin2() {
    
        initComponents();
                this.setLocationRelativeTo(null);
    
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(241, 228, 203));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton1.setText("Manage rooms");
        jButton1.setPreferredSize(new java.awt.Dimension(370, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 540, 370, 50);

        jButton2.setBackground(new java.awt.Color(241, 228, 203));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton2.setText("Manage reservations");
        jButton2.setPreferredSize(new java.awt.Dimension(370, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 540, 370, 50);

        jButton6.setBackground(new java.awt.Color(241, 228, 203));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-en-bas-à-gauche-30.png"))); 
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1040, 20, 40, 40);

        jButton3.setBackground(new java.awt.Color(241, 228, 203));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-déconnexion-arrondi-30.png"))); 
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1090, 20, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/Admin2 accueil.jpg"))); 
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    admin3 adm4 = new admin3();
    adm4.setVisible(true);
    this.dispose();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         admin4 adm7 = new admin4();
        adm7.setVisible(true);
        this.dispose();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
admin1 adm1 = new admin1();
        adm1.setVisible(true);
        this.dispose();        
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
admin1 adm1 = new admin1();
        adm1.setVisible(true);
        this.dispose();       
       
    }
   
}
