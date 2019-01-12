package MusicPlayer;

public class MP3Player extends MusicPlayer{
    Song [] songs;

    private int currentSong = 0;

    public MP3Player(Song[] s) {
        System.out.println("Gra odtwarzacz MP3");
        this.songs = s;

    }

    public void play() {
        System.out.println("Utwór nr: " + currentSong);
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
