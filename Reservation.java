package modele;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Reservation {
    public enum Type {
        VIP, REGULAR;
    }

    public enum RoomModel {
        ADULTS, ADULTS1, ADULTS2, ADULTS3;
    }

    private static Map<String, Reservation> demandesNonTraitees = new HashMap<>();

    protected modele.UserInfo.Type roomtype;
    protected modele.UserInfo.RoomModel roomModel;
    protected Date startDate;
    protected Date endDate;
    protected Room room;
    protected int numberOfAdults;
    protected int numberOfChildren;
    protected UserInfo client;

    public Reservation(Date startDate, Date endDate, modele.UserInfo.Type roomType, modele.UserInfo.RoomModel roomModel, int numberOfAdults, int numberOfChildren) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomtype = roomType;
        this.roomModel = roomModel;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
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

    public UserInfo getClient() {
        return client;
    }

    public void setClient(UserInfo client) {
        this.client = client;
    }


}
/*
    // Méthode pour supprimer une demande de réservation non traitée
    public static void supprimerDemandeNonTraitee(String demandeId) {
        if (demandesNonTraitees.containsKey(demandeId)) {
            demandesNonTraitees.remove(demandeId);
            System.out.println("Demande de réservation supprimée avec succès avec l'ID : " + demandeId);
        } else {
            System.out.println("La demande de réservation avec l'ID spécifié n'existe pas.");
        }
    }

    // Méthode pour ajouter une demande de réservation non traitée
    public static void ajouterDemandeNonTraitee(Reservation demande) {
        String demandeId = UUID.randomUUID().toString();
        demandesNonTraitees.put(demandeId, demande);
        System.out.println("Demande de réservation ajoutée avec succès avec l'ID : " + demandeId);
    }

    // Méthode pour traiter une demande de réservation
    public static void traiterDemande(String demandeId, boolean accepter, RoomD roomD) {
        Reservation demande = demandesNonTraitees.get(demandeId);
        if (demande != null) {
            Date today = Date.now();
            if (accepter && demande.isValid(today, demande.getStartDate(), demande.getEndDate(), demande.getRoom().getType(), demande.getRoom().getModel(), roomD)) {
                // Si la demande est acceptée et valide, traiter selon le type de demande
                switch (demande.getDemandeType()) {
                    case RESERVATION:
                        demande.makeReservation(demande.getClient(), demande.getStartDate(), demande.getEndDate(), demande.getNumberOfAdults(), demande.getNumberOfChildren(), demande.getRoom().getType(), demande.getRoom().getModel(), roomD);
                        System.out.println("Demande de réservation acceptée et traitée avec succès.");
                        break;
                    case MODIFICATION:
                        // Implémentez la logique pour traiter les modifications de réservation
                        System.out.println("Demande de modification acceptée et traitée avec succès.");
                        break;
                    case CANCELLATION:
                        // Implémentez la logique pour traiter les annulations de réservation
                        System.out.println("Demande d'annulation acceptée et traitée avec succès.");
                        break;
                    default:
                        System.out.println("Type de demande invalide.");
                }
            } else if (!accepter) {
                // Si la demande est rejetée, supprimer simplement la demande
                supprimerDemandeNonTraitee(demandeId);
                System.out.println("Demande de réservation rejetée et supprimée avec succès.");
            } else {
                // Si la demande est invalide ou non acceptée, afficher un message d'erreur
                System.out.println("La demande de réservation n'est pas valide ou n'a pas été acceptée.");
            }
        } else {
            System.out.println("La demande de réservation avec l'ID spécifié n'existe pas.");
        }
    }

    // Méthode pour vérifier si la réservation est valide
    public boolean isValid(Date today, Date startDate, Date endDate, Room.Type roomType, Room.RoomModel roomModel, RoomD roomD) {
        // Vérifier si la date de début est inférieure ou égale à la date d'aujourd'hui
        if (startDate.compareDateToToday(today) <= 0) {
            // Vérifier si des chambres avec les caractéristiques spécifiées sont disponibles
            if (roomD.isRoomAvailable(roomType, roomModel, startDate, endDate)) {
                return true;
            } else {
                System.out.println("Aucune chambre disponible avec les caractéristiques spécifiées pour la période demandée.");
                return false;
            }
        } else {
            System.out.println("La date de début de la réservation doit être inférieure ou égale à la date d'aujourd'hui.");
            return false;
        }
    }

    // Méthode pour effectuer la réservation
    public void makeReservation(UserInfo user, Date startDate, Date endDate, int numberOfAdults, int numberOfChildren, Room.Type roomType, Room.RoomModel roomModel, RoomD roomD) {
        Date today = Date.now();
        if (isValid(today, startDate, endDate, roomType, roomModel, roomD)) {
            // Créer une nouvelle réservation avec les données fournies
            Reservation newReservation = new Reservation(Type.RESERVATION, startDate, endDate, new Room(roomType, roomModel), numberOfAdults, numberOfChildren, user);
            // Ajouter la réservation à la liste des réservations de l'utilisateur
            user.getReservations().put(UUID.randomUUID().toString(), newReservation);
            System.out.println("Nouvelle réservation acceptée pour l'utilisateur : " + user.getName());
        }
    }
}
 */