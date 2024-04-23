
package javaapplication3;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javaapplication3.Room.Situation;
import javaapplication3.UserInfo.Gender;


public class Admin {
    
  

    protected ArrayList<UserInfo> clientList;
    protected ArrayList<Room> roomList;
    protected ArrayList<Resarvation> reservationList;
    protected String username;
    protected String password;
    protected String firstname;
    protected String lastname;
    protected Date dateofBirth;
    protected String email;
    protected String addresse;
    protected String phoneNumber;
    protected String adminRole;

//constrecteur parametree:
    public Admin(String username, String passwrod, Date dateofBirth, String firstname, String lastename, Gender gender, String mail, String adresse) {
        clientList = new ArrayList<>();
        roomList = new ArrayList<>();
        reservationList = new ArrayList<>();
        this.password = passwrod;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastename;
        this.dateofBirth = dateofBirth;
        this.email = mail;
        this.addresse = adresse;
        this.phoneNumber = phoneNumber;
        this.adminRole = adminRole;
    }

    public Admin() {}



    private boolean isValidInfo(String username, String password) {
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

        return true;
    }
    

    // Méthode pour créer un nouveau compte administrateur en utilisant UserAuthentication
    public void CreateAccount(UserAuthentication auth, String username, String password,Gender gender) {
        // Vérifier si l'authentification n'est pas nulle et si les informations fournies sont valides
        if (auth != null && isValidInfo(username, password)) {
            // Appeler la méthode SignUp de UserAuthentication pour créer le compte
            auth.SignUpAdmin(username, password, firstname, lastname, dateofBirth, addresse, email, phoneNumber,gender,adminRole);
            System.out.println("Compte administrateur créé avec succès !");
        } else {
            System.out.println("Impossible de créer le compte administrateur. Veuillez fournir des informations valides.");
        }
    }


    //Method to edit reservations
    public boolean EditReservationRequests(Resarvation oldreservation , Resarvation newreservation,Room room){
        if (oldreservation.getStartDate().compareDateToToday(oldreservation.startDate) == -1) {
            // Check if the new reservation room is free
            if (newreservation.room.situation == Situation.FREE) {
                // Check if the new reservation dates conflict with existing reservations
                boolean isConflict = checkReservationConflict(newreservation);
                if (!isConflict) {
                oldreservation.setStartDate(newreservation.getStartDate());
                oldreservation.setEndDate(newreservation.getEndDate()); 
                return true;}
                else {
                HandleReservationException(newreservation, "Reservation cannot be accepted. New dates conflict with existing reservations.");
                return false;
                }
            }else{
            HandleReservationException(newreservation, "Reservation cannot be accepted. Room already reserved.");
            return false;
            }
        }else{
        HandleReservationException(newreservation, "Reservation cannot be edited. It has already started.");
        return false;
        }
    }


    // Method to check if the new reservation dates conflict with existing reservations
    private boolean checkReservationConflict(Resarvation newreservation) {
        for (Resarvation reservation : reservationList) {
            if (newreservation.getStartDate().compareTo(reservation.getEndDate()) <= 0
                    && newreservation.getEndDate().compareTo(reservation.getStartDate()) >= 0) {
                return true; // Conflict found
            }
        }
        return false; // No conflict found
    }


    public boolean AcceptReservation(Resarvation reservation,Room room){
        if (reservation.getStartDate().compareDateToToday(reservation.startDate)== -1){
            if (room.getSituation()== Situation.FREE){
            reservationList.add(reservation);
            System.out.println("Reservation accepted!");
            room.UpdateRoom(room);
            return true;}
        else {
        // Handle room already reserved
        HandleReservationException(reservation, "Reservation cannot be accepted. Room already reserved.");
        declineReservation(reservation, room);
        return false;
        }
        }else {
        HandleReservationException(reservation, "Reservation cannot be accepted. Please make the reservation at least one day in advance.");
        declineReservation(reservation , room);
        return false;
        }
    }


    public boolean CancelReservation(Resarvation reservation,Room room){
        if (reservation.getStartDate().compareDateToToday(reservation.startDate)== -1){
        declineReservation(reservation , room);
        System.out.println("Reservation canceled.");
        return true;
        }else {
        HandleReservationException(reservation, "Reservation cannot be canceled. It has already started.");
        return false;
        }
    }


    public void declineReservation(Resarvation reservation,Room room){
        reservationList.remove(reservation);
        room.setSituation(Situation.FREE);
    }


    // Méthode pour gérer les exceptions liées aux réservations
    public void HandleReservationException(Resarvation reservation, String errorMessage){
        // Log the error
        logError("Reservation Exception: " + errorMessage);
        
        // Enregistrement de l'erreur dans un journal
        logError(errorMessage);
         // Envoi de notifications aux administrateurs ou aux clients concernés
         sendNotification(reservation.getClient().getEmail(), errorMessage);

    }

    // Method to handle room exceptions
    public void HandleRoomException(Room room, String errorMessage){
        // Log the error
        logError("Room Exception: " + errorMessage);

        // Enregistrement de l'erreur dans un journal
        logError(errorMessage);

        // Envoi de notifications aux administrateurs ou aux clients concernés
        sendNotification(getAdminEmail(), errorMessage);
    }


    private void logError(String errorMessage) {
        try {
            // Append the error message to a log file
            FileWriter fileWriter = new FileWriter("error_log.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(errorMessage);
            printWriter.close();
        } catch (IOException e) {
            // Handle IOException if file writing fails
            System.out.println("Error occurred while logging the error: " + e.getMessage());
        }
        }


    // Method to send notifications via email
    private void sendNotification(String email, String message) {
        // Logic to send an email notification to the specified email address with the error message
        // This method could use a library to send emails or call an email service
        System.out.println("Notification sent to: " + email + "\nMessage: " + message);
    }

    // Méthode pour obtenir l'email de l'administrateur
    private String getAdminEmail() {
    // Logique pour récupérer l'email de l'administrateur à partir de la configuration ou d'une base de données
    return "admin@example.com";
}
}
    
    

