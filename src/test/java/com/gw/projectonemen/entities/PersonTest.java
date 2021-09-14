package com.gw.projectonemen.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    Person p;
    int personNameHashCode;

    @BeforeEach
    void setUp() {
        p = new Person();
        this.p.getPersonName().familyname = "Falase";
        this.p.getPersonName().firstname = "Adefemi";
        this.p.getPersonName().middlename = "Olawale";
        personNameHashCode = p.getPersonName().hashCode();

    }

    @Test
    void testToString() {
        assert this.p.getPersonName().toString().equals("Adefemi Olawale FALASE");
    }


    @Test
    void testSetPersonNameValues() {
        //        Initial Set up name
        System.out.println(p.getPersonName().toString());
//        Asserting set up
        p.setPersonNameValues("Femi", "Wale", "FALASE");

        System.out.println("First Name: " + p.getPersonName().getFirstname());
        assert p.getPersonName().firstname.equals("Femi");
        System.out.println("Middle Name: " + p.getPersonName().getMiddlename());
        assert p.getPersonName().middlename.equals("Wale");
        System.out.println("Family Name: " + p.getPersonName().getFamilyname());
        assert p.getPersonName().familyname.equals("FALASE");
    }



    @Test
    void getPersonName() {
        System.out.println(p.hashCode());
        assertEquals (this.p.getPersonName().hashCode(),this.personNameHashCode);
    }

    @Test
    void getHouseholdMembership() {
    }

    @Test
    void getMentor() {
    }

    @Test
    void setPersonId() {
    }

    @Test
    void setHouseholdMembership() {
    }

    @Test
    void setMentor() {
    }

    @Test
    void testEquals() {
    }
}