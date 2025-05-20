package generics;

public class Main {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<Laptop>();
        laptopBag.add(new Laptop("Toshiba"));
        laptopBag.add(new Laptop("Mac"));
        laptopBag.add(new Laptop("Window"));

        Bag<Chihuahua> chihuahuaBag = new Bag<Chihuahua>();
        chihuahuaBag.add(new Chihuahua("jack"));

        laptopBag.print();
        chihuahuaBag.print();

        laptopBag.getFirstItem();
    }
}
