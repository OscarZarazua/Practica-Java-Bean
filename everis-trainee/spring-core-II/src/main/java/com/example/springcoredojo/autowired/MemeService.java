package com.example.springcoredojo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("meme")
public class MemeService {

    @Autowired
    private Joke joke;

    public String getMessage(){
        return joke.getLine();
    }

}
