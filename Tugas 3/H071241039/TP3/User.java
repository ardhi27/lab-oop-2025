public class User {
    String username;
    String nickname;
    Song favoriteSong;

    public User() {
        this.username = "Username";
        this.nickname = "No Nickname";
        this.favoriteSong = new Song();
    }

    public User(String username, String nickname, Song favoriteSong) {
        this.username = username;
        this.nickname = nickname;
        this.favoriteSong = favoriteSong;
    }

    public void shareSong(User otherUser) {
        System.out.println(this.username + " shared a song with " + otherUser.username + "!");
    }

    public void receiveSong(Song song) {
        this.favoriteSong = song;
        System.out.println(this.username + " received a new favorite song: " + song.title);
    }

    public void displayDuration() {
        int duration = favoriteSong.durationInSeconds;
        int minutes = duration / 60;
        int seconds = duration % 60;
        System.out.println("Favorite song duration of " + nickname + ": " + minutes + " minutes " + seconds + " seconds");
    }
}