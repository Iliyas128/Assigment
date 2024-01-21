import java.util.ArrayList;
import java.util.Collections;

interface Payable {
    double getPaymentAmount();
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("John", "Lennon", "Manager", 27045.78));
        peopleList.add(new Employee("Kanye", "West", "Singer", 999999999.99));
        peopleList.add(new Student("Iliyas", "Moldahan", 1.5));
        peopleList.add(new Student("Vanessa", "James", 2.7));


        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}