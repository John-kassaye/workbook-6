package bonusexercises.whisperer;

public class Person implements FluentInAmharic, GoodInCommunication {
    @Override
    public void speakAmharic() {
        System.out.println("speaking amharic");
    }

    @Override
    public void communicate() {
        System.out.println("Communicating");
    }
}
