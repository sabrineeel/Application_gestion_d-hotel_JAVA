package vues;

import modele.UserInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Page2 extends javax.swing.JFrame {

    public Page2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Family name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 150, 140, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("First name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 200, 110, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Date of birth:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 250, 150, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Gender:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 300, 110, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("E-mail:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 350, 110, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Phone Number:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 400, 180, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Address:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 450, 110, 40);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(470, 150, 400, 40);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(470, 200, 400, 40);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(470, 250, 400, 40);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField10);
        jTextField10.setBounds(470, 350, 400, 40);

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField11);
        jTextField11.setBounds(470, 400, 400, 40);

        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField12);
        jTextField12.setBounds(470, 450, 400, 40);

        jComboBox2.setBackground(new java.awt.Color(249, 235, 199));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEN", "WOMEN" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(470, 300, 400, 40);

        jButton2.setBackground(new java.awt.Color(249, 235, 199));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(690, 510, 180, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssh/hotel/photo/signup.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 570);

        pack();
    }// </editor-fold>                        

                         
}

   
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // Récupérer les valeurs des champs de texte et de la liste déroulante
    String name = jTextField8.getText();
    String familyName = jTextField1.getText();
    String dateOfBirthStr = jTextField9.getText();
    String genderStr = (String) jComboBox2.getSelectedItem();
    String email = jTextField10.getText();
    String phoneNumber = jTextField11.getText();
    String address = jTextField12.getText();
    UserInfo.Gender gender = UserInfo.Gender.valueOf(genderStr); // Use valueOf()

    // Définir le format de date attendu dans la chaîne
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date dateOfBirth = null;

    try {
        // Convertir la chaîne de date en un objet Date en utilisant le format défini
        dateOfBirth = dateFormat.parse(dateOfBirthStr);
    } catch (ParseException e) {
        // En cas d'erreur de parsing de la date
        e.printStackTrace(); // Gestion plus élaborée de l'erreur catch (ParseException e) {
    // En cas d'erreur de parsing de la date
    e.printStackTrace(); // Gestion plus élaborée de l'erreur peut être ajoutée ici
    JOptionPane.showMessageDialog(this, "Invalid date format. Please enter the date in yyyy/MM/dd format.", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Arrêtez le traitement supplémentaire si la validation échoue
}               

// Créer un objet UserInfo
UserInfo userInfo = new UserInfo();

// Valider les informations utilisateur en utilisant une méthode de validation
String errorMessage = isValidInfo(userInfo);
if (errorMessage != null) {
    JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    return; // Arrêtez le traitement supplémentaire si la validation échoue
}

// Créer une instance de la Page2_1
Page2_1 p2 = new Page2_1();

// Rendre la Page2_1 visible
p2.setVisible(true);

// Fermer la page actuelle
this.dispose();
}

// Méthode de validation des informations utilisateur
private String isValidInfo(UserInfo userInfo) {
// Implémentez votre logique de validation ici
// Si les informations sont valides, retournez null
// Sinon, retournez un message d'erreur approprié
return null;
}

private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:
}                                           

private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
}                                            

// Méthode principale
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
    java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
//</editor-fold>

/* Créez et affichez le formulaire */
java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Page2().setVisible(true);
    }
});
}

// Variables declaration - ne pas modifier//GEN-BEGIN:variables
private javax.swing.JButton jButton2;
private javax.swing.JComboBox<String> jComboBox2;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JTextField jTextField1;
private javax.swing.JTextField jTextField10;
private javax.swing.JTextField jTextField11;
private javax.swing.JTextField jTextField12;
private javax.swing.JTextField jTextField8;
private javax.swing.JTextField jTextField9;
// Fin de la déclaration des variables//GEN-END:variables
}
