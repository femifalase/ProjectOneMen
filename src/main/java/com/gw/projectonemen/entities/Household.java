package com.gw.projectonemen.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Household implements Serializable, Comparable<Household> {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long householdId;
    private String householdName;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "addressLine1", column = @Column(columnDefinition = "ADDRESSLINE1")),
            @AttributeOverride(name = "addressLine2", column = @Column(columnDefinition = "ADDRESSLINE2")),
            @AttributeOverride(name = "addressLine3", column = @Column(columnDefinition = "ADDRESSLINE3")),
            @AttributeOverride(name = "addressTown", column = @Column(columnDefinition = "ADDRESSTOWN")),
            @AttributeOverride(name = "addressRegion", column = @Column(columnDefinition = "ADDRESSREGION")),
            @AttributeOverride(name = "addressCountry", column = @Column(columnDefinition = "ADDRESSCOUNTRY")),
            @AttributeOverride(name = "addressPostCode", column = @Column(columnDefinition = "ADDRESSPOSTCODE")),
            @AttributeOverride(name = "addressLatitude", column = @Column(columnDefinition = "ADDRESSLATITUDE")),
            @AttributeOverride(name = "addressLongitude", column = @Column(columnDefinition = "ADDRESSLONGITUDE"))
    })
    private TerraFirmaAddress householdAddress;
    @OneToMany(mappedBy = "household")
    private final Set<Person> householdMembers = new HashSet<>();

//    Class Method(s)......



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Household)) return false;

        Household household = (Household) o;

        if (getHouseholdId() != null ? !getHouseholdId().equals(household.getHouseholdId()) : household.getHouseholdId() != null)
            return false;
        return getHouseholdName() != null ? getHouseholdName().equals(household.getHouseholdName()) : household.getHouseholdName() == null;
    }

    @Override
    public int hashCode() {
        int result = getHouseholdId() != null ? getHouseholdId().hashCode() : 0;
        result = 31 * result + (getHouseholdName() != null ? getHouseholdName().hashCode() : 0);
        return result;
    }

   /**
    * The default order of households is by household identifiers*/
    @Override
    public int compareTo(Household o) {
        if (this.getHouseholdId().equals(o.householdId)) {
            return 0;
        } else if (this.getHouseholdId() > o.getHouseholdId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
