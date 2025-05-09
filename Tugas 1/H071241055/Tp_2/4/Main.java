class Alamat{
String jalan,kota;

public void setAlamat(String jalan,String kota){
    this.jalan = jalan;
    this.kota = kota;
}

public String getAlamat(){
    return jalan + " , " + kota; 
}


}

class Mahasiswa{
String nama,nim;
Alamat alamat;

public String getNama(){
    return nama;
}

public String getNim(){
    return nim;
}

public String getAlamat(){
    return alamat.getAlamat();
}
}

public class Main {
    public static void main(String[] args){
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }    
}
