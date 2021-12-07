package day01;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket("Aurora", LocalDateTime.now(), 1500);
        Ticket frontTicket = new FrontOfStageTicket("Aurora", LocalDateTime.now(), 3500, "bónusz");
        FrontOfStageTicket frontTicket2 = new FrontOfStageTicket("Aurora", LocalDateTime.now(), 3500, "bónusz");


        System.out.println(ticket.getPrice());          //1500
        System.out.println(frontTicket.getPrice());     //3500
        System.out.println(frontTicket2.getPrice());    //3500

        FrontOfStageTicket myTicket = ((FrontOfStageTicket) frontTicket);
        ((FrontOfStageTicket) frontTicket).saySomething();

        System.out.println(frontTicket.getClass());

        System.out.println(myTicket.getClass());

    }
}
