class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume(){
        return height*widht*length;
    }
}

public class Main{
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.height = 30;
        cuboid.widht = 30;
        cuboid.length = 50;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
