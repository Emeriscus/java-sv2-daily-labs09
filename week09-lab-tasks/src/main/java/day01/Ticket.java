package day01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String band;
    private LocalDateTime dateAndTime;
    private int price;

    public Ticket(String band, LocalDateTime dateAndTime, int price) {
        this.band = band;
        this.dateAndTime = dateAndTime;
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime entryTime(){
//        return LocalTime.of(dateAndTime.getHour()-1, dateAndTime.getMinute());
        return dateAndTime.toLocalTime().minusHours(1);
    }


}
