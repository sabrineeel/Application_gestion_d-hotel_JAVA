package modele;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import vues.*;

public class UserInfo {
    public enum Gender {
        WOMEN, MEN
    }
    public enum Type {
        VIP, REGULAR;
    }

    public enum RoomModel {
        ADULTS, ADULTS1, ADULTS2, ADULTS3;
    }

    private String name;
    private String familyName;
    private Date dateOfBirth;
    private String address;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private Map<String, String> users; // Pour stocker les noms d'utilisateur et mots de passe
    private Map<String, Reservation> reservations; // Pour stocker les réservations de l'utilisateur

    public UserInfo() {
        users = new HashMap<>();
        reservations = new HashMap<>();
        email = "";
        dateOfBirth = new Date(1900, 1, 1); // Initialisation par défaut
    }

    public UserInfo(String name, String familyName, Date dateOfBirth, String address, String email, Gender gender, String phoneNumber) {
        this.name = name;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        users = new HashMap<>();
        reservations = new HashMap<>();
        // Convertir la chaîne de genre en l'enum Gender correspondant
    if (gender.equals("MEN")) {
        this.gender = Gender.MEN;
    } else {
        this.gender = Gender.WOMEN;
    }
    }


    public Map<String, String> getUsers() {
        return users;
    }

    public void setUsers(Map<String, String> users) {
        this.users = users;
    }

    public Map<String, Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Map<String, Reservation> reservations) {
        this.reservations = reservations;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
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


    // Méthode pour valider les informations fournies par l'utilisateur lors de la création de compte
    private boolean isValidInfo(UserInfo userInfo,String username, String password) {
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
         if (!userInfo.getEmail().endsWith("@gmail.com")) {
            System.out.println("L'eemail n'est pas valide.");
            return false;
        }

        // Vérifier si le numéro de téléphone contient exactement 10 caractères
        if (userInfo.getPhoneNumber().length() != 10) {
            System.out.println("Le numéro de téléphone doit contenir exactement 10 caractères.");
            return false;
        }

        Date today = Date.now();

        // Vérifier si l'âge est supérieur ou égal à 18
        if (today.getYear() - userInfo.getDateOfBirth().getYear() < 18) {
            System.out.println("L'âge doit être supérieur ou égal à 18 ans.");
            return false;
        }
        return true;
    }

    // Méthode pour créer un nouveau compte utilisateur
    public void signUp(UserInfo userInfo, String username, String password) {
        if (isValidInfo(userInfo,username, password)) {
            users.put(username, password);
            System.out.println("Compte créé avec succès pour l'utilisateur : " + username);
        } else {
            System.out.println("Impossible de créer le compte. Veuillez fournir des informations valides.");
        }
    }

    
    // Méthode pour connecter un utilisateur
    public boolean signIn(String username, String password) {
        if (users.containsKey(username)) {
            String storedPassword = users.get(username);
            if (storedPassword.equals(password)) {
                System.out.println("Connexion réussie pour l'utilisateur : " + username);
                return true;
            } else {
                System.out.println("Mot de passe incorrect.");
            }
        } else {
            System.out.println("Nom d'utilisateur incorrect.");
        }
        return false;
    }

    public boolean addReservation(Date startDate, Date endDate, Type roomtype, RoomModel roomModel, int numberOfAdults, int numberOfChildren) {
        // Création d'une nouvelle réservation avec les données fournies
        Reservation newReservation = new Reservation(startDate, endDate, roomtype, roomModel, numberOfAdults, numberOfChildren);
        // Ajout de la réservation à la liste des réservations de l'utilisateur
        String reservationId = UUID.randomUUID().toString(); // Générer un ID pour la réservation
        reservations.put(reservationId, newReservation);
     
        // Vérifier si la réservation a été ajoutée avec succès
        if (reservations.containsKey(reservationId)) {
            return true; // L'ajout de la réservation est réussi
        } else {
            return false; // L'ajout de la réservation a échoué
        }
    }
    
    public boolean modifyReservation(int reservationId,Date startDate, Date endDate, Type roomType, RoomModel roomModel,  int numberOfAdults, int numberOfChildren) {
        Reservation reservationToUpdate = this.reservations.get(reservationId);
        if (reservationToUpdate != null) {
            Date today;
            if (today.after(reservationToUpdate.getStartDate())) {
            reservationToUpdate.setStartDate(startDate);
            reservationToUpdate.setEndDate(endDate);
            reservationToUpdate.setNumberOfAdults(numberOfAdults);
            reservationToUpdate.setNumberOfChildren(numberOfChildren);
            reservationToUpdate.getRoom().setType(roomType);
            reservationToUpdate.getRoom().setModel(roomModel);
            return true;}
        } else {
        return false;}
        
    }   
    public boolean deleteReservation(int x, Date today )  {
        Reservation reservationTodelete = this.reservations.get(x);
        if (reservationTodelete != null) {
            if (today.after(reservationTodelete.getStartDate())) {

                System.out.println("La réservation a déjà commencé et ne peut pas être annulée.");
                return false;
            } else {
                this.reservations.remove(x);
                return true;
            }
          
        } else {
        return false;}
    }
}