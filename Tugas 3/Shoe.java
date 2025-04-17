class Shoe {
    String brand;
    int speedBonus;
    
    Shoe() {
        this.brand = "Regular Shoe";
        this.speedBonus = 5;
    }

    Shoe(String brand, int speedBonus) {
        this.brand = brand;
        this.speedBonus = speedBonus;
    }

    void showDetails() {
        System.out.println("Shoe Brand: " + brand + ", Speed Bonus: " + speedBonus);
    }
}
