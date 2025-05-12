class Archer extends Hero {
    public Archer() {
        super("Archer", 100, 25);
    }

    @Override
    public void attack() {
        System.out.println(name + " melepaskan panah dengan kekuatan " + attackPower);
    }
}