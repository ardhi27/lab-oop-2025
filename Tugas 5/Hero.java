public class Hero{
    String name;
    int health, attackPower;

    public Hero(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    public void attack(){
        System.out.println(name + " Menyerang dengan kekuatan " + attackPower);
    }
}