package workingwithinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("johnny","zidane",22));
        personList.add(new Person("kaka","daniel",72));
        personList.add(new Person("henry","Abel",92));

        Collections.sort(personList);
        for (Person person : personList){
            System.out.println(person.toString());
        }
    }
}
