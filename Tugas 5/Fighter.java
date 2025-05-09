public class Fighter extends Hero{
    public Fighter(String name, int health, int attackPower){
        super(name,health,attackPower);
    }

    public Fighter(String name){
        this(name,100,20);
    }
}
