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
        cuboid.height = 2;
        cuboid.widht = 4;
        cuboid.length = 6;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
