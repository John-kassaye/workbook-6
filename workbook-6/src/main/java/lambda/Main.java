package lambda;

public class Main {
    public static void main(String[] args) {
        CompareLogic compareLogic = (s1,s2) -> System.out.println(s1 + s2);
        compareLogic.compare("Yooo","Testing");

    }
}
