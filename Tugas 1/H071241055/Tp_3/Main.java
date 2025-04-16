public class Main {
    public static void main(String[] args) {
        Sepatu sepatuLariPro = new Sepatu("Sepatu Lari Pro", 15);
        Sepatu sepatuCepat = new Sepatu("Sepatu Cepat", 20);
        Sepatu sepatuSuper = new Sepatu("Sepatu Super", 25);
        Sepatu sepatuBiasa = new Sepatu("Sepatu Biasa", 5);

        Pelari pelariA1 = new Pelari("Budi", 12, sepatuLariPro);
        Pelari pelariA2 = new Pelari("Ani", 14, sepatuCepat);

        Pelari pelariB1 = new Pelari("Dedi", 10, sepatuSuper);
        Pelari pelariB2 = new Pelari("Cici", 13, sepatuBiasa);

        Tim timA = new Tim("Tim A", pelariA1, pelariA2);
        Tim timB = new Tim("Tim B", pelariB1, pelariB2);

        System.out.println("\n=== Stage 1 : Status Awal ===");
        timA.munculkanStatusTim();
        timB.munculkanStatusTim();

        System.out.println("\n=== Stage 2 : Tukar sepatu antar anggoota tim ===");
        timA.tukarSepatuAntarAnggota();
        timB.tukarSepatuAntarAnggota();

        System.out.println("\n=== Stage 3 : Status setelah tukar sepatu ===");
        timA.munculkanStatusTim();
        timB.munculkanStatusTim();

        System.out.println("\n=== Stage 4 : Hasil Perolehan ===");
        int skorTimA = timA.getSkorTim();
        int skorTimB = timB.getSkorTim();

        System.out.println("skor " + timA.namaTim + ": " + skorTimA);
        System.out.println("skor " + timB.namaTim + ": " + skorTimB);

        if (skorTimA > skorTimB) {
            System.out.println(timA.namaTim + " adalah pemenangnya");
        } else if (skorTimB > skorTimA) {
            System.out.println(timB.namaTim + " adalah pemenangnya");
        } else {
            System.out.println("Hasil seri");
        }

    }
}