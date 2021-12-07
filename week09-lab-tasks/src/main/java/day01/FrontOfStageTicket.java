package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{

    private String extraCode;

    public FrontOfStageTicket(String band, LocalDateTime dateAndTime, int price, String extraCode) {
        super(band, dateAndTime, price);
        this.extraCode = extraCode;
    }

    public String getExtraCode() {
        return extraCode;
    }

    @Override
    public LocalTime entryTime() {
//        return LocalTime.of(getDateAndTime().getHour()-2, getDateAndTime().getMinute());
        return super.entryTime().minusHours(1);
    }

    public void saySomething(){
        System.out.println("Ticket");
    }
}
