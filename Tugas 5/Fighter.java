package tp5;

class Fighter extends Hero {
    Fighter(String name, int health, int attackPower) {
        this(name); 
        this.health = health;
        this.attackPower = attackPower;
    }

    Fighter(String name) {
        super(name, 100, 15); 
    }

    @Override
    void attack() {
        System.out.println(name + " menghantam musuh dengan kekuatan " + attackPower + "!");
    }
}
