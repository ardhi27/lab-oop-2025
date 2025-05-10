import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listProfile = new ArrayList<>();

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("========================");
        System.out.println("Selamat Datang di Aplikasi!");
        System.out.println("========================");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("0. Exit");
        System.out.print("Pilihan: ");
        int selectMenu = sc.nextInt();
        sc.nextLine(); 

        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            case 0:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
        runApp(); 
    }

    private static void showLoginMenu() {
        System.out.println("-------- LOGIN --------");
        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                if (listUser.get(i).getPassword().equals(password)) {
                    System.out.println("Login berhasil!");
                    showProfile(listProfile.get(i));
                    return;
                } else {
                    System.out.println("Password salah!");
                    return;
                }
            }
        }
        System.out.println("Username tidak ditemukan!");
    }

    private static void showRegisterMenu() {
        System.out.println("-------- REGISTER --------");
        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();

        User newUser = new User(username, password);
        listUser.add(newUser);

        // Profile newProfile = new Profile();
        System.out.print("Masukkan nama lengkap: ");
        String fullName = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan hobi: ");
        String hobby = sc.nextLine();
        Profile newProfile = new Profile(fullName, StringUtils.getNickName(fullName), age, hobby);
        
        listProfile.add(newProfile);

        System.out.println("Registrasi berhasil!");
    }

    private static void showProfile(Profile profile) {
        System.out.println("-------- PROFIL --------");
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nama Panggilan: " + profile.getNickName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Hobi: " + profile.getHobby());
    }
}
