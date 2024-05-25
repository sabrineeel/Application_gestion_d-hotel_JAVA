package modele;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'une instance de UserInfo
        UserInfo userManager = new UserInfo();

        System.out.println("Création de nouveaux comptes utilisateur :");

        // Saisie des informations de l'utilisateur
        System.out.println("Entrez votre prénom :");
        String firstName = scanner.nextLine();
        System.out.println("Entrez votre nom de famille :");
        String lastName = scanner.nextLine();
        System.out.println("Entrez votre date de naissance (yyyy-MM-dd) :");
        String dobString = scanner.nextLine();
        Date dob = parseDate(dobString);
        System.out.println("Entrez votre adresse :");
        String address = scanner.nextLine();
        System.out.println("Entrez votre email :");
        String email = scanner.nextLine();
        System.out.println("Entrez votre genre (MEN ou WOMEN) :");
        UserInfo.Gender gender = UserInfo.Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Entrez votre numéro de téléphone :");
        String phone = scanner.nextLine();
        System.out.println("Entrez votre nom d'utilisateur :");
        String username = scanner.nextLine();
        System.out.println("Entrez votre mot de passe :");
        String password = scanner.nextLine();

        // Création de l'utilisateur
        UserInfo user = new UserInfo(firstName, lastName, dob, address, email, gender, phone);

        // Ajout de l'utilisateur à la liste des utilisateurs
        userManager.signUp(user, username, password);

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode pour convertir une chaîne en une date (YYYY-MM-DD)
    private static Date parseDate(String dateString) {
        String[] parts = dateString.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return new Date(year, month, day);
    }
}
