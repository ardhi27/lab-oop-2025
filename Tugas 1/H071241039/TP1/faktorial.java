import java.util.Scanner;

public class faktorial {
    public static int factorial(int n) {
        if (n == 0) {  
            return 1;
        } else { 
            return n * factorial(n - 1);  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();
        
    
        int result = factorial(n);
        System.out.println("Hasil " + n + "! = " + result);
    
        scanner.close();
    }
}