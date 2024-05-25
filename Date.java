package modele;
import java.util.Calendar;

public class Date {

    protected int year,month,day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //Methode pour verifier si la date est valide 
    public static boolean isDateValid(int year, int month, int day) {
        // Vérifier si l'année est valide (pas négative)
        if (year < 0) {
            return false;
        }

        // Vérifier si le mois est valide (entre 1 et 12)
        if (month < 1 || month > 12) {
            return false;
        }

        // Vérifier si le jour est valide pour le mois donné
        if (day < 1 || day > daysInMonth(year, month)) {
            return false;
        }

        return true;
    }


    // Méthode pour calculer le nombre de jours dans un mois donné
    protected static int daysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Mois invalide
        }
    }


    // Méthode pour vérifier si une année est bissextile
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    // Méthode pour calculer la date après un nombre spécifié de jours
    public static String calculateDateAfterDays(int year, int month, int day, int daysToAdd) {

        // Calculer le nombre total de jours à ajouter
        int totalDays = daysToAdd;
    
        // Répéter l'ajout de jours jusqu'à ce que le nombre total de jours soit écoulé
        while (totalDays > 0) {
            // Calculer le nombre de jours dans le mois actuel
            int daysInMonth = daysInMonth(year, month);
    
            // Si les jours restants sont inférieurs ou égaux au nombre de jours dans le mois, ajouter simplement ces jours
            if (totalDays <= daysInMonth - day) {
                day += totalDays;
                 totalDays = 0; // Tous les jours ont été ajoutés
                } else {

                // Sinon, passer au mois suivant et ajuster les jours restants
                totalDays -= (daysInMonth - day + 1); // Ajouter le reste des jours dans le mois actuel
                month++; // Passer au mois suivant
    
                // Si le mois dépasse décembre, passer à l'année suivante 
                if (month > 12) {
                    month = 1; // Janvier
                    year++; // Passer à l'année suivante
                }
    
                day = 1; // Réinitialiser le jour à 1 pour le nouveau mois
            }
        }

        // une chaîne représentant la date au format "yyyy-MM-dd"
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
     }




    // Méthode pour comparer une date donnée avec  la date d'aujourd'hui
    public  int compareDateToToday(Date date) {
        // Obtenir la date d'aujourd'hui
        Date  today = now();

        // Comparer les années
        if (date.year < today.getYear()) {
            return -1; // La date donnée est antérieure à la date d'aujourd'hui
        } else if (date.year > today.getYear()) {
            return 1; // La date donnée est postérieure à la date d'aujourd'hui
        } else {
            // Comparer les mois si les années sont égales
            if (date.month < today.getMonth()) {
                return -1;
            } else if (date.month > today.getMonth()) {
                return 1;
            } else {
                // Comparer les jours si les mois sont égaux
                if (date.day < today.getDay()) {
                    return -1;
                } else if (date.day > today.getDay()) {
                    return 1;
                } else {
                    return 0; // Les dates sont identiques
                }
            }
        }
    }



    // Méthode  pour obtenir la date d'aujourd'hui
    public static Date now() {
        Calendar calendar = Calendar.getInstance();
        return new Date(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
    }


    // Méthode  pour calculer l'âge a partir de la date de naissance
    public static long ageFromDateOfBirth(Date dateOfBirth) {
        Date today = Date.now();
        int years = today.year - dateOfBirth.year;
        // Vérifier si l'anniversaire de la personne est déjà passé cette année
        if (today.month < dateOfBirth.month || (today.month == dateOfBirth.month && today.day < dateOfBirth.day)) {
            years--;
        }
        return years;
    }


    // Méthode pour calculer le nombre de jours dans une année donnée
        protected static int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }



    // Method to compare two dates
    public int compareTo(Date date) {
        if (this.year != date.year) {
            return Integer.compare(this.year, date.year);
        }
        if (this.month != date.month) {
            return Integer.compare(this.month, date.month);
        }
        return Integer.compare(this.day, date.day);
    }

    
    public boolean after(Date date) {
        // Utilisez la méthode compareTo pour vérifier si l'objet Date actuel est postérieur à la date donnée
        return this.compareTo(date) > 0;
    }

        // Méthode pour vérifier si une date est avant une autre date
    public boolean before(Date date) {
        // Utilisez la méthode compareTo pour vérifier si l'objet Date actuel est antérieur à la date donnée
        return this.compareTo(date) < 0;
    }

    public static Date valueOf(String dateString) {
        // Diviser la chaîne par les tirets pour obtenir les parties année, mois et jour
        String[] parts = dateString.split("-");
        if (parts.length != 3) {
            throw new IllegalArgumentException("La chaîne de date doit être au format 'yyyy-mm-dd'.");
        }
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return new Date(year, month, day);
    }


  
    
}


