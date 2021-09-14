package com.gw.projectonemen.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "MENTORS")
public class Mentor extends Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MENTOR_ID")
    private Long mentorId;
    @OneToOne(cascade = CascadeType.ALL)
    @NonNull
    private Person person;
    @OneToMany
    @JoinColumn(name = "MENTOR_ID")
    private final Set<Mentee> mentees = new HashSet<>();

    //    Constructor(s)......//
    public Mentor() {
        this.setRoleName("Mentor");
        this.setRoleDescription("");
    }

    public Mentor(Person person) {
        this();
        this.setPerson(person);
    }

    public void addMentee(Mentee mentee) {
        this.getMentees().add(mentee);
    }

    public void addPersonAsMentee(Person p) {
        Mentee mentee = new Mentee(p);
        this.getMentees().add(mentee);
    }

}
