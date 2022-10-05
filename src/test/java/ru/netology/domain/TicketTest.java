package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketTest {
    TicketRepository repository = new TicketRepository();
    TicketManager manager = new TicketManager(repository);
    Ticket ticket = new Ticket(725, 7932, "ULV", "SIP", 247);
    Ticket ticket1 = new Ticket(321, 527, "ULV", "KUF", 67);
    Ticket ticket2 = new Ticket(134, 6235, "KUF", "SIP", 206);
    Ticket ticket3 = new Ticket(427, 5423, "ULV", "SIP", 247);
    Ticket ticket4 = new Ticket(328, 7931, "SIP", "ULV", 263);
    Ticket ticket5 = new Ticket(846, 3279, "ULV", "SIP", 307);
    Ticket ticket6 = new Ticket(728, 6932, "KUF", "ULV", 247);
    Ticket ticket7 = new Ticket(727, 6847, "ULV", "SIP", 236);

    @Test
    public void findTicket() {
        manager.add(ticket);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.searchBy("ULV", "SIP");
        Ticket[] expected = {ticket5, ticket3, ticket7, ticket};
        assertArrayEquals(actual, expected);

        Ticket[] actual1 = manager.searchBy("KUF", "ULV");
        Ticket[] expected1 = {ticket6};
        assertArrayEquals(actual1, expected1);

        Ticket[] actual2 = manager.searchBy("MOS", "SIP");
        Ticket[] expected2 = {};
        assertArrayEquals(actual2, expected2);
    }
}
