package com.example.springcoredojo.autowired;

import org.springframework.stereotype.Component;

@Component("joke")
public class Joke {

    public String getLine() {
        return "no lo entenderias";
    }

}
