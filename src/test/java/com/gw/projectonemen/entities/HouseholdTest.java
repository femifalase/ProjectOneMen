package com.gw.projectonemen.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class HouseholdTest {

    Household hh;
    @BeforeEach
    void setUp() {
        this.hh = new Household();
        this.hh.setHouseholdName("Adefemi Falase Household");
        this.hh.getHouseholdMembers().add(new Person("Adefemi", "Olawale", "Falase"));
    }

    @Test
    void getHouseholdName() {
        System.out.println(hh.getHouseholdName());
        assert this.hh.getHouseholdName().equals("Adefemi Falase Household");
    }

    @Test
    void getHouseholdMembers(){
        assert Arrays.stream(((HashSet<Person>)(this.hh.getHouseholdMembers())).toArray()).count()==1;
    }
}