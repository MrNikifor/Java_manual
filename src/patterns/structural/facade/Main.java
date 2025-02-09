package patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvdPlayer, soundSystem);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
