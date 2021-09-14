package com.gw.projectonemen.services;

import com.google.common.collect.Lists;
import com.gw.projectonemen.entities.Household;
import com.gw.projectonemen.repo.HouseholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("householdService")
@Transactional
public class HouseholdService implements HouseholdServiceIntf {

    @Autowired
    private HouseholdRepository householdRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Household> findAll() {
        return Lists.newArrayList(householdRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Household> findByHouseholdName(String householdName) {
        return householdRepository.findByHouseholdName(householdName);
    }

    @Override
    @Transactional(readOnly = true)
    public Household findById(Long id) {
        return householdRepository.findById(id).get();
    }


    @Override
    public Household save(Household household) {

        return householdRepository.save(household);
    }

    @Override
    public void delete(Household household) {
        householdRepository.delete(household);
    }

    @Override
    public Page<Household> findAllByPage(Pageable pageable) {
        return null;
    }
}
