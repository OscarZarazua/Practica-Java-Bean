package com.example.springcoredojo.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public String getName() {
        return "un nombre cualquiera";
    }

}
