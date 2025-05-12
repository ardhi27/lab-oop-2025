import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        System.out.println("Pilih Karakter:");
        System.out.println("1. Archer ");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hero = new Archer();
                break;
            case 2:
                hero = new Wizard();
                break;
            case 3:
                hero = new Fighter();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }

        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    hero.attack();
                    break;
                case 2:
                    System.out.println("Keluar dari game...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 2);

        scanner.close();
    }
}
