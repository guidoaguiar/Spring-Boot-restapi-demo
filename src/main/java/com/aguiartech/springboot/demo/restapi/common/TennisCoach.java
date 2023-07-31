package com.aguiartech.springboot.demo.restapi.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    
    public TennisCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice your backhand volley";
    }
    
}