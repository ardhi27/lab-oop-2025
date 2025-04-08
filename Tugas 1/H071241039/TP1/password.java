import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        if (Checkpassword(password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
        
        scanner.close();
    }

    public static boolean Checkpassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasLowerCase = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");

        return hasUpperCase && hasLowerCase && hasDigit;
    }
}
