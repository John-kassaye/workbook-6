package practice;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String address;
    private int age;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if (this.address.compareToIgnoreCase(o.address) ==0 && this.getName().compareTo(o.getName()) ==0){
            return this.age - o.getAge();
        }
        else if (this.address.compareToIgnoreCase(o.getAddress()) == 0){
            return this.getName().compareTo(o.getName());
        }

        return this.getAddress().compareToIgnoreCase(o.getAddress());
    }
}
