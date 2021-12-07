package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    List<Person> persons = new ArrayList<>();

    public void addPerson(Person person, LocalTime time){
        if (time.isBefore(person.getTicket().entryTime())){
            throw new IllegalArgumentException("Még nem léphet be!");
        }
        persons.add(person);
    }
}
