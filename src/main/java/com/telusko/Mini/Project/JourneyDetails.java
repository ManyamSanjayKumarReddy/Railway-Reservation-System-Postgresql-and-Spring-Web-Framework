package com.telusko.Mini.Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
class JourneyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int coach_num;
    private int cost_ticket;
    private String destination;
    private String date;

    public JourneyDetails() {
    }

    public JourneyDetails(String name, int coach_num, int cost_ticket, String destination, String date) {
        this.name = name;
        this.coach_num = coach_num;
        this.cost_ticket = cost_ticket;
        this.destination = destination;
        this.date = date;
    }

}