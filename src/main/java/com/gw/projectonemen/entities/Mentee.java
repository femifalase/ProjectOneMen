package com.gw.projectonemen.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "MENTEES")
public class Mentee extends Role implements Serializable {
    @Id
    private Long menteeId;
    @OneToOne
    @NonNull
    private Person person;
    @ManyToOne
    @JoinColumn(name ="MENTOR_ID")
    private Mentor mentor;
    @Column(name = "MENTORSHIP_START_DATE")
    private LocalDate mentorshipStartDate;
    @Column(name = "MENTORSHIP_END_DATE")
    private LocalDate mentorshipEndDate;

//    Constructor(s)......//
    public Mentee() {
        this.setRoleName("Mentee");
        this.setRoleDescription("");
    }

    public Mentee(Person person) {
       this();
       this.setPerson(person);
    }

}
