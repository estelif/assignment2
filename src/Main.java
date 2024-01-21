import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Gamer", 270450.78));
        people.add(new Employee("Robert", "Pattinson", "Police officer", 500000.00));
        people.add(new Student("Anita", "Maxwynn", 2.5));
        people.add(new Student("Khadisha", "Zhakupova", 3.0));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}