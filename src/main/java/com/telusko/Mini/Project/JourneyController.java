package com.telusko.Mini.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class JourneyController {

    @Autowired
    TrainService service;

    @GetMapping("/passengers")
    public List<JourneyDetails> getDetails(){
        return service.getDetails();
    }


}
