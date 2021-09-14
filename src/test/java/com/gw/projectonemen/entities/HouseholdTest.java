package com.gw.projectonemen.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

class HouseholdTest {

    Household hh;

    @BeforeEach
    void setUp() {
        this.hh = new Household();
        this.hh.setHouseholdName("Adefemi Falase Household");
        Person p = new Person("Adefemi", "Olawale", "Falase");
        HouseholdMembership hm = new HouseholdMembership(p, hh);
        this.hh.getHouseholdMembers().add(hm);

    }

    @Test
    void getHouseholdName() {
        System.out.println(hh.getHouseholdName());
        assert this.hh.getHouseholdName().equals("Adefemi Falase Household");
    }
}