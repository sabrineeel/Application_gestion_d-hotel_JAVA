package POO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import POO.Room.Situation;

public class Admin {
    protected ArrayList<Client> clientList;
    protected ArrayList<Room> roomList;
    protected ArrayList<Reservation> reservationList;
    protected UserAuthentication userAuthentication;


    public Admin(UserAuthentication userAuthentication, ArrayList<Reservation> reservationList, ArrayList<Room> roomList,ArrayList<Client> clientList) {
        clientList = new ArrayList<>();
        roomList = new ArrayList<>();
        reservationList = new ArrayList<>();
        this.userAuthentication = userAuthentication;
       
    }

    public Admin() {}

    protected boolean isValidInfo(String username, String password) {
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
    

    // Méthode pour créer un nouveau compte administrateur en utilisant UseruserAuthentication
    public void CreateAccount(String username, String password, String firstname, String lastname, Date dateofBirth, String address, String email, String phoneNumber, Gender gender, String adminRole) {
        // Vérifier si l'userAuthenticationon n'est pas nulle et si les informations fournies sont valides
        if (userAuthentication != null && isValidInfo(username, password)) {
            // Appeler la méthode SignUp de UseruserAuthentication pour créer le compte
            userAuthentication.SignUpAdmin(username, password, firstname, lastname, dateofBirth, address, email, phoneNumber,gender,adminRole);
            System.out.println("Compte administrateur créé avec succès !");
        } else {
            System.out.println("Impossible de créer le compte administrateur. Veuillez fournir des informations valides.");
        }
    }


    //Method to edit reservations
    public boolean EditReservationRequests(Reservation oldreservation , Reservation newreservation,Room room){
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
    protected boolean checkReservationConflict(Reservation newreservation) {
        for (Reservation reservation : reservationList) {
            if (newreservation.getStartDate().compareTo(reservation.getEndDate()) <= 0
                    && newreservation.getEndDate().compareTo(reservation.getStartDate()) >= 0) {
                return true; // Conflict found
            }
        }
        return false; // No conflict found
    }


    public boolean AcceptReservation(Reservation reservation,Room room){
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


    public boolean CancelReservation(Reservation reservation,Room room){
        if (reservation.getStartDate().compareDateToToday(reservation.startDate)== -1){
        declineReservation(reservation , room);
        System.out.println("Reservation canceled.");
        return true;
        }else {
        HandleReservationException(reservation, "Reservation cannot be canceled. It has already started.");
        return false;
        }
    }


    public void declineReservation(Reservation reservation,Room room){
        reservationList.remove(reservation);
        room.setSituation(Situation.FREE);
      }


    // Méthode pour gérer les exceptions liées aux réservations
    public void HandleReservationException(Reservation reservation, String errorMessage){
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


    protected void logError(String errorMessage) {
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
    protected void sendNotification(String email, String message) {
        // Logic to send an email notification to the specified email address with the error message
        // This method could use a library to send emails or call an email service
        System.out.println("Notification sent to: " + email + "\nMessage: " + message);
    }

    // Méthode pour obtenir l'email de l'administrateur
    protected String getAdminEmail() {
    // Logique pour récupérer l'email de l'administrateur à partir de la configuration ou d'une base de données
    return "admin@example.com";
    }



        // Méthode pour générer un rapport sur l'occupation des chambres
    public void generateOccupancyReport() {
        // Création d'une carte pour stocker le nombre de chambres occupées par jour
        Map<Date, Integer> occupancyMap = new HashMap<>();

        // Parcourir la liste des réservations
        for (Reservation reservation : reservationList) {
            Date startDate = reservation.getStartDate();
            Date endDate = reservation.getEndDate();

            // Parcourir les jours de la période de réservation
            for (Date date = startDate; date.compareTo(endDate) <= 0; date.calculateDateAfterDays(date.getYear(), date.getMonth(), date.getDay(), 1)) {
                // Vérifier si la date existe déjà dans la carte
                if (occupancyMap.containsKey(date)) {
                    // Incrémenter le nombre de chambres occupées pour cette date
                    occupancyMap.put(date, occupancyMap.get(date) + 1);
                } else {
                    // Initialiser le nombre de chambres occupées pour cette date à 1
                    occupancyMap.put(date, 1);
                }
            }
        }

        // Afficher le rapport
        System.out.println("Rapport sur l'occupation des chambres :");
        for (Map.Entry<Date, Integer> entry : occupancyMap.entrySet()) {
            System.out.println("Date: " + entry.getKey() + ", Chambres occupées: " + entry.getValue());
        }
    }

}
