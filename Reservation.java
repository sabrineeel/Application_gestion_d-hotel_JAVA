package POO;

public class Reservation {
 protected Date startDate; 
 protected Date endDate;
 protected Room room;
 protected int numberOfAdults;
 protected int numberOfChildren;
 protected int numberOfBed;
 protected TypeBed typeBed;
 protected Client client;

 enum TypeBed{
    SINGLE,DOUBLE;
 }




public Reservation(Date startDate, Date endDate, Room room, int numberOfAdults, int numberOfChildren, int numberOfBed,
        Reservation.TypeBed typeBed,Room.Type roomType, Client client) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.room = room;
    this.numberOfAdults = numberOfAdults;
    this.numberOfChildren = numberOfChildren;
    this.numberOfBed = numberOfBed;
    this.typeBed = typeBed;
    this.client = client;
}
public Date getStartDate() {
    return startDate;
}
public void setStartDate(Date startDate) {
    this.startDate = startDate;
}
public Date getEndDate() {
    return endDate;
}
public void setEndDate(Date endDate) {
    this.endDate = endDate;
}
public Room getRoom() {
    return room;
}
public void setRoom(Room room) {
    this.room = room;
}

public int getNumberOfAdults() {
    return numberOfAdults;
}

public void setNumberOfAdults(int numberOfAdults) {
    this.numberOfAdults = numberOfAdults;
}

public int getNumberOfChildren() {
    return numberOfChildren;
}

public void setNumberOfChildren(int numberOfChildren) {
    this.numberOfChildren = numberOfChildren;
}

public int getNumberOfBed() {
    return numberOfBed;
}

public void setNumberOfBed(int numberOfBed) {
    this.numberOfBed = numberOfBed;
}

public TypeBed getTypeBed() {
    return typeBed;
}

public void setTypeBed(TypeBed typeBed) {
    this.typeBed = typeBed;
}

public Client getClient() {
    return client;
}

public void setClient(Client client) {
    this.client = client;
}



}