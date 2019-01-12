package MusicPlayer;

public class MP3Player extends MusicPlayer{
    Song [] songs= {
        new Song("Kazik", "Tata dilera", "Tata dilera"),
        new Song ("aaa", "aaa", "aaa"),
        new Song ("bbb", "bbb", "bbb"),
        new Song ("ccc", "ccc", "ccc")
    };

    private int currentSong = 0;

    public MP3Player() {
        System.out.println("Gra odtwarzacz MP3");
    }

    public void play() {
        System.out.println(this.songs[currentSong]);

    }


    public void stop() {

    }


    public void pause() {

    }


    public void next() {
        if (this.songs.length-1 > this.currentSong) {
            this.currentSong++;
            this.play();
        } else {
            System.out.println("Koniec listy utworów, zaczyanmy od nowa");
            this.currentSong=0;
        }
    }


    public void previous() {
        if (this.currentSong > 0) {
            this.currentSong--;
            this.play();
        }else{
            System.out.println("Jesteśmy na początku listy utwórów, idę do ostatniego");
            this.currentSong=this.songs.length-1;
        }
    }


}
