package com.riri.votingsystem.controller;

import com.riri.votingsystem.entity.Citizen;
import com.riri.votingsystem.repositoty.CandidateRepo;
import com.riri.votingsystem.repositoty.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class VotingController {

    @Autowired
    CitizenRepo citizenRepo;

    @Autowired
    CandidateRepo candidateRepo;

/*    @RequestMapping("/doAction")
    public String doAction(){
        Citizen t = new Citizen((long)1,"Bob");
        citizenRepo.save(t);
        return "Success";
    }*/


    @RequestMapping("/")
    public String goToVote(){
        return "vote";
    }

    @RequestMapping("/dologin")
    public String doLogin(@RequestParam String name){
       Citizen citizen = citizenRepo.findByName(name);
       if(!citizen.getHasVoted()){
           return "/performVote";
       }else{
           return "/alreadyVoted";
       }
    }
}
