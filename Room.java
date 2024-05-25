package modele;
public class Room {

    public enum Situation {
        RESERVED, FREE;
    }

    public enum Type {
        VIP, REGULAR;
    }

    public enum RoomModel {
        ADULTS, ADULTS1, ADULTS2, ADULTS3;
    }
  
    protected Type type;
    protected int roomNumber;
    protected Situation situation;
    protected RoomModel model;
    protected Reservation reservation;
    public Room(Type type, RoomModel model) {
        this.type = type;
        this.model = model;
        this.situation = Situation.FREE;
    }
    
    public Room(String type2, modele.Admin.RoomModel model2) {
        //TODO Auto-generated constructor stub
    }

    public void setType(Type type) {
        this.type = type;
    }


    public RoomModel getModel() {
        return model;
    }


    public void setModel(RoomModel model) {
        this.model = model;
    }


    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public Type getType() {
        return type;
    }

    

    
    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", situation=" + situation +
                ", type=" + type +
                ", model=" + model + // Include model in the toString() output
                '}';
    }
    
}
