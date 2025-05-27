package practice;

import java.util.*;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
//
//        String name = JOptionPane.showInputDialog("Enter your name");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        String specialities = JOptionPane.showInputDialog("Enter your Specialities");
//        String n = JOptionPane.showInputDialog("Your name is " + name);

//        JOptionPane.showMessageDialog(null,"Your name is:" + name);
//        JOptionPane.showMessageDialog(null,"Your age is:" + age);
//        JOptionPane.showMessageDialog(null,"Your specialities is:" + specialities);
//        JOptionPane.showMessageDialog(null,"Your name is:" + n);


        List<Integer> a = Arrays.asList(62,27,33,44,5);
        List<String> b = Arrays.asList("John","Zidane","Henry");


        A some = new A() {
            @Override
            public String print(String message) {
                return message;
            }
        };
        some.print("Suiiiiiii");

        A some1 = message -> message;
        System.out.println(some1.print("Suiiiiiiiiiiiiiiiiiii"));
        System.out.println("*************");
        System.out.println("*************");

        a.stream()
                .filter(n -> n%2 == 1)
                .map(n -> n*2)
                .sorted()
                .forEach(System.out::println);

//        printStudent();
    }

    public static void printStudent(){
            Comparator<Student> com = (o1,o2) -> o1.getAge() - o2.getAge();

            List<Student> students = new ArrayList<>();
            students.add(new Student("johnny","polaris",87));
            students.add(new Student("johnny","Polaris",21));
            students.add(new Student("Anthony","Somewhere",41));


            students.sort(com);
            students.forEach(s -> System.out.println(s));
            students.forEach(System.out::println);
            System.out.println(students.stream().count());




    }
}
