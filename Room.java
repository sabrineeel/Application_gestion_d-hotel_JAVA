
package javaapplication3;



import java.sql.*;
import static javaapplication3.UserAuthentication.c;
import static javaapplication3.UserAuthentication.pwd;
import static javaapplication3.UserAuthentication.url;
import static javaapplication3.UserAuthentication.user;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Room {
    
static Statement ss;  
static String que;

    
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
           
     try {
         ss=c.createStatement();
         que = "INSERT INTO Room VALUES ('" + room_numb + "','" + situation + "','" + type + "')" ;
        ss.execute(que);
            System.out.println("Insert!");
     } catch (SQLException ex) {
         Logger.getLogger(UserAuthentication.class.getName()).log(Level.SEVERE, null, ex);
     }     

    }

    //Methode pour modifier l etat d une chambre
    public void UpdateRoom(Room room) {
        if (room.situation == Situation.FREE) {
            room.situation = Situation.RESERVED;
            int num=room.room_numb;
            try {
         ss=c.createStatement();
         que = "Update Room set situation='RESERVED' where room_numb="+num ;
        ss.execute(que);
            System.out.println("c'est fait");
     } catch (SQLException ex) {
         Logger.getLogger(UserAuthentication.class.getName()).log(Level.SEVERE, null, ex);
     }  
            
        } else {
            room.situation = Situation.FREE;
              int num=room.room_numb;
             try {
         ss=c.createStatement();
         que = "Update Room set situation='Free' where room_numb="+num ;
        ss.execute(que);
            System.out.println("c'est fait");
     } catch (SQLException ex) {
         Logger.getLogger(UserAuthentication.class.getName()).log(Level.SEVERE, null, ex);
     }  
            
            
        }
    }


    //Methode pour supprimer chambre
    public void DeleteRoom(Room room){
    TotalNmbr--;
      try {
         ss=c.createStatement();
         que = "DELETE FROM Room WHERE room_num="+room.room_numb ;
        ss.execute(que);
            System.out.println("c'est fait");
     } catch (SQLException ex) {
         Logger.getLogger(UserAuthentication.class.getName()).log(Level.SEVERE, null, ex);
     }  
    
    }

    @Override
    public String toString() {
        return "Room [room_numb=" + room_numb + ", situation=" + situation + "]";
    }  
    
    
    public static void main(String[] args) throws SQLException {
 //connecter:
  c=DriverManager.getConnection(url,user,pwd);
         
    }
    
}
    

