package fr.ensai.running.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_competition")
    private long id;
    private String designation;
    private String city;
    private LocalDate eventDate;
    private float distance;
    private int max_athletes;

    @Override
    public String toString() {
        return "Athlete (" + designation + " " + eventDate + ", " + max_athletes + ")";
    }

}
