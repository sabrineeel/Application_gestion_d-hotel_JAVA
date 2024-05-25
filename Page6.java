package vues;

import javax.swing.JOptionPane;

import modele.Date;
import modele.UserInfo;

public class Page6 extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;

    public Page6() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setBackground(new java.awt.Color(241, 228, 203));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-en-bas-à-gauche-30.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1090, 20, 40, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setText("Arrival Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(490, 180, 220, 30);

        jTextField3.setBackground(new java.awt.Color(241, 228, 203));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(660, 130, 270, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 130, 80, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel5.setText("Date of Departure :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 230, 210, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel6.setText("Number of adults:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 300, 190, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel7.setText("Number of childrens:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(760, 300, 230, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel8.setText("Room type :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 340, 140, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel9.setText("Room model:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(760, 340, 140, 30);

        jComboBox1.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(710, 180, 70, 30);

        jComboBox2.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(780, 180, 70, 30);

        jComboBox3.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(850, 180, 90, 30);

        jComboBox7.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox7.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(650, 300, 80, 30);

        jComboBox8.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox8.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(990, 300, 100, 30);

        jComboBox9.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox9.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "REGULAR" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(650, 340, 80, 30);

        jComboBox10.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox10.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADULTS", "ADULTS1", "ADULTS2"," ADULTS3 "}));
        getContentPane().add(jComboBox10);
        jComboBox10.setBounds(990, 340, 100, 30);

        jButton1.setBackground(new java.awt.Color(241, 228, 203));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(866, 400, 220, 40);

        jButton4.setBackground(new java.awt.Color(241, 228, 203));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/account_avatar_face_man_people_profile_user_icon_123197.png"))); // NOI18N
        jButton4.setText("Profile");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 220, 350, 50);

        jButton5.setBackground(new java.awt.Color(241, 228, 203));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/3586371-calendar-date-event-schedule_107943.png"))); // NOI18N
        jButton5.setText("My reservations ");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 300, 350, 50);

        jButton7.setBackground(new java.awt.Color(241, 228, 203));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/add_circle_create_expand_new_plus_icon_123218.png"))); // NOI18N
        jButton7.setText("ADD Reservation ");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(20, 380, 350, 50);

        jButton8.setBackground(new java.awt.Color(241, 228, 203));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/about_3697.png"))); // NOI18N
        jButton8.setText("About");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(20, 460, 350, 50);

        jButton9.setBackground(new java.awt.Color(241, 228, 203));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jButton9.setText("Logout");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 540, 350, 50);

        jComboBox11.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox11.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox11);
        jComboBox11.setBounds(710, 230, 70, 30);

        jComboBox12.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox12.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox12);
        jComboBox12.setBounds(780, 230, 70, 30);

        jComboBox13.setBackground(new java.awt.Color(241, 228, 203));
        jComboBox13.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox13);
        jComboBox13.setBounds(850, 230, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/Modify.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 530);

        pack();
    } 


    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    Page5 page5 = new Page5();
    page5.setVisible(true);
    this.dispose();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)  {}
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt){}

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Page4 page4 = new Page4();
        page4.setVisible(true);
        this.dispose();
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        Page5 page5 = new Page5();
        page5.setVisible(true);
        this.dispose();}

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        Page8 page8 = new Page8();
        page8.setVisible(true);
        this.dispose();
      }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        Page9 page9 = new Page9();
        page9.setVisible(true);
        this.dispose();
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)  {
        Page1 page1 = new Page1();

        page1.setVisible(true);
        this.dispose();}

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Récupérer les valeurs sélectionnées dans les JComboBoxes
        int startDay = Integer.parseInt((String) jComboBox1.getSelectedItem());
        int startMonth = Integer.parseInt((String) jComboBox2.getSelectedItem());
        int startYear = Integer.parseInt((String) jComboBox3.getSelectedItem());
        int endDay = Integer.parseInt((String) jComboBox11.getSelectedItem());
        int endMonth = Integer.parseInt((String) jComboBox12.getSelectedItem());
        int endYear = Integer.parseInt((String) jComboBox13.getSelectedItem());
        int numberOfAdults = Integer.parseInt((String) jComboBox7.getSelectedItem());
        int numberOfChildren = Integer.parseInt((String) jComboBox8.getSelectedItem());
        modele.UserInfo.Type roomType = modele.UserInfo.Type.valueOf((String) jComboBox9.getSelectedItem());
        modele.UserInfo.RoomModel roomModel = modele.UserInfo.RoomModel.valueOf((String) jComboBox10.getSelectedItem());
    
        // Créer les objets Date pour startDate et endDate
        Date startDate = new Date(startYear, startMonth, startDay);
        Date endDate = new Date(endYear, endMonth, endDay);
    
        // Appeler la méthode addReservation avec les valeurs récupérées
        UserInfo user = new UserInfo(); // Vous devez instancier UserInfo
        Page5 page5=new Page5();
        int x=page5.reservationId;
        boolean reservation = user.modifyReservation(x,startDate, endDate, roomType, roomModel, numberOfAdults, numberOfChildren);
    
        // Afficher une boîte de dialogue en fonction du résultat de l'ajout de la réservation
        if (reservation) {
            JOptionPane.showMessageDialog(this, "La réservation a été modifier avec succès.");
        } else {
            JOptionPane.showMessageDialog(this, "Erreur lors de la modification de la réservation. Veuillez réessayer.");
        }
    }
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page6().setVisible(true);
            }
        });
    }

}
