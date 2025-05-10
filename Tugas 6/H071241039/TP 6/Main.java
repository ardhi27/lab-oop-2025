import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // === Mobil ===
        Mobil mobil = new Mobil("BMW", "4-Wheels Drive");
        mobil.setWarna("Hitam");
        mobil.setJumlahPintu(4);
        mobil.setKapasitasMesin(2.0);
        mobil.setJumlahKursi(4);
        mobil.setBahanBakar("Listrik");
        mobil.setKecepatan(100.5);
        mobil.setTahunProduksi(2020);
        mobil.setId("M001");
        mobil.setKondisi(true);
        mobil.setHargaServis(1500000);
        mobil.setTipeKendaraan("M3");

        System.out.println("=== MOBIL ===");
        System.out.println("Merk             : " + mobil.merk);
        System.out.println("Model            : " + mobil.model);
        System.out.println("Warna            : " + mobil.getWarna());
        System.out.println("Jumlah Pintu     : " + mobil.getJumlahPintu());
        System.out.println("Jenis Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Kecepatan        : " + mobil.getKecepatan() + " km/h");
        System.out.println("Kondisi          : " + (mobil.periksaKondisi() ? "Baik" : "Perlu Servis"));
        System.out.println("Harga Servis     : Rp" + mobil.hitungBiayaServis());
        System.out.println("Waktu Servis Berikutnya: " + sdf.format(mobil.getWaktuServisBerikutnya()));
        System.out.println("Tipe Kendaraan: " + mobil.getTipeKendaraan());
        System.out.println();

        // === Motor ===
        Motor motor = new Motor("Honda", "CBR 150R");
        motor.setJenisMotor("Sport");
        motor.setKapasitasTangki(15.0);
        motor.setTipeSuspensi("Upside Down");
        motor.setKecepatan(120.0);
        motor.setTahunProduksi(2019);
        motor.setId("M002");
        motor.setKondisi(true);
        motor.setHargaServis(700000);
        motor.setTipeKendaraan("sport");

        System.out.println("=== MOTOR ===");
        System.out.println("Merk             : " + motor.merk);
        System.out.println("Model            : " + motor.model);
        System.out.println("Tipe Suspensi    : " + motor.getTipeSuspensi());
        System.out.println("Kapasitas Tangki : " + motor.getKapasitasTangki() + " liter");
        System.out.println("Kondisi          : " + (motor.periksaKondisi() ? "Baik" : "Perlu Servis"));
        System.out.println("Harga Servis     : Rp" + motor.hitungBiayaServis());
        System.out.println("Waktu Servis Berikutnya: " + sdf.format(motor.getWaktuServisBerikutnya()));
        System.out.println("Tipe Kendaraan: " + motor.getTipeKendaraan());
        System.out.println();

        // === Sepeda ===
        Sepeda sepeda = new Sepeda("Polygon", "Premier 5");
        sepeda.setJenisSepeda("Gunung");
        sepeda.setJumlahGear(21);
        sepeda.setUkuranRoda(27);
        sepeda.setKecepatan(25.0);
        sepeda.setTahunProduksi(2021);
        sepeda.setId("S001");
        sepeda.setKondisi(true);
        sepeda.setHargaServis(300000);
        sepeda.setTipeKendaraan("gunung");

        System.out.println("=== SEPEDA ===");
        System.out.println("Merk             : " + sepeda.merk);
        System.out.println("Model            : " + sepeda.model);
        System.out.println("Jenis Sepeda     : " + sepeda.getJenisSepeda());
        System.out.println("Kondisi          : " + (sepeda.periksaKondisi() ? "Baik" : "Perlu Servis"));
        System.out.println("Harga Servis     : Rp" + sepeda.hitungBiayaServis());
        System.out.println("Waktu Servis Berikutnya: " + sdf.format(sepeda.getWaktuServisBerikutnya()));
        System.out.println("Tipe Kendaraan: " + sepeda.getTipeKendaraan());
        System.out.println();
    }
}