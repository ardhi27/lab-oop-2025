public class PlaySong {
    User user;
    Song song;
    String waktuDiputar;

    public PlaySong() {
        this.user = new User();
        this.song = new Song();
        this.waktuDiputar = "00:00";
    }

    public PlaySong(User user, Song song, String waktuDiputar) {
        this.user = user;
        this.song = song;
        this.waktuDiputar = waktuDiputar;
    }
 
    public void tampilkanAktivitas() {
        System.out.println("Pengguna " + user.namaPengguna + " (" + user.namaPanggilan + ")");
        System.out.println("Sedang menikmati lagu favorit: \"" + song.judul + "\" oleh " + song.penyanyi);
        System.out.println("Pada pukul " + waktuDiputar);
    }
}
