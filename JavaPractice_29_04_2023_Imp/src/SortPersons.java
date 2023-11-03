import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersons {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 40));
        
        Collections.sort(persons, new AgeComparator());
        
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}