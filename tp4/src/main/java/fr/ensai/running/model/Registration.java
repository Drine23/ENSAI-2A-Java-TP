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
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_registration")
    private long id;
    private long is_athlete;
    private long id_competition;
    private LocalDate registration_date;
    
    @Override
    public String toString() {
        return "Athlete (" + registration_date + " )";
    }
    
}
