package interfaces.playable;

public class piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing: 🎹🎹🎹 ");
    }
}
