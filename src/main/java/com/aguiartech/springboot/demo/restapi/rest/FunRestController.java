package com.aguiartech.springboot.demo.restapi.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguiartech.springboot.demo.restapi.common.Coach;

@RestController
public class FunRestController {
    private Coach myCoach;
    private Coach yourCoach;
    
    @Autowired
    public FunRestController(Coach theCoach){
        myCoach = theCoach;
    }
    
    // inject properties for: agent.name and agent.codename

    @Value("${agent.name}")
    private String agentName;

    @Value("${agent.codename}")
    private String agentCodename;

    // expose new endpoint for "agent info"

    @GetMapping("/agentinfo")
    public String getAgentInfo(){
        return "Agent name is " + agentName + " and codename is " + agentCodename;
    }

    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is " + LocalDateTime.now().format(
            java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        ) + " BRT (UTC-3)";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day, if you are Aquarius!";
    }



}