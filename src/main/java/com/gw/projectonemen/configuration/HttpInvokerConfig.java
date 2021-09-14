package com.gw.projectonemen.configuration;


import com.gw.projectonemen.services.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
@Configuration
public class HttpInvokerConfig {
    @Autowired
    HouseholdService householdService;


    @Bean(name = "/httpInvoker/singerService")
    public HttpInvokerServiceExporter httpInvokerServiceExporter() {
        HttpInvokerServiceExporter invokerService =
                new HttpInvokerServiceExporter();
        invokerService.setService(householdService);
        invokerService.setServiceInterface(HouseholdService.class);
        return invokerService;
    }
}
