class Alamat {
    String jalan;
    String kota;
    String kecamatan;
    
    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKecamatan() {
        return kecamatan;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

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

class TP2_Soal4 {

    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";
        alamat.setKecamatan("Tamalanrea");
    
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";
    
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        System.out.println("Kecamatan: " + alamat.getKecamatan());
    }
}
