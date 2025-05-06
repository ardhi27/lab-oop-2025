import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " attacks with a power of " + attackPower + "!");
    }
}

class Archer extends Hero {
    
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots with a power of " + attackPower + "!");
    }
}

class Wizard extends Hero {
    
    public Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a spell with a power of " + attackPower + "!");
    }
}

class Fighter extends Hero {

    public Fighter(String name, int health, int attackPower) {
        this(name, health);
        this.attackPower = attackPower;
    }

    public Fighter(String name, int health) {
        super(name, health, 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " strikes with a power of " + attackPower + "!");
    }
}

public class Game {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Hero selectedHero = null;

            System.out.println("Choose a Character:");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.print("Enter your choice: ");
            int characterChoice = scanner.nextInt();
            
            switch (characterChoice) {
                case 1:
                    selectedHero = new Archer("Archer", 100, 15);
                    break;
                case 2:
                    selectedHero = new Wizard("Wizard", 80, 20);
                    break;
                case 3:
                    selectedHero = new Fighter("Fighter", 120, 18);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            int action;
            do {
                System.out.println("Menu:");
                System.out.println("1. Attack");
                System.out.println("2. Exit");
                System.out.print("Choose an action: ");
                action = scanner.nextInt();

                if (action == 1) {
                    selectedHero.attack();
                } else if (action == 2) {
                    System.out.println("Game over!");
                } else {
                    System.out.println("Invalid action!");
                }
            } while (action != 2);

        }
    }
}
