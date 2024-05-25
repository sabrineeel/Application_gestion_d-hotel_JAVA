package modele;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomD {
    protected Map<Integer, Room> roomMap;
    protected int nextRoomNumber; 
    private List<Room> rooms;

    public RoomD() {
        roomMap = new HashMap<>();
        nextRoomNumber = 1; 
    }

    public void addRoom(Room room) {
        room.setRoomNumber(nextRoomNumber++);
        roomMap.put(room.getRoomNumber(), room);
        System.out.println("Room added: " + room);
    }

    public void updateRoom(Room room, Room.Type newType, Room.RoomModel newModel) throws RoomModificationException {
        Room existingRoom = roomMap.get(room.getRoomNumber());
        if (existingRoom == null) {
            throw new RoomModificationException("Room not found.");
        }

        if (existingRoom.getSituation() == Room.Situation.RESERVED) {
            throw new RoomModificationException("Cannot update room. It is currently reserved.");
        }

        existingRoom.setType(newType);
        existingRoom.setModel(newModel);
        System.out.println("Room updated: " + existingRoom);
    }

    public void deleteRoom(Room room) throws RoomModificationException {
        Room existingRoom = roomMap.get(room.getRoomNumber());
        if (existingRoom == null) {
            throw new RoomModificationException("Room not found.");
        }

        if (existingRoom.getSituation() == Room.Situation.RESERVED) {
            throw new RoomModificationException("Cannot delete room. It is currently reserved.");
        }

        roomMap.remove(room.getRoomNumber());
        System.out.println("Room deleted: " + existingRoom);
    }

    public Room getRoom(int roomNumber) {
        return roomMap.get(roomNumber);
    }

    // Autres méthodes de gestion de la chambre ...

    public Collection<Room> getAllRooms() {
        return roomMap.values();
    }

    public static class RoomModificationException extends Exception {
        public RoomModificationException(String message) {
            super(message);
        }
    }

    public boolean containsKey(int roomNumber) {
        return roomMap.containsKey(roomNumber);
    }
}
