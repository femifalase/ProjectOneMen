package com.gw.projectonemen.services;


import com.gw.projectonemen.entities.Household;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HouseholdServiceIntf {
    List<Household> findAll();

    Household findById(Long id);

    List<Household> findByHouseholdName(String householdName);

    Household save(Household household);

    void delete(Household household);

    Page<Household> findAllByPage(Pageable pageable);
}
