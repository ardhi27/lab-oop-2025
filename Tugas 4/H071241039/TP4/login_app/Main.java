package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> userList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Simple Login Application");
            System.out.println("-------------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("> ");

            int selectedMenu = inputInteger();
            switch (selectedMenu) {
                case 1:
                    showLoginMenu();
                    break;
                case 2:
                    showRegisterMenu();
                    break;
                case 3:
                    System.out.println("Thank you for using the app.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");

        if (userList.isEmpty()) {
            System.out.println("No users registered yet. Please register first.");
            runApp();
            return;
        }

        System.out.println("Available Usernames:");
        for (User user : userList) {
            System.out.println("- " + user.getUsername());
        }

        String username = inputNonEmptyString("Enter Username");
        int userIndex = -1;

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            String password = inputNonEmptyString("Enter Password");
            if (userList.get(userIndex).getPassword().equals(password)) {
                System.out.println("Login Successful");
                showUserDetails(userList.get(userIndex).getProfile());
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        if (userList.size() >= 5) {
            System.out.println("User limit reached (max 5 users). Cannot register more users.");
            runApp();
            return;
        }

        String username = inputWithAttempts("Username", 3, true);
        if (username == null) exitDueToFailedAttempts();

        String password = null;
        int attempt = 0;
        while (attempt < 3) {
            password = inputNonEmptyString("Password");
            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long. Attempt " + (attempt + 1) + "/3");
                attempt++;
            } else {
                break;
            }
        }
        if (attempt == 3) exitDueToFailedAttempts();

        String fullName = inputWithAttempts("Full Name", 3, false);
        if (fullName == null) exitDueToFailedAttempts();

        Integer age = inputIntegerWithAttempts("Age", 3);
        if (age == null) exitDueToFailedAttempts();

        String hobby = inputWithAttempts("Hobby", 3, false);
        if (hobby == null) exitDueToFailedAttempts();

        Profile profile = new Profile(fullName, age, hobby, StringUtils.getNickName(fullName));
        User user = new User(username, password, profile);

        userList.add(user);

        System.out.println("-------------------------");
        System.out.println("New User Registered Successfully!!");
        runApp();
    }

    private static void showUserDetails(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("User Profile:");
        System.out.println("Full Name : " + profile.getFullName());
        System.out.println("Nickname  : " + profile.getNickName());
        System.out.println("Age       : " + profile.getAge());
        System.out.println("Hobby     : " + profile.getHobby());
        System.out.println("-------------------------");
    }

    private static boolean isUsernameTaken(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static String inputNonEmptyString(String prompt) {
        String input;
        do {
            System.out.println(prompt);
            System.out.print("> ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            }
        } while (input.isEmpty());
        return input;
    }

    private static String inputWithAttempts(String prompt, int maxAttempts, boolean checkUsernameTaken) {
        String input;
        for (int i = 0; i < maxAttempts; i++) {
            System.out.println(prompt);
            System.out.print("> ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Attempt " + (i + 1) + "/" + maxAttempts);
                continue;
            }
            if (checkUsernameTaken && isUsernameTaken(input)) {
                System.out.println("Username is already taken. Attempt " + (i + 1) + "/" + maxAttempts);
                continue;
            }
            return input;
        }
        return null;
    }

    private static Integer inputIntegerWithAttempts(String prompt, int maxAttempts) {
        for (int i = 0; i < maxAttempts; i++) {
            try {
                System.out.println(prompt);
                System.out.print("> ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input must be a number. Attempt " + (i + 1) + "/" + maxAttempts);
            }
        }
        return null;
    }

    private static int inputInteger() {
        return inputInteger("");
    }

    private static int inputInteger(String prompt) {
        int number;
        while (true) {
            if (!prompt.isEmpty()) {
                System.out.println(prompt);
                System.out.print("> ");
            }
            try {
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Input must be a number. Please try again.");
            }
        }
    }

    private static void exitDueToFailedAttempts() {
        System.out.println("Too many failed attempts. Exiting application.");
        System.exit(0);
    }
}