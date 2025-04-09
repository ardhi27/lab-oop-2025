
class Cuboid {
double height;
double width;
double length;

double getVolume() {
    return height * width * length;
    }
}

class TP2_Soal3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15;
        cuboid.width = 20;
        cuboid.length = 15;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}