package MusicPlayer;

public class CDPlayer extends MusicPlayer{

    Song [] songs;


    private int currentSong = 0;

    public CDPlayer(Song[] s) {
        System.out.println("Gra odtwarzacz CD");
        this.songs = s;
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
