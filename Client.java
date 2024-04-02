package POO;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    protected UserAuthentication userAuthentication;
    protected ArrayList<Reservation> myReservations;
    
    public Client() {   
    }

    public Client( UserAuthentication userAuthentication,ArrayList<Reservation> myReservations) {
        this.userAuthentication = userAuthentication;
        myReservations = new ArrayList<>();
    }
   

    public ArrayList<Reservation> getMyReservations() {
        return myReservations;
    }

    public void setMyReservations(ArrayList<Reservation> myReservations) {
        this.myReservations = myReservations;
    }




    // Méthode pour créer un nouveau compte client en utilisant UserAuthentication
    public void CreatAcc(String username, String password,String firstname,String Lastname ,Date dateofBirth ,String email,String address ,String phoneNumber,Gender gender){

         // Vérifier si l'authentification n'est pas nulle et si les informations fournies sont valides
         if (userAuthentication != null && isValidInfo(username, password, firstname, Lastname, dateofBirth, email, address,phoneNumber)) {
            // Appeler la méthode SignUp de UserAuthentication pour créer le compte
            userAuthentication.SignUp(username, password, firstname, Lastname, dateofBirth, address, email, phoneNumber, gender);
            System.out.println("Compte client créé avec succès !");
        } else {
            System.out.println("Impossible de créer le compte client. Veuillez fournir des informations valides.");
        }

    }



    // Méthode pour valider les informations fournies par l'utilisateur
    protected boolean isValidInfo(String username, String password, String firstName, String lastName, Date dateOfBirth, String email, String address,String phoneNumber) {
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
         // Vérifier si l'email se termine par "@gemail.com"
        if (!email.endsWith("@gemail.com")) {
            System.out.println("L'email n'est pas valide.");
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
        Reservation.TypeBed bedtype = Reservation.TypeBed.valueOf(bedTypeString.toUpperCase());

                // Create the reservation
        Reservation reservation = new Reservation(startDate, endDate, room, numberOfAdults, numberOfChildren, numberOfBeds, bedtype ,roomtype, this);

        // Add the reservation to the client's list of reservations
        addReservation(reservation);
        System.out.println("Reservation requested successfully!");
        sc.close();

    }




    // Méthode pour ajouter une réservation à la liste des réservations de l'utilisateur
        public void addReservation(Reservation reservation) {
        myReservations.add(reservation);
    }


    //Method to transform date string into date 
    protected Date parseDateString(String dateString) {
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
    public void EditReservation(Reservation oldreservation, Reservation newreservation){
        if (myReservations.contains(oldreservation)){
            int index = myReservations.indexOf(oldreservation); // Trouver l'index de l'ancienne réservation
            myReservations.set(index, newreservation);// Remplacer l'ancienne réservation par la nouvelle
            System.out.println("Reservation edited successfully!");
    } else {
        System.out.println("Reservation not found!"); // La réservation existante n'a pas été trouvée dans la liste
    }
    }


    // Méthode pour supprimer une réservation à la liste des réservations de l'utilisateur
    public void CancelReservation(Reservation reservation){
    // Vérifier si la réservation existe dans la liste des réservations de l'utilisateur
        if (myReservations.contains(reservation)){
            myReservations.remove(reservation);
            System.out.println("Reservation cancelled successfully!");
        }else {
            System.out.println("Reservation not found!"); // La réservation n'existe pas dans la liste
        }

    }


    
    public void EditAcc(){}

    public String getEmail() {
        // Vérifier si l'utilisateur a été authentifié
        if (userAuthentication != null) {
            // Obtenez le nom d'utilisateur associé à l'utilisateur actuellement authentifié
            String username = userAuthentication.getCurrentUsername(); 
            // Vérifier si le nom d'utilisateur existe dans la carte des informations utilisateur
            if (userAuthentication.userInfoMap.containsKey(username)) {
                // Récupérer l'objet UserInfo associé au nom d'utilisateur
                UserAuthentication.UserInfo userInfo = userAuthentication.userInfoMap.get(username);
                // Renvoyer l'e-mail associé à UserInfo
                return userInfo.getEmail();
            } else {
                System.out.println("User information not found for the authenticated user.");
                return null; // Ou lancez une exception appropriée selon votre cas d'utilisation
            }
        } else {
            System.out.println("User authentication information is missing.");
            return null; // Ou lancez une exception appropriée selon votre cas d'utilisation
        }
    }
    


    //Methode pour Afficher l'historique des réservations 
    public void History(){

    }

}
