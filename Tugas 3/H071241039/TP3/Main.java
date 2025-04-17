public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("About You", "The 1975", 326);
        Song song2 = new Song("33x", "Perunggu", 434);
        Song song3 = new Song("Cinnamon Girl", "Lana Del Rey", 300);

        User user1 = new User("thecaravelle", "nia", song1);
        User user2 = new User("Gbrielmttl", "toti", song2);
        User user3 = new User("whoiss4b", "Shabong", song3);

        PlaySong activity1 = new PlaySong(user1, song1, "22:10");
        activity1.displayActivity();
        System.out.println("=================================================");
        
        PlaySong activity2 = new PlaySong(user2, song2, "20:48");
        activity2.displayActivity();
        
        PlaySong activity3 = new PlaySong(user3, song3, "7:50");
        activity3.displayActivity();

        System.out.println("=================================================");
        
        user2.displayDuration();
        user1.displayDuration();

        user1.shareSong(user2);
        user2.receiveSong(song1);
    }
}