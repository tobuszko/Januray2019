package MusicPlayer;

public class CDPlayer extends MusicPlayer{

    Song [] songs= {
            new Song("AAAA", "AAAAA", "AAA"),
            new Song ("BBBBB", "BBB", "BBBBB"),
            new Song ("CCC", "CCCC", "CCCC"),
            new Song ("DDDDDD", "DDDD", "DDD")
    };


    private int currentSong = 0;

    public CDPlayer() {
        System.out.println("Gra odtwarzacz CD");
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
