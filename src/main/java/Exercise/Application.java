package Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    private static final List<Person> people = new ArrayList<>();

    public static void run() {
        loadPeople();

        SaveToDatabase.loadPeopleToDb();
        SaveToDatabase.getFromDb();

        System.out.println();
                try {
                WriteToFile.PersonDataToFile();
                System.out.println("The Person was successfully written to a file");
                } catch (IOException e) {
                e.printStackTrace();
                }
                try {
                WriteToFile.PersonDataFromFile();
                } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                }
    }

    private static void loadPeople() {
        Random age = new Random();
        IntStream.rangeClosed(1, 15)
                .mapToObj(i -> new Person(i, "PN" + i, "PSN" + i, age.nextInt(25) + 18,
                        new Person("PMN" + i, "PMSN" + i),
                        new Person("PFN" + i, "PFSN" + i)))
                .forEach(people::add);
    }

    public static List<Person> getPeople() {
        return people;
    }
}