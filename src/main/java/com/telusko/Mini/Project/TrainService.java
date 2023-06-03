package com.telusko.Mini.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainService {

    @Autowired
    JourneyDB db;

    public void addDetails(JourneyDetails J){
        // passengers.add(J);
        db.save(J);
    }

    public List<JourneyDetails> getDetails(){
        return db.findAll();
    }

    public List<JourneyDetails> getDestinationText(String text){
        String str = text.toLowerCase();
        return db.findAll()
                .stream()
                .filter(p -> p.getDestination().toLowerCase().contains(str))
                .collect(Collectors.toList());
    }


    public List<JourneyDetails> getDetailsCost(int value){

        return db.findAll()
                .stream()
                .filter(p -> p.getCost_ticket() > value)
                .collect(Collectors.toList());

    }
}
