import java.util.Scanner;

public class kapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul film: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        String result = "";

        for (String word : words) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            result += capitalizedWord + " ";
        }

        System.out.println("perubahan yang benar: " + result);

        
        scanner.close();
    }
}