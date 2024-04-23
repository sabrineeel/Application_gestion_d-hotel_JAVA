
package javaapplication3;

import java.util.ArrayList;
import java.util.Scanner;

   
   public class UserInfo {
     enum Gender {
    Women,men;
}//class information of users :

        private String name;
        private String familyName;
        private Date date;
        private String address;
        private String email;
        private String phoneNumber;
       private Gender gender;
         protected ArrayList<Resarvation> myReservations;
          public UserInfo() {   
    }

        public UserInfo(String name, String familyName, Date date, String address, String email, Gender gender, String phoneNumber) {
            this.name = name;
            this.familyName = familyName;
            this.date = date;
            this.address = address;
            this.email = email;
            this.gender = gender;
            this.phoneNumber = phoneNumber;
            myReservations = new ArrayList<>();
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
        
          public ArrayList<Resarvation> getMyReservations() {
        return myReservations;
    }

    public void setMyReservations(ArrayList<Resarvation> myReservations) {
        this.myReservations = myReservations;
    }
    
    
    
    
    
    
    // Méthode pour créer un nouveau compte client en utilisant UserAuthentication
    public void CreatAcc(UserAuthentication auth,String username, String password,String firstname,String Lastname ,Date dateofBirth ,String eemail,String address ,String phoneNumber,Gender gender){

         // Vérifier si l'authentification n'est pas nulle et si les informations fournies sont valides
         if (auth != null && isValidInfo(username, password, firstname, Lastname, dateofBirth, eemail, address)) {
            // Appeler la méthode SignUp de UserAuthentication pour créer le compte
             auth.SignUp(username, password, firstname, Lastname, dateofBirth, address, eemail,gender, phoneNumber);
            System.out.println("Compte client créé avec succès !");
        } else {
            System.out.println("Impossible de créer le compte client. Veuillez fournir des informations valides.");
        }

    }
    
    
    // Méthode pour valider les informations fournies par l'utilisateur
    private boolean isValidInfo(String username, String password, String firstName, String lastName, Date dateOfBirth, String eemail, String address) {
         // Vérifier si le username contient au minimum 4 caractères
        if (username.length() < 4) {
            System.out.println("Le nom d'utilisateur doit contenir au minimum 4 caractères.");
            return false;
        }
    
        // Vérifier si le password contient au minimum 8 caractères
        if (password.length() < 8) {
            System.out.println("Le mot de passe doit contenir au minimum 8 caractères.");
            return false;
        }
         // Vérifier si l'eemail se termine par "@gemail.com"
        if (!eemail.endsWith("@gemail.com")) {
            System.out.println("L'eemail n'est pas valide.");
            return false;
        }

        // Vérifier si le numéro de téléphone contient exactement 10 caractères
        if (phoneNumber.length() != 10) {
            System.out.println("Le numéro de téléphone doit contenir exactement 10 caractères.");
            return false;
        }

        Date today = Date.now();
        // Vérifier si l'âge est supérieur ou égal à 18
        if (today.getYear()-dateOfBirth.getYear() < 18) {
            System.out.println("L'âge doit être supérieur ou égal à 18 ans.");
            return false;
        }
        return true; 
    }
    
    
    // Méthode pour demander une réservation
    public void RequestReservation(Room room){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start date (YYYY-MM-DD): ");
        String startDateString = sc.nextLine();
        System.out.println("Enter end date (YYYY-MM-DD): ");
        String endDateString = sc.nextLine();

        Date startDate = parseDateString(startDateString);
        Date endDate = parseDateString(endDateString);

        // Check if the dates are valid
        if (startDate == null || endDate == null) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
        }

        System.out.println("Entrez le nombre d'adultes : ");
        int numberOfAdults = sc.nextInt();
        System.out.println("Entrez le nombre d'enfants : ");
        int numberOfChildren = sc.nextInt();
        System.out.println("Entrez le type de chambre (VIP or REGULIER) : ");
        String roomTypeString = sc.next();
        Room.Type roomtype = Room.Type.valueOf(roomTypeString.toUpperCase());
        System.out.println("Entrez le nombre de lits : ");
        int numberOfBeds = sc.nextInt();

        System.out.println("Entrez le type of BED  (SINGLE or DOUBLE) : ");
        String bedTypeString = sc.next();
        Resarvation.TypeBed bedtype = Resarvation.TypeBed.valueOf(bedTypeString.toUpperCase());

                // Create the reservation
        Resarvation reservation = new Resarvation(startDate, endDate, room, numberOfAdults, numberOfChildren, numberOfBeds, bedtype ,roomtype, this);

        // Add the reservation to the client's list of reservations
        addReservation(reservation);
        System.out.println("Reservation requested successfully!");
        sc.close();

    }




    // Méthode pour ajouter une réservation à la liste des réservations de l'utilisateur
        public void addReservation(Resarvation reservation) {
        myReservations.add(reservation);
    }


    //Method to transform date string into date 
    private Date parseDateString(String dateString) {
        try {
            String[] parts = dateString.split("-");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);
            return new Date(year, month, day);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

       
    // Méthode pour modifier une réservation dans la liste des réservations de l'utilisateur
    public void EditReservation(Resarvation oldreservation, Resarvation newreservation){
        if (myReservations.contains(oldreservation)){
            int index = myReservations.indexOf(oldreservation); // Trouver l'index de l'ancienne réservation
            myReservations.set(index, newreservation);// Remplacer l'ancienne réservation par la nouvelle
            System.out.println("Reservation edited successfully!");
    } else {
        System.out.println("Reservation not found!"); // La réservation existante n'a pas été trouvée dans la liste
    }
    }


    // Méthode pour supprimer une réservation à la liste des réservations de l'utilisateur
    public void CancelReservation(Resarvation reservation){
    // Vérifier si la réservation existe dans la liste des réservations de l'utilisateur
        if (myReservations.contains(reservation)){
            myReservations.remove(reservation);
            System.out.println("Reservation cancelled successfully!");
        }else {
            System.out.println("Reservation not found!"); // La réservation n'existe pas dans la liste
        }

    }


    
    public void EditAcc(){}
    }//end   

