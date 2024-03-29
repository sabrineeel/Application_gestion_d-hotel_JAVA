package POO;

public class Room {

    enum Situation{
        RESERVED,FREE;
    }
    enum Type {
        VIP,RIGULIER;
    }
    protected Type type;
    protected int room_numb;
    protected static int TotalNmbr=0;
    protected Situation situation;

    public Room() {
    }

    public Room(int room_numb, Situation situation) {
        this.room_numb = room_numb;
        this.situation = situation;
    }
    
    public static int getTotalNmbr() {
        return TotalNmbr;
    }

    public static void setTotalNmbr(int totalNmbr) {
        TotalNmbr = totalNmbr;
    }

    public int getRoom_numb() {
        return room_numb;
    }

    public void setRoom_numb(int room_numb) {
        this.room_numb = room_numb;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }


    //Methode pour cree une nouvelle chambre
    public void CreateRoom(Type type){
        TotalNmbr++;
        this.room_numb= TotalNmbr;
        this.situation = Situation.FREE; 
        this.type = type;

    }

    //Methode pour modifier l etat d une chambre
    public void UpdateRoom(Room room) {
        if (room.situation == Situation.FREE) {
            room.situation = Situation.RESERVED;
        } else {
            room.situation = Situation.FREE;
        }
    }


    //Methode pour supprimer chambre
    public void DeleteRoom(){
    TotalNmbr--;
    }

    @Override
    public String toString() {
        return "Room [room_numb=" + room_numb + ", situation=" + situation + "]";
    }  
}
