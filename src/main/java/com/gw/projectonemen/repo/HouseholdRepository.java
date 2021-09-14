package com.gw.projectonemen.repo;

import com.gw.projectonemen.entities.Household;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  HouseholdRepository extends CrudRepository<Household, Long> {

    List<Household> findByHouseholdName(String householdName);
}
