class Wizard extends Hero {
    public Wizard() {
        super("Wizard", 80, 30);
    }

    @Override
    public void attack() {
        System.out.println(name + " melemparkan sihir dengan kekuatan " + attackPower);
    }
}