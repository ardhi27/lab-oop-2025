import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Aplikasi Login Sederhana");
            System.out.println("-------------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Keluar");
            System.out.print("> ");

            String input = sc.nextLine();
            switch (input) {
                case "1":
                    showLoginMenu();
                    break;
                case "2":
                    showRegisterMenu();
                    break;
                case "3":
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        String username;
        while (true) {
            System.out.println("Masukkan Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (!username.isEmpty())
                break;
            System.out.println("Username tidak boleh kosong.");
        }

        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();
            if (listUser.get(userIndex).getPassword().equals(password)) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username tidak ditemukan");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        String username;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine().trim();
            if (username.isEmpty()) {
                System.out.println("Username tidak boleh kosong.");
                continue;
            }

            boolean alreadyExists = false;
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    alreadyExists = true;
                    break;
                }
            }

            if (alreadyExists) {
                System.out.println("Username sudah digunakan. Coba yang lain.");
            } else {
                break;
            }
        }

        String password;
        while (true) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password harus minimal 8 karakter.");
            } else {
                break;
            }
        }

        User user = new User(username, password);
        Profile profile = new Profile();

        String fullName;
        while (true) {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine().trim();
            if (!fullName.isEmpty())
                break;
            System.out.println("Nama tidak boleh kosong.");
        }

        int age = 0;
        while (true) {
            System.out.println("Umur");
            System.out.print("> ");
            String ageInput = sc.nextLine();
            try {
                age = Integer.parseInt(ageInput);
                if (age > 0)
                    break;
                System.out.println("Umur harus lebih dari 0.");
            } catch (NumberFormatException e) {
                System.out.println("Masukkan umur dalam angka.");
            }
        }

        String hobby;
        while (true) {
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine().trim();
            if (!hobby.isEmpty())
                break;
            System.out.println("Hobby tidak boleh kosong.");
        }

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.generateNickName(fullName));

        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("Detail User");
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nickname    : " + profile.getNickName());
        System.out.println("Umur        : " + profile.getAge());
        System.out.println("Hobby       : " + profile.getHobby());
    }
}
