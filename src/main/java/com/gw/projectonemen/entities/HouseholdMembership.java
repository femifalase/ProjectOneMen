package com.gw.projectonemen.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "households_membership_history")
public class HouseholdMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long householdMembership_pk;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "household_id")
    private Household household;
    @Column(name = "HH_MEMBERSHIP_START_DATE")
    private LocalDate hhMembershipStart =  LocalDate.MIN;
    @Column(name = "HH_MEMBERSHIP_END_DATE")
    private LocalDate hhMembershipEnd =  LocalDate.MAX;

}
