public class PlaySong {
    User user;
    Song song;
    String playedAtTime;

    public PlaySong() {
        this.user = new User();
        this.song = new Song();
        this.playedAtTime = "00:00";
    }

    public PlaySong(User user, Song song, String playedAtTime) {
        this.user = user;
        this.song = song;
        this.playedAtTime = playedAtTime;
    }

    public void displayActivity() {
        System.out.println("User " + user.username + " (" + user.nickname + ")");
        System.out.println("Is enjoying the favorite song: \"" + song.title + "\" by " + song.singer);
        System.out.println("At " + playedAtTime);
    }
}