public class Soal4{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Panakkukang";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Abd Jabbar";
        mahasiswa.nim = "H071241088";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}

class Alamat{
    String jalan;
    String kota;
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public void Mahasiswa(String nama, String nim){
        this. nama = nama;
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getAlamat() {
        return this.alamat.jalan + ", " + this.alamat.kota;
    }
}