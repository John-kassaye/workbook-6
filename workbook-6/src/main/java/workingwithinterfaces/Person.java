package workingwithinterfaces;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.getLastName().compareTo(o.getLastName()) == 0){
        return this.getFirstName().compareTo(o.getFirstName());
        } else if (getFirstName().compareTo(o.getFirstName()) == 0){
            return this.getAge() - o.getAge();
        } else {
            return getLastName().compareTo(o.getLastName());
        }
    }
}
