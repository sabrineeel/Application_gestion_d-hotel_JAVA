package POO;
import java.util.HashMap;
import java.util.Map;

enum Gender {
    Women,men;
}
public class UserAuthentication {
    protected Map<String, String> LoginInfo; // Map to store username (or email) and password
    protected Map<String, UserInfo> userInfoMap; // Map to store user information
    protected Map<String, AdminInfo> adminInfoMap; // Map to store admin information
    protected Gender gender;

    public UserAuthentication() {
        LoginInfo = new HashMap<>();
        userInfoMap = new HashMap<>();
        adminInfoMap = new HashMap<>();
    }




    
    // Method to sign up a new user
    public void SignUp(String username, String password, String name, String familyName, Date date, String address, String email ,String phoneNumber , Gender gender) {
       
        // Store username and password
        LoginInfo.put(username, password);

        // Store user information
        userInfoMap.put(username, new UserInfo(name, familyName, date, address, email, gender, phoneNumber));
    }




     // Method to authenticate user during login
     public boolean login(String username, String password) {
        // Check if the username exists and if the password matches
        return LoginInfo.containsKey(username) && LoginInfo.get(username).equals(password);
    }





    // Method to recover account if the user forgets the password
    public boolean ForgetPassword(String username, String email) {
    // Check if the username exists and if the provided email matches the stored email
    return userInfoMap.containsKey(username) && userInfoMap.get(username).getEmail().equals(email); 
    } 







    private static class UserInfo {
        private String name;
        private String familyName;
        private Date date;
        private String address;
        private String email;
        private String phoneNumber;
        private Gender gender;

        public UserInfo(String name, String familyName, Date date, String address, String email , Gender gender, String phoneNumber) {
            this.name = name;
            this.familyName = familyName;
            this.date = date;
            this.address = address;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }        
    }







     // Method to sign up a new admin
     public void SignUpAdmin(String username, String password, String name, String familyName, Date date, String address, String email, String phoneNumber, Gender gender, String adminRole) {
        // Store username and password
        LoginInfo.put(username, password);

        // Store admin information
        adminInfoMap.put(username, new AdminInfo(name, familyName, date, address, email, gender, phoneNumber,adminRole ));
    }

    private static class AdminInfo extends UserInfo {
        private String adminRole;
        public AdminInfo(String name, String familyName, Date date, String address, String email, Gender gender, String phoneNumber, String adminRole) {
            super(name, familyName, date, address, email, gender, phoneNumber);
            this.adminRole = adminRole;
        }
        public String getAdminRole() {
            return adminRole;}

    }


}
