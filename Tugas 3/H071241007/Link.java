public class Link{
    int heart;
    int ATK;
    int speed;
    int health;
    MasterSword masterSword;

    public Link() {
        this(30, 15, 20);
    }

    public Link(int heart, int ATK, int speed) {
        this.heart = heart;
        this.ATK = ATK;
        this.speed = speed;
        this.health = heart * 2;
        this.masterSword = new MasterSword();
    }

    public void cabutMasterSword() {
        masterSword.cabutPedang(this.heart);
    }

    public String gunakanMasterSword() {
        return masterSword.serang();
    }

    public void serangGanondorf(Ganondorf ganondorf) {
        int totalDamage = ATK + masterSword.getDamage();
        System.out.println("Link menyerang dengan total damage " + totalDamage + "!");
        ganondorf.terimaDamage(totalDamage);
    }

    public void terimaDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println("Link terkena damage " + damage + "! Sisa health: " + health);
        
        if (health == 0) {
            System.out.println("Link kalah!");
        }
    }

    public String cekStatus() {
        return "=== Status Link ===\n" +
               "- Heart: " + heart + "\n" +
               "- Health: " + health + "/" + (heart*2) + "\n" +
               "- ATK: " + ATK + "\n" +
               "- Speed: " + speed + "\n\n" +
               masterSword.getStatus();
    }

    public int getHeart() { return heart; }
    public int getATK() { return ATK; }
    public int getSpeed() { return speed; }
    public int getHealth() { return health; }
}
