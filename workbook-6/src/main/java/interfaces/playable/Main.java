package interfaces.playable;

public class Main {
    public static void main(String[] args) {
        Playable playable = new guitar();
        Playable playable2 = new piano();

        playable.play();
        playable2.play();
    }
}
