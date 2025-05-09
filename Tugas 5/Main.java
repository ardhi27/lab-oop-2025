import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Archer archer = new Archer("Pemanah", 100, 25);
        Wizard wizard = new Wizard("Penyihir", 100, 15);
        Fighter fighter = new Fighter("Petarung");

        while(true){

            System.out.println("Pilih Karakter: ");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.println("4. keluar ");
            
            int inputUser = sc.nextInt();
            if(inputUser == 1){
                handleCharacterMenu(sc,archer);
            }else if(inputUser == 2){
                handleCharacterMenu(sc, wizard);
            }else if (inputUser == 3){
                handleCharacterMenu(sc, fighter);
            }else{
                System.out.println("Game selesai");
                break;
            }
            
        }

        sc.close();    
    }


    
    private static void handleCharacterMenu(Scanner sc,Hero hero ){
        while(true){
            System.out.println("Menu: ");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");

            int statusMenu = sc.nextInt();
            sc.nextLine();
            if(statusMenu == 1){
                hero.attack();
            }else{
                break;
            }
        }
    }

        
}

