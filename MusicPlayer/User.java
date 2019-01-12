package MusicPlayer;

public class User {

    public static void main(String[] args) {
        Song [] songs = {
                new Song("Kazik", "Tata dilera", "Tata dilera"),
                new Song ("aaa", "aaa", "aaa"),
                new Song ("bbb", "bbb", "bbb"),
                new Song ("ccc", "ccc", "ccc"),
                new Song("AAAA", "AAAAA", "AAA"),
                new Song ("BBBBB", "BBB", "BBBBB"),
                new Song ("CCC", "CCCC", "CCCC"),
                new Song ("DDDDDD", "DDDD", "DDD")
        };


        Player p = new MP3Player(songs);
        p.play();
        p.next();
        p.previous();
        p.previous();
        p.previous();
        p.next();
        p.next();
        p.next();


    }
}
