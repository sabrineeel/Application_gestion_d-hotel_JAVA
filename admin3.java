package vues;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modele.*;

public class admin3 extends javax.swing.JFrame {
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> model;
    private javax.swing.JComboBox<String> type;
    Admin admin = new Admin();
    public admin3() {
        initComponents();
         this.setLocationRelativeTo(null);

    }
     @SuppressWarnings("unchecked")
     private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jButton2 = new javax.swing.JButton();
         jButton3 = new javax.swing.JButton();
         jButton4 = new javax.swing.JButton();
         type = new javax.swing.JComboBox<>();
         model = new javax.swing.JComboBox<>();
         jButton6 = new javax.swing.JButton();
         jButton5 = new javax.swing.JButton();
         jLabel4 = new javax.swing.JLabel();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
         jTable1.setBackground(new java.awt.Color(241, 228, 203));
         jTable1.setFont(new java.awt.Font("Times New Roman", 1, 24));
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {
 
             },
             new String [] {
                 "ID", "Type", "For", "Situation"
             }
         ) {
             boolean[] canEdit = new boolean [] {
                 false, false, false, false
             };
 
             public boolean isCellEditable(int rowIndex, int columnIndex) {
                 return canEdit [columnIndex];
             }
         });
         jTable1.setRowHeight(30);
         jTable1.setSelectionBackground(new java.awt.Color(241, 228, 203));
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 jTable1MouseClicked(evt);
             }
         });
         jScrollPane1.setViewportView(jTable1);
         if (jTable1.getColumnModel().getColumnCount() > 0) {
             jTable1.getColumnModel().getColumn(0).setResizable(false);
             jTable1.getColumnModel().getColumn(2).setResizable(false);
         }
 
         getContentPane().add(jScrollPane1);
         jScrollPane1.setBounds(440, 240, 660, 320);
 
         jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
         jLabel1.setText("Room Type:");
         getContentPane().add(jLabel1);
         jLabel1.setBounds(540, 110, 130, 40);
 
         jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
         jLabel2.setText("Model:");
         getContentPane().add(jLabel2);
         jLabel2.setBounds(860, 110, 80, 40);
 
         jButton2.setBackground(new java.awt.Color(241, 228, 203));
         jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24));
         jButton2.setText("Add");
         jButton2.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton2ActionPerformed(evt);
             }
         });
         getContentPane().add(jButton2);
         jButton2.setBounds(630, 170, 140, 40);
 
         jButton3.setBackground(new java.awt.Color(241, 228, 203));
         jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24));
         jButton3.setText("Delete");
         jButton3.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton3ActionPerformed(evt);
             }
         });
         getContentPane().add(jButton3);
         jButton3.setBounds(960, 170, 140, 40);
 
         jButton4.setBackground(new java.awt.Color(241, 228, 203));
         jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24));
         jButton4.setText("Update");
         jButton4.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton4ActionPerformed(evt);
             }
         });
         getContentPane().add(jButton4);
         jButton4.setBounds(790, 170, 150, 40);
 
         type.setBackground(new java.awt.Color(241, 228, 203));
         type.setFont(new java.awt.Font("Times New Roman", 1, 24));
         type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vip", "Regular" }));
         type.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 typeActionPerformed(evt);
             }
         });
         getContentPane().add(type);
         type.setBounds(680, 110, 160, 40);
 
         model.setBackground(new java.awt.Color(241, 228, 203));
         model.setFont(new java.awt.Font("Times New Roman", 1, 24));
         model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADULTS", "ADULTS1", "ADULTS2", "ADULTS3" }));
         model.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 modelActionPerformed(evt);
             }
         });
         getContentPane().add(model);
         model.setBounds(940, 110, 160, 40);
 
         jButton6.setBackground(new java.awt.Color(241, 228, 203));
         jButton6.setForeground(new java.awt.Color(241, 228, 203));
         jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-en-bas-à-gauche-30.png"))); 
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
         jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8-déconnexion-arrondi-30.png"))); 
         jButton5.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton5ActionPerformed(evt);
             }
         });
         getContentPane().add(jButton5);
         jButton5.setBounds(1090, 20, 40, 40);
 
         jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/Manages room by admin.jpg"))); 
         getContentPane().add(jLabel4);
         jLabel4.setBounds(0, 0, 1150, 650);
 
         pack();
     }
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedType = (String) type.getSelectedItem();
        String selectedModel = (String) model.getSelectedItem();
    
        // Convertir la chaîne en casse correcte pour correspondre aux constantes d'énumération
        Room.Type roomType = Room.Type.valueOf(selectedType.toUpperCase());
        Room.RoomModel roomModel = Room.RoomModel.valueOf(selectedModel.toUpperCase());
    
        admin.addRoom(roomType, roomModel);
    
        JOptionPane.showMessageDialog(this, "Room added successfully!");
    }
    
    private void modelActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    int selectedRow = jTable1.getSelectedRow();
    Object id = jTable1.getValueAt(selectedRow, 0);
    Object roomType = jTable1.getValueAt(selectedRow, 1);
    Object roomFor = jTable1.getValueAt(selectedRow, 2);
        type.setSelectedItem(roomType);
    model.setSelectedItem(roomFor);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow != -1) {
            int roomNumber = (int) jTable1.getValueAt(selectedRow, 0); // Assuming room number is in the first column
            String typeString = (String) jTable1.getValueAt(selectedRow, 1); // Assuming room type is in the second column
            String modelString = (String) jTable1.getValueAt(selectedRow, 2); // Assuming room model is in the third column
                
            try {
                // Convertir la chaîne en casse correcte pour correspondre aux constantes d'énumération
                Room.Type roomType = Room.Type.valueOf(typeString.toUpperCase());
                Room.RoomModel roomModel = Room.RoomModel.valueOf(modelString.toUpperCase());
    
                // Appeler deleteRoom() et afficher le message approprié en fonction de la valeur retournée
                if (admin.deleteRoom(roomNumber)) {
                    JOptionPane.showMessageDialog(this, "Room deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Room not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IllegalArgumentException e) {
                // La conversion de chaîne en énumération a échoué
                JOptionPane.showMessageDialog(this, "Invalid room type or model!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No row selected", JOptionPane.ERROR_MESSAGE);
        }
    }
    




    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow != -1) {
            int roomNumber = (int) jTable1.getValueAt(selectedRow, 0); // Assuming room number is in the first column
            String typeString = (String) jTable1.getValueAt(selectedRow, 1); // Assuming room type is in the second column
            String modelString = (String) jTable1.getValueAt(selectedRow, 2); // Assuming room model is in the third column
                
            try {
                // Convertir la chaîne en casse correcte pour correspondre aux constantes d'énumération
                Room.Type roomType = Room.Type.valueOf(typeString.toUpperCase());
                Room.RoomModel roomModel = Room.RoomModel.valueOf(modelString.toUpperCase());
    
                // Appeler updateRoomSituation() et afficher le message approprié en fonction de la valeur retournée
                if (admin.updateRoomSituation(roomNumber, roomType, roomModel)) {
                    JOptionPane.showMessageDialog(this, "Room updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Room not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IllegalArgumentException e) {
                // La conversion de chaîne en énumération a échoué
                JOptionPane.showMessageDialog(this, "Invalid room type or model!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.", "No row selected", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        admin2 adm2 = new admin2();
        adm2.setVisible(true);
        this.dispose();      
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        admin1 adm1 = new admin1();
        adm1.setVisible(true);
        this.dispose();    

    }
}
