package com.gw.projectonemen.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "MENTORS")
public class Mentor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MENTOR_ID")
    private Long mentorId;
    @OneToOne(cascade = CascadeType.ALL)
    private Person person;
    @OneToMany
    @JoinColumn(name = "MENTOR_ID")
    private Set<Mentee> mentees = new HashSet<>();

}
