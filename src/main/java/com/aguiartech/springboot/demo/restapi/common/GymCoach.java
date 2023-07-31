package com.aguiartech.springboot.demo.restapi.common;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach{

    public GymCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast squat for 20 minutes";
    }
    
}