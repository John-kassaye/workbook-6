public class Main {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<Laptop>();
        laptopBag.add(new Laptop("Toshiba"));

        Bag<Chihuahua> chihuahuaBag = new Bag<Chihuahua>();
        chihuahuaBag.add(new Chihuahua("jack"));

        laptopBag.print();
        chihuahuaBag.print();


        // first one
//        ChihuahuaBag chihuahuaBag1 = new ChihuahuaBag();
//        chihuahuaBag1.add(new Chihuahua("John"));
//
//        LaptopBag laptopBag1 = new LaptopBag();
//        laptopBag1.add(new Laptop("Mac"));
//
//        chihuahuaBag1.print();
//        laptopBag1.print();

    }
}
