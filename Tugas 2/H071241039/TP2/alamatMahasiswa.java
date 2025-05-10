class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.getAlamatLengkap();
    }
}
public class alamatMahasiswa{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nia";
        mahasiswa.nim = "H071241039";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}

