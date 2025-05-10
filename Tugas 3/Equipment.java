public class Equipment {
    String name;
    int durability;

    public Equipment() {
        this.name = "ODM Gear";
        this.durability = 100;
    }

    public Equipment(String name, int durability) {
        this.name = name;
        this.durability = durability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getName() {
        return this.name;
    }

    public int getDurability() {
        return this.durability;
    }

    public void use() {
        if (durability > 0) {
            durability -= 10;
            System.out.println(getName() + " digunakan. Sisa durability: " + getDurability());
        } else {
            System.out.println(getName() + " rusak dan tidak bisa digunakan!");
        }
    }
}