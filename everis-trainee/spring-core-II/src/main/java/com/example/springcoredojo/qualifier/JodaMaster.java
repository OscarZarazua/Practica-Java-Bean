package com.example.springcoredojo.qualifier;

import org.springframework.stereotype.Component;


@Component("jodaMaster")
public class JodaMaster implements Master{

    @Override
    public String getName() {
        return "jodaMaster";
    }
}


