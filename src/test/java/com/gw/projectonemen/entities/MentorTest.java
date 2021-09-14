package com.gw.projectonemen.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentorTest {

    Mentor mentor;

    @BeforeEach
    void SetUp(){
        Household hh = new Household();
        hh.setHouseholdName("Adefemi Falase Household");
        Person person = new Person();
        Person aMentee = new Person("Joseph","","Fatoki");
        person.setPersonNameValues("Adefemi", "Olawale", "Falase");
        person.getHouseholdMembership().add(new HouseholdMembership(person,hh));
        mentor = new Mentor(person);
        mentor.setMentorId(1l);
        mentor.setPerson(person);
        mentor.addPersonAsMentee(aMentee);
        for (Mentee m:mentor.getMentees()) {
            System.out.println(m.getPerson().getPersonName().toString());
        }
    }

    @Test
    void getMentorPerson() {
        System.out.println("This will test that the Person that takes on the Mentorship role can be identified");
        assertEquals(this.mentor.getPerson().getPersonName().toString(),"Adefemi Olawale FALASE");
    }

@Test
    void getRoleName(){
    System.out.println("This tests that the correct role has been created");
    assert this.mentor.getRoleName().equals("Mentor");

}

}
