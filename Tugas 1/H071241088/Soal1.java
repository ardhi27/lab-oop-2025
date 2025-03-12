import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan judul film: ");
        String title = sc.nextLine();

        String[] words = title.split(" ");
        String newTitle = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                newTitle += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
            }
        }

        System.out.println("Judul film yang diperbaiki: " + newTitle.trim());

        sc.close();
    }
}
