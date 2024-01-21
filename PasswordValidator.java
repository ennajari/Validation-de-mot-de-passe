import java.util.Scanner;
//  BY Ennajari Abdellah
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir votre mot de passe : ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Mot de passe valide !");
        } else {
            System.out.println("Mot de passe invalide. Assurez-vous qu'il a au moins 8 caractères, une lettre majuscule, une lettre minuscule et un chiffre.");
        }
    }

    public static boolean isValidPassword(String password) {
        // Vérifier la longueur
        if (password.length() < 8) {
            return false;
        }

        // Vérifier au moins une lettre majuscule
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Vérifier au moins une lettre minuscule
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Vérifier au moins un chiffre
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Si toutes les conditions sont satisfaites, le mot de passe est valide
        return true;
    }
}
