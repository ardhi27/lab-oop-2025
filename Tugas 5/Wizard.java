package tp5;

class Wizard extends Hero {
    Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    void attack() {
        System.out.println(name + " melemparkan mantra sihir dengan kekuatan " + attackPower + "!");
    }
}