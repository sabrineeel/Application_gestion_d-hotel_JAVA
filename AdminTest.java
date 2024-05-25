package modele;
import modele.Admin;
import modele.Room;

public class AdminTest {
    public static void main(String[] args) {
        Admin admin = new Admin();

        // Test de la méthode addRoom
        System.out.println("Testing addRoom method:");
        admin.addRoom(Room.Type.VIP, Room.RoomModel.ADULTS);
        admin.addRoom(Room.Type.REGULAR, Room.RoomModel.ADULTS1);
        admin.displayRooms(); // Affichage des chambres après l'ajout

        // Test de la méthode updateRoomSituation
        System.out.println("\nTesting updateRoomSituation method:");
        boolean result1 = admin.updateRoomSituation(1, Room.Type.VIP, Room.RoomModel.ADULTS2);
        boolean result2 = admin.updateRoomSituation(2, Room.Type.REGULAR, Room.RoomModel.ADULTS3);
        admin.displayRooms(); // Affichage des chambres après la mise à jour

        if (result1 && result2) {
            System.out.println("All rooms updated successfully!");
        } else {
            System.out.println("Failed to update one or more rooms.");
        }
    }
}
