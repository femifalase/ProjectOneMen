package com.gw.projectonemen.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
//@NoArgsConstructor
@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {

//    Attributes......
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSON_ID")
    private Long personId;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstname", column = @Column(name = "FIRST_NAME")),
            @AttributeOverride(name = "middlename", column = @Column(name = "MIDDLE_NAME")),
            @AttributeOverride(name = "familyname", column = @Column(name = "FAMILY_NAME"))
    })
    private final PersonName personName = new PersonName();
    @OneToMany(mappedBy = "person")
    private Set<Household> householdMembership = new HashSet<>();
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Mentor mentor;


//    Constructor(s)......


    public Person() {}
    public Person(String firstname, String middlename, String familyname) {

        this.personName.setNameValues(firstname, middlename, familyname);

    }

    //    Class Method(s)......
    public void setPersonNameValues(String firstname, String middlename, String familyname) {
        this.getPersonName().setFamilyname(familyname);
        this.getPersonName().setFirstname(firstname);
        this.getPersonName().setMiddlename(middlename);
    }

    @Override
    public String toString() {

       return this.getPersonId() + ": " +
                this.getPersonName().toString();

    }
}

/**
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
        /* public static*/
class PersonName implements Serializable {
    @Column(name = "FIRST_NAME")
    String firstname = "";
    @Column(name = "MIDDLE_NAME")
    String middlename = "";
    @Column(name = "FAMILY_NAME")
    String familyname = "";


//    Class Method(s)......
    public void setNameValues(String firstname, String middlename, String familyname) {
        this.familyname=familyname;
        this.firstname=firstname;
        this.middlename = middlename;
    }



//    PersonName Class To String......
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        if (this.getFirstname() == null) {
            sb.append("");
        } else {
            sb.append(this.getFirstname() + " ");
        }
        if (this.getMiddlename() == null) {
            sb.append("");
        } else {
            sb.append(this.getMiddlename() + " ");
        }
        if (this.getFamilyname() == (null)) {
            sb.append("");
        } else {
            sb.append(this.getFamilyname().toUpperCase());
        }
        return sb.toString();
    }
}


