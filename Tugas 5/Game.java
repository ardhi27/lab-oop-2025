package tp5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        try {
            System.out.println("Pilih karakter Anda:");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Masukkan nama karakter: ");
            String name = scanner.nextLine();

            switch (choice) {
                case 1:
                    hero = new Archer(name, 80, 20);
                    break;
                case 2:
                    hero = new Wizard(name, 70, 25);
                    break;
                case 3:
                    hero = new Fighter(name);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }

            int menu = 0;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Serang");
                System.out.println("2. Keluar");
                System.out.print("Pilihan: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Input harus berupa angka. Coba lagi.");
                    scanner.next(); 
                    continue;
                }
                menu = scanner.nextInt();

                if (menu == 1) {
                    hero.attack();
                } else if (menu == 2) {
                    System.out.println("Keluar dari game. Terima kasih telah bermain!");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } while (menu != 2);

        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan input. Harus berupa angka.");
        } finally {
            scanner.close();
        }
    }
}