package practice;

import java.util.*;
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


        List<Integer> a = Arrays.asList(2,2,3,44,5);
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

//        printStudent();
    }

    public static void printStudent(){
            Comparator<Student> com = (o1,o2) -> o1.getAge() - o2.getAge();

            List<Student> students = new ArrayList<>();
            students.add(new Student("johnny","polaris",87));
            students.add(new Student("johnny","Polaris",21));
            students.add(new Student("Anthony","Somewhere",41));


            Collections.sort(students,com);
            for (Student student : students){
                System.out.println(student.toString());
            }

    }
}
