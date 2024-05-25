package vues;

import javax.swing.JOptionPane;

import modele.Reservation;

public class Page5 extends javax.swing.JFrame {
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton11;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JButton jButton5;
      private javax.swing.JButton jButton7;
      private javax.swing.JButton jButton8;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JTable jTable2;
    public int reservationId;

    public Page5() {
        initComponents();
     this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
      private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton7.setBackground(new java.awt.Color(241, 228, 203));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton7.setText("Modify reservation");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(630, 450, 260, 40);

        jButton8.setBackground(new java.awt.Color(241, 228, 203));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton8.setText("Cancel reservation");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(870, 450, 260, 40);

        jButton1.setBackground(new java.awt.Color(241, 228, 203));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/account_avatar_face_man_people_profile_user_icon_123197.png"))); // NOI18N
        jButton1.setText("Profile");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 220, 350, 50);

        jButton2.setBackground(new java.awt.Color(241, 228, 203));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/3586371-calendar-date-event-schedule_107943.png"))); // NOI18N
        jButton2.setText("My reservations ");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 300, 350, 50);

        jButton3.setBackground(new java.awt.Color(241, 228, 203));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/add_circle_create_expand_new_plus_icon_123218.png"))); // NOI18N
        jButton3.setText("ADD Reservation ");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 380, 350, 50);

        jButton4.setBackground(new java.awt.Color(241, 228, 203));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/about_3697.png"))); // NOI18N
        jButton4.setText("About");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 460, 350, 50);

        jButton5.setBackground(new java.awt.Color(241, 228, 203));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jButton5.setText("Logout");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 540, 350, 50);

        jButton11.setBackground(new java.awt.Color(241, 228, 203));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/home_icon-icons.com_73532.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(1078, 20, 50, 50);

        jTable2.setBackground(new java.awt.Color(241, 228, 203));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Arrival Date", "Date of Departure", "N° of Adults", "N° of childrens", "Room Type", "Room model"
            }
        ));
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(410, 160, 730, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/my reservation.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 580);

        pack();
    }                       


 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Page4 page4 = new Page4();  
        page4.setVisible(true);

        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Page5 page5 = new Page5();
        page5.setVisible(true);
        this.dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Page8 page8 = new Page8();
        page8.setVisible(true);
        this.dispose();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Page9 page9 = new Page9();
        page9.setVisible(true);
        this.dispose();
    }

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        // Récupérer l'index de la ligne sélectionnée
        int rowIndex = jTable2.getSelectedRow();
        // Récupérer la valeur de la première colonne de la ligne sélectionnée
        String selectedValue = jTable2.getValueAt(rowIndex, 0).toString();
        // Stocker la valeur dans une variable (par exemple, une variable globale)
       String selectedReservationId = selectedValue;
       
        int reservationId = Integer.parseInt(selectedReservationId);


    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // Récupérer l'ID de la réservation sélectionnée depuis la première colonne de la table
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) { // Vérifier si une ligne est sélectionnée
            int reservationId = (int) jTable2.getValueAt(selectedRow, 0); // Supposons que l'ID est dans la première colonne
            // Afficher la boîte de dialogue de confirmation
            int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez-vous modifier la réservation de l'ID = " + reservationId + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Si l'utilisateur clique sur Oui, passer à la page 6 pour modifier la réservation
                Page6 page6 = new Page6();
                page6.setVisible(true);
                this.dispose();
            } else {
                // Si l'utilisateur clique sur Non ou ferme la boîte de dialogue, ne rien faire
            }
        } else {
            // Si aucune ligne n'est sélectionnée, afficher un message d'erreur
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une réservation à modifier.", "Aucune réservation sélectionnée", JOptionPane.ERROR_MESSAGE);
        }
    }
    
   
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // Récupérer l'ID de la réservation sélectionnée depuis la première colonne de la table
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) { // Vérifier si une ligne est sélectionnée
            int reservationId = (int) jTable2.getValueAt(selectedRow, 0); // Supposons que l'ID est dans la première colonne
            // Afficher la boîte de dialogue de confirmation
            int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer  la réservation de l'ID = " + reservationId + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Si l'utilisateur clique sur Oui, passer à la page 6 pour modifier la réservation
                Page7 page7 = new Page7();
                page7.setVisible(true);
                this.dispose();
            } else {
                // Si l'utilisateur clique sur Non ou ferme la boîte de dialogue, ne rien faire
            }
        } else {
            // Si aucune ligne n'est sélectionnée, afficher un message d'erreur
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une réservation à modifier.", "Aucune réservation sélectionnée", JOptionPane.ERROR_MESSAGE);
        }
    }
    



    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    Page1 page1 = new Page1();
    page1.setVisible(true);
    this.dispose();
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        Page3 page3 = new Page3();
        page3.setVisible(true);
        this.dispose();
    }

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page5().setVisible(true);
            }
        });
    }

  

}
