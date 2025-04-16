public class Song {
    String judul;
    String penyanyi;
    int durasiDetik;

    public Song() {
        this.judul = "Judul Tidak Diketahui";
        this.penyanyi = "Penyanyi Tidak Diketahui";
        this.durasiDetik = 0;
    }

    public Song(String judul, String penyanyi, int durasiDetik) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasiDetik = durasiDetik;
    }
}
