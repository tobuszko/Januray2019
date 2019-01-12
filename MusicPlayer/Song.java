package MusicPlayer;

public class Song {
    private String artist;
    private String songName;
    private String albumName;


    public Song(String artist, String songName, String albumName) {
        this.artist = artist;
        this.songName = songName;
        this.albumName = albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", songName='" + songName + '\'' +
                ", albumName='" + albumName + '\'' +
                '}';
    }



}
