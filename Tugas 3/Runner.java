public class Runner {
    String name;
    int baseSpeed;
    Shoe mainShoe;
    
    Runner() {
        this.name = "Unknown";
        this.baseSpeed = 10;
        this.mainShoe = new Shoe();
    }

    Runner(String name, int baseSpeed, Shoe mainShoe) {
        this.name = name;
        this.baseSpeed = baseSpeed;
        this.mainShoe = mainShoe;
    }

    int getTotalSpeed() {
        return baseSpeed + mainShoe.speedBonus;
    }

    void run() {
        System.out.println(name + " is running with total speed: " + getTotalSpeed());
    }

    void exchangeShoes(Runner teammate) {
        System.out.println(this.name + " exchanged shoes with " + teammate.name);
        Shoe temp = this.mainShoe;
        this.mainShoe = teammate.mainShoe;
        teammate.mainShoe = temp;
    }
}
