package interfaces.playable;

public class guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing: 🎸🎸🎸");
    }
}
