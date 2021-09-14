package com.gw.projectonemen.controllers;


import com.gw.projectonemen.entities.Household;
import com.gw.projectonemen.services.HouseholdServiceIntf;
import com.gw.projectonemen.services.HouseholdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/households")
@Controller
public class HouseholdController {

    //    Attribute(s)......//
    private final Logger logger = LoggerFactory.getLogger(HouseholdController.class);
    private HouseholdServiceIntf householdService;

    //    Method(s)......//
    @RequestMapping(method = RequestMethod.GET)
    public String listHouseholds(Model uiModel) {
        logger.info("Listing households");
//        List<Household> households = new HouseholdService().findAll();
        List<Household> households = new ArrayList<>();
        households.add(new Household("Adefemi Falase"));
        uiModel.addAttribute("households", households);
        logger.info("No. of households: " + households.size());
        return households.toString();
    }

    @Autowired
    public void setSingerService(HouseholdService householdService) {
        this.householdService = householdService;
    }
}

