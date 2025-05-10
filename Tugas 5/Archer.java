package tp5;

class Archer extends Hero {
    Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    void attack() {
        System.out.println(name + " menembakkan panah dengan kekuatan " + attackPower + "!");
    }
}
