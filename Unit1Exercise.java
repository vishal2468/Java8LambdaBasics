import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> list=Arrays.asList(
        new Person("Pritam", "Jain", 24),
        new Person("Sakshi", "Sahana", 22),
        new Person("Billu", "Blaster", 32),
        new Person("Stephen","King", 44),
        new Person("Wakanda","forever",55)
    );
    // Step 1: Sort list by last name
    Collections.sort(list,(p1,p2)->p1.getLastName().compareTo(p1.getLastName()));
    // Step 2: Create a method that prints all elements in the list
    
    // Step 3: Create a method that prints all people that have last name beginning with C
    }
    
    
}
