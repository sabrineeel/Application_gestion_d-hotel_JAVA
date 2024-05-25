package vues;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Page4 extends javax.swing.JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;

    public Page4() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton6 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel8 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        jLabel9 = new JLabel();
        jButton9 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel10 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setBackground(new java.awt.Color(241, 228, 203));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/home_icon-icons.com_73532.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1078, 20, 50, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setText("Family name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 220, 200, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setText("First name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 270, 200, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel3.setText("Date of birth:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 320, 200, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel4.setText("Gender:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 370, 190, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel5.setText("E-mail:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 420, 200, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel8.setText("ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 170, 200, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel6.setText("Phone Number:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 470, 200, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 520, 200, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField1.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(720, 220, 300, 30);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField2.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(720, 270, 300, 30);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField3.setPreferredSize(new java.awt.Dimension(300, 30));
        jTextField3.addActionListener(new

        java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(720, 170, 300, 30);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField4.setPreferredSize(new java.awt.Dimension(300, 30));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(720, 320, 300, 30);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField5.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(720, 370, 300, 30);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField6.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(720, 420, 300, 30);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField7.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(720, 470, 300, 30);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jTextField8.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(720, 520, 300, 30);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 0, 0);

        jButton9.setBackground(new java.awt.Color(241, 228, 203));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/account_avatar_face_man_people_profile_user_icon_123197.png"))); // NOI18N
        jButton9.setText("Profile");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.setVerifyInputWhenFocusTarget(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 220, 350, 50);

        jButton2.setBackground(new java.awt.Color(241, 228, 203));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36));
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
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 36));
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
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36));
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
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36));
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/Profile.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1200, 750);

        pack();
    }            

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    Page3 page3 = new Page3();
        page3.setVisible(true);
        this.dispose();
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        Page4 page4 = new Page4();
        page4.setVisible(true);
        this.dispose();}
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
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    Page1 page1 = new Page1();
    page1.setVisible(true);
    this.dispose();
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page4().setVisible(true);
            }
        });
    }

}
