public class Ganondorf {
    String nama;
    int health;
    int attackPower;
    boolean sudahKalah;

    public Ganondorf() {
        this("Ganondorf", 100, 20);
    }

    public Ganondorf(String nama, int health, int attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
        this.sudahKalah = false;
        System.out.println(nama + " muncul sebagai musuh!");
    }

    public void terimaDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(nama + " terkena damage " + damage + "! Sisa health: " + health);

        if (health == 0) {
            sudahKalah = true;
            System.out.println("KEMENANGAN! " + nama + " dikalahkan!");
        }
    }

    public void serang(Link link) {
        System.out.println(nama + " menyerang Link dengan damage " + attackPower + "!");
        link.terimaDamage(attackPower);
    }

    public String getStatus() {
        return "=== Status Ganondorf ===\n" +
               "- Health: " + health + "\n" +
               "- Attack Power: " + attackPower + "\n" +
               "- Status: " + (sudahKalah ? "Kalah" : "Masih Bertarung");
    }

    public boolean apakahKalah() {
        return sudahKalah;
    }
    
    public int getHealth() {
        return health;
    }

    public void getWinStatus(){
        if (getHealth() <= 0) {
            System.out.println("\nLink menang! Hyrule selamat!");
        } else {
            System.out.println("\nGanondorf menang! Dunia jatuh ke dalam kegelapan!");
        }
    }

    //Buat fungsi di mana dia saling serang sampai darahnya 0
    //Your logic here
    
        
        
    
}
