package vues;
public class admin4 extends javax.swing.JFrame {
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;

    public admin4() {
        initComponents();        
           this.setLocationRelativeTo(null);

    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(241, 228, 203));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type", "Model", "Situation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(790, 100, 350, 150);

        jButton2.setBackground(new java.awt.Color(241, 228, 203));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Accept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 170, 120, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 110, 70, 40);

        jTextField1.setBackground(new java.awt.Color(241, 228, 203));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(470, 110, 300, 40);

        jTable2.setBackground(new java.awt.Color(241, 228, 203));
        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Arrival Date", "Date of Departure", "N° of Adults", "N° of childrens", "Room Type", "Room model"
            }
        ));
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(410, 270, 730, 320);

        jButton3.setBackground(new java.awt.Color(241, 228, 203));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Refuse");
        getContentPane().add(jButton3);
        jButton3.setBounds(650, 170, 120, 40);

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

        jButton5.setBackground(new java.awt.Color(241, 228, 203));
        jButton5.setForeground(new java.awt.Color(241, 228, 203));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-déconnexion-arrondi-30.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1090, 20, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/Manages reservation  by admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);

        pack();
    } 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        admin2 adm2 = new admin2();
        adm2.setVisible(true);
        this.dispose();       }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        admin1 adm1 = new admin1();
        adm1.setVisible(true);
        this.dispose();        
    }
}
