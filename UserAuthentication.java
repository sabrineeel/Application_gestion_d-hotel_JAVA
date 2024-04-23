
package javaapplication3;
import java.util.HashMap;
import java.util.Map;
import java .sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication3.UserInfo;
import javaapplication3.UserInfo.Gender;
public class UserAuthentication {    
   //la connection avec database:
 static Statement ss;  
static String que;
 static Connection c;
static String user="root";
static String pwd="computerhayat";
static String url="jdbc:mysql://localhost:3306/hotel";
//les variables de connection|


protected Map<String, String> LoginInfouser; // Map to store username (or email) and password
protected Map<String, String> LoginInfoAdmin;
//map to store user information:
protected Map<String, UserInfo> userInfoMap;
protected Map<String,AdminInfo>adminInfoMap;
//constrecteur:

        


//le code normale :

 
  
   // Method to sign up a new user
    public void SignUp(String username, String password, String name, String familyName, Date date, String address, String email, Gender gender, String phoneNumber) {
       
        // Store username and password
        LoginInfouser.put(username, password);
    

        // Store user information
        userInfoMap.put(username, new UserInfo(name, familyName, date, address, email, gender, phoneNumber));
     try {
         ss=c.createStatement();
         que = "INSERT INTO user VALUES ('" + name + "','" + familyName + "','" + date + "','" + address + "','" + email + "','" + gender + "','" + phoneNumber + "','" +password+"')" ;
        ss.execute(que);
       
        String q = "INSERT INTO LoginInfo VALUES ('" + username + "','" + password + "')";
           ss.execute(q);
            System.out.println("Insert!");
     } catch (SQLException ex) {
         Logger.getLogger(UserAuthentication.class.getName()).log(Level.SEVERE, null, ex);
     }       
    }//fin.
      // Method to authenticate user during login
     public boolean login(String username, String password) {
        // Check if the username exists and if the password matches
        return LoginInfouser.containsKey(username) && LoginInfouser.get(username).equals(password);
    }
// Method to sign up a new admin
     public void SignUpAdmin(String username, String password, String name, String familyName, Date date, String address, String email, String phoneNumber, Gender gender, String adminRole) {
        // Store username and password
        LoginInfoAdmin.put(username, password);

        // Store admin information
        adminInfoMap.put(username, new AdminInfo(name, familyName, date, address, email, gender, phoneNumber,adminRole ));
         try {
         ss=c.createStatement();
         que = "INSERT INTO Admin VALUES ('" + name + "','" + familyName + "','" + date + "','" + address + "','" + email + "','" + gender + "','" + phoneNumber + "','" +password+"','"+adminRole+"')" ;
        ss.execute(que);
        String q = "INSERT INTO LoginInfoAdmin VALUES ('" + username + "','" + password + "')";
           ss.execute(q);
        System.out.println("inseret !");
        
     } catch (SQLException ex) {
         Logger.getLogger(UserAuthentication.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
     //classe les informations de l'admine :
       class AdminInfo extends UserInfo {
        private String adminRole;
        public AdminInfo(String name, String familyName, Date date, String address, String email, Gender gender, String phoneNumber, String adminRole) {
            super(name, familyName, date, address, email,gender, phoneNumber);
            this.adminRole = adminRole;
        }
        public String getAdminRole() {
            return adminRole;}

    }
  
  
 public static void main(String[] args) throws SQLException {
 //connecter:
  c=DriverManager.getConnection(url,user,pwd);
         
    }
    
     }

