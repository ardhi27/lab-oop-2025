public class Song {
    String title;
    String singer;
    int durationInSeconds;

    public Song() {
        this.title = "Unknown Title";
        this.singer = "Unknown Singer";
        this.durationInSeconds = 0;
    }

    public Song(String title, String singer, int durationInSeconds) {
        this.title = title;
        this.singer = singer;
        this.durationInSeconds = durationInSeconds;
    }
}
