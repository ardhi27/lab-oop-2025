import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String inputDate = scanner.nextLine();
        
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yy");
            Date date = inputFormat.parse(inputDate);
            
            SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM yyyy");
            String formattedDate = outputFormat.format(date);
            
            System.out.println("Output: " + formattedDate);
        } catch (Exception e) {
            System.out.println("Format tanggal tidak valid!");
        } finally {
            scanner.close();
        }
    }
}
