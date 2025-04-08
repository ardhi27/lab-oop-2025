class Cuboid {
    double height;
    double width;
    double length;



    double getVolume() {
       return height * width * length; 
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 20;
        cuboid.width = 15;
        cuboid.length = 10;

        System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));
    }
}