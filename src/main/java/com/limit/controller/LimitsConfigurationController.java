package com.limit.controller;

import com.limit.config.LimitConfig;
import com.limit.domain.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private LimitConfig limitConfig;

    @Autowired
    private Environment env;


    @GetMapping("/limits")
    public LimitConfiguration retrieveConfigs(){

        System.out.println(env.getActiveProfiles().toString());
        return new LimitConfiguration(limitConfig.getMaximum(),limitConfig.getMinimum());

    }

    @GetMapping("/environments")
    public String retrieveEnvironments(){

        return env.toString();

    }
}
