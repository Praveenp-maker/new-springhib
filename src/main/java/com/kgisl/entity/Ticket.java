package com.kgisl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int event_id;
    private String event_name;
    private int prize;
    private int no_ticket;
    private int Tot;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEvent_id() {
        return event_id;
    }
    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }
    public String getEvent_name() {
        return event_name;
    }
    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }
    public int getPrize() {
        return prize;
    }
    public void setPrize(int prize) {
        this.prize = prize;
    }
    public int getNo_ticket() {
        return no_ticket;
    }
    public void setNo_ticket(int no_ticket) {
        this.no_ticket = no_ticket;
    }
    public int getTot() {
        return Tot;
    }
    public void setTot(int tot) {
        Tot = tot;
    }
    @Override
    public String toString() {
        return "Ticket [id=" + id + ", event_id=" + event_id + ", event_name=" + event_name + ", prize=" + prize
                + ", no_ticket=" + no_ticket + ", Tot=" + Tot + "]";
    }

    
    
}
