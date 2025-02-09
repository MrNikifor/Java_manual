package patterns.structural.facade;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        tv.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        tv.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}
