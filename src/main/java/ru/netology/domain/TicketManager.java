package ru.netology.domain;

import java.util.Arrays;

public class TicketManager {
    TicketRepository repository;

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.add(ticket);
    }

    public Ticket[] removeById(int id) {
        return repository.removeById(id);
    }

    public Ticket[] findAll() {
        return repository.findAll();
    }


    public Ticket[] searchBy(String fromFly, String toFly) {
        Ticket[] ans = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (ticket.getFromFly() == fromFly && ticket.getToFly() == toFly) {
                Ticket[] tmp = new Ticket[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];
                }
                tmp[tmp.length - 1] = ticket;
                ans = tmp;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
