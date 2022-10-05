package ru.netology.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int cost;
    private String fromFly;
    private String toFly;
    private int time;

    public Ticket(int id, int cost, String fromFly, String toFly, int time) {
        this.id = id;
        this.cost = cost;
        this.fromFly = fromFly;
        this.toFly = toFly;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFromFly() {
        return fromFly;
    }

    public void setFromFly(String fromFly) {
        this.fromFly = fromFly;
    }

    public String getToFly() {
        return toFly;
    }

    public void setToFly(String toFly) {
        this.toFly = toFly;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;


    }

    @Override
    public int compareTo(Ticket otherTicket) {
        if (cost < otherTicket.cost) {
            return -1;
        }
        if (cost > otherTicket.cost) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getId() == ticket.getId() && getCost() == ticket.getCost() && getTime() == ticket.getTime() && getFromFly().equals(ticket.getFromFly()) && getToFly().equals(ticket.getToFly());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCost(), getFromFly(), getToFly(), getTime());
    }
}
