package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void addPersonTest() {

        Concert concert = new Concert();
        Person person = new Person(new Ticket
                ("Aurora", LocalDateTime.of(2021, 12, 03, 11, 50), 1500));

        concert.addPerson(person, LocalTime.of(11, 20));

        assertEquals(1, concert.persons.size());
    }

    @Test
    void addVipPersonTest() {

        Concert concert = new Concert();
        Person vipPerson = new Person(new FrontOfStageTicket
                ("Aurora", LocalDateTime.of(2021, 12, 03, 11, 50), 1500,"dfds"));

        concert.addPerson(vipPerson, LocalTime.of(9, 50));

        assertEquals(1, concert.persons.size());
    }

    @Test
    void addPersonWrongEntryTimeTest() {

        Concert concert = new Concert();
        Person person = new Person(new Ticket
                ("Aurora", LocalDateTime.of(2021, 12, 03, 11, 50), 1500));

        IllegalArgumentException exp = assertThrows(IllegalArgumentException.class,
                ()-> concert.addPerson(person, LocalTime.of(10, 49)));

        assertEquals("Még nem léphet be!", exp.getMessage());
    }
}