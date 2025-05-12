class Fighter extends Hero {
    public Fighter() {
        this("Fighter", 120, 20);
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan pedang dengan kekuatan " + attackPower);
    }
}