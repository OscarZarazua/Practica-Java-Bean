package com.example.springcoredojo.qualifier;

import org.springframework.stereotype.Component;

@Component("lukeMaster")
public class LukeMaster implements Master {

    @Override
    public String getName() {
        return "lukeMaster";
    }
}