public class User {
    String namaPengguna;
    String namaPanggilan;
    Song laguFavorit;

    public User() {
        this.namaPengguna = "Nama Pengguna";
        this.namaPanggilan = "Tanpa Panggilan";
        this.laguFavorit = new Song();
    }

    public User(String namaPengguna, String namaPanggilan, Song laguFavorit) {
        this.namaPengguna = namaPengguna;
        this.namaPanggilan = namaPanggilan;
        this.laguFavorit = laguFavorit;
    }
    
    public void bagikanLagu(User penggunaLain) {
        System.out.println(this.namaPengguna + " membagikan lagu ke " + penggunaLain.namaPengguna + "!");
    }

    public void terimaLagu(Song lagu) {
        this.laguFavorit = lagu;
        System.out.println(this.namaPengguna + " menerima lagu baru sebagai favorit: " + lagu.judul);
    }
    public void tampilkanDurasi() {
        int durasi = laguFavorit.durasiDetik;
        int menit = durasi / 60;
        int detik = durasi % 60;
        System.out.println("Durasi lagu favorit " + namaPanggilan + ": " + menit + " menit " + detik + " detik");
    }
}
