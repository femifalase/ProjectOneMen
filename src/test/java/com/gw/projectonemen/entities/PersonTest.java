package com.gw.projectonemen.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p;

    @BeforeEach
    void setUp() {
        p = new Person();
        this.p.getPersonName().familyname = "Falase";
        this.p.getPersonName().firstname = "Adefemi";
        this.p.getPersonName().middlename = "Olawale";
    }

    @Test
    void testToString() {
        assert this.p.getPersonName().toString().equals("Adefemi Olawale FALASE");
    }


    @Test
    void setPersonNameValues() {
//        Initial Set up name
        System.out.println(p.getPersonName().toString());
//        Asserting set up
        p.setPersonNameValues("Femi", "Wale", "FALASE");

        System.out.println("First Name: "+p.getPersonName().getFirstname());
        assert p.getPersonName().firstname.equals("Femi");
        System.out.println("Middle Name: "+p.getPersonName().getMiddlename());
        assert p.getPersonName().middlename.equals("Wale");
        System.out.println("Family Name: "+p.getPersonName().getFamilyname());
        assert p.getPersonName().familyname.equals("FALASE");

    }
}