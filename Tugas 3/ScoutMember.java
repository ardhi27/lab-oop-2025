public class ScoutMember {
    String name;
    int health;
    Equipment equipment;

    public ScoutMember() {
        this.name = "Unknown";
        this.health = 100;
        this.equipment = new Equipment();
    }

    public ScoutMember(String name, int health, Equipment equipment) {
        this.name = name;
        this.health = health;
        this.equipment = equipment;
    }

    // buat setter untuk memodifikasi nilai properti yang diinginkan
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void attack(ScoutMember enemy) {
        System.out.println(getName() + " menyerang " + enemy.getName() + "!");
        equipment.use();
        enemy.health -= 20;
        System.out.println(enemy.getName() + " kehilangan 20 health. Sisa health: " + enemy.getHealth());
    }

    public void repairEquipment() {
        System.out.println(this.getName() + " memperbaiki " + equipment.getName());
        equipment.durability += 20;
        System.out.println("Durability sekarang: " + equipment.getDurability());
    }
}