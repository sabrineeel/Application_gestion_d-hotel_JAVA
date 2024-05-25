package modele;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import modele.*;

public class Admin {
    public enum RoomModel {
        ADULTS, ADULTS1, ADULTS2, ADULTS3;
    }
    protected Map<Integer, Room> roomMap = new HashMap<>();
    protected ArrayList<UserInfo> clientList = new ArrayList<>();

    protected String username;
    protected String password;
    protected RoomD roomD;

    // Parameterized constructor
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.roomD = new RoomD();
    }

    // Default constructor
    public Admin() {
        this.roomD = new RoomD();
    }

   
    public boolean authenticateAdmin(String enteredUsername, String enteredPassword) {
        return "sabrinel".equals(enteredUsername) && "sabrinel".equals(enteredPassword);
    }
  
    
    public void addRoom(Room.Type type, Room.RoomModel model) {
        Room room = new Room(type, model);
        roomD.addRoom(room);
    }

public boolean updateRoomSituation(int roomNumber, Room.Type roomType, Room.RoomModel roomModel) {
    try {
        // Obtenez la chambre en fonction de son numéro
        Room room = roomD.getRoom(roomNumber);
        if (room == null) {
            throw new RoomD.RoomModificationException("Room not found.");
        }

        // Mettez à jour la chambre avec les nouvelles valeurs de type et de modèle
        roomD.updateRoom(room, roomType, roomModel);
        
        System.out.println("Room updated successfully!");
        return true;
        
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid room type or model!");
        return false;
    } catch (RoomD.RoomModificationException e) {
        System.out.println(e.getMessage());
        return false;
    }
}

public boolean deleteRoom(int roomNumber) {
    try {
        // Obtenez la chambre en fonction de son numéro
        Room room = roomD.getRoom(roomNumber);
        if (room == null) {
            throw new RoomD.RoomModificationException("Room not found.");
        }

        // Supprimez la chambre de la liste des chambres disponibles
        roomD.deleteRoom(room);
        
        System.out.println("Room deleted successfully!");
        return true;
        
    } catch (RoomD.RoomModificationException e) {
        System.out.println(e.getMessage());
        return false;
    }
}
/* 
 private void manageReservations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reservation Management Menu:");
        System.out.println("1. Add Reservation");
        System.out.println("2. Update Reservation");
        System.out.println("3. Delete Reservation");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                break;
            case 2:
                           break;
            case 3:

                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
   
  public void displayRooms() {
        System.out.println("Existing rooms:");
        for (Room room : roomD.getAllRooms()) {
            System.out.println(room);
        }
    }/*
    private void makeReservation() {
        


    }

    private void updateReservation(String reservationId, Date today, Date newStartDate, Date newEndDate, int newNumberOfAdults, int newNumberOfChildren, Room.Type newRoomType, Room.RoomModel newRoomModel, RoomD roomD) {
        // Rechercher la réservation par son ID
        Reservation reservation = findReservationById(reservationId);
        if (reservation == null) {
            System.out.println("La réservation avec l'ID spécifié n'existe pas.");
            return;
        }
    
        // Vérifier si la réservation peut être modifiée
        if (reservation.canModifyReservation(reservation,today, newStartDate, newEndDate, newNumberOfAdults, newNumberOfChildren, newRoomType, newRoomModel, roomD)) {
            // Mettre à jour les informations de la réservation
            reservation.setStartDate(newStartDate);
            reservation.setEndDate(newEndDate);
            reservation.setNumberOfAdults(newNumberOfAdults);
            reservation.setNumberOfChildren(newNumberOfChildren);
            reservation.getRoom().setType(newRoomType);
            reservation.getRoom().setModel(newRoomModel);
    
            System.out.println("La réservation a été modifiée avec succès pour l'utilisateur : " + reservation.getClient().getName());
        } else {
            // La réservation ne peut pas être modifiée, lancer une exception
            throw new RuntimeException("La réservation ne peut pas être modifiée.");
        }
    }
    
    private void cancelReservation(String reservationId, Date today) {
        // Trouver la réservation par son ID
        Reservation reservation = findReservationById(reservationId);
        if (reservation == null) {
            System.out.println("La réservation avec l'ID spécifié n'existe pas.");
            return;
        }
        // Vérifier si la réservation peut être annulée
        if (reservation.CancelReservation(reservation, today)) {
            // Récupérer le client associé à la réservation
            UserInfo client = reservation.getClient();
            // Supprimer la réservation de la liste des réservations du client
            client.getReservations().remove(reservationId);
            try {
                // Libérer la chambre associée à la réservation
                roomD.freeRoom(reservation.getRoom());
                System.out.println("La réservation a été annulée avec succès pour l'utilisateur : " + client.getName());
            } catch (RoomD.RoomModificationException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        } else {
            // La réservation ne peut pas être annulée, lancer une exception
            throw new RuntimeException("La réservation ne peut pas être annulée.");
        }
    }
    


    private Reservation findReservationById(String reservationId) {
        for (UserInfo client : clientList) {
            Map<String, Reservation> reservations = client.getReservations();
            if (reservations.containsKey(reservationId)) {
                return reservations.get(reservationId);
            }
        }
        return null; // Aucune réservation trouvée avec l'ID spécifié
    }


    // Assuming RoomD class has a method to get room by number
    private Room getRoom(int roomNumber) {
        return roomMap.get(roomNumber);
    }

    public void displayRooms() {
        System.out.println("Existing rooms:");
        for (Room room : roomD.getAllRooms()) {
            System.out.println(room);
        }
    } */
}

