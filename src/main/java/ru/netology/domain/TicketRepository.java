package ru.netology.domain;

import java.util.Arrays;

public class TicketRepository {

    private Ticket[] tickets = new Ticket[0];

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] removeById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int index = 0;
        for (Ticket item : tickets) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        tickets = tmp;
        return tmp;
    }

    public Ticket[] findAll() {
        Ticket[] findAll = new Ticket[tickets.length];
        System.arraycopy(tickets, 0, findAll, 0, tickets.length);
        return findAll;
    }


}
