package com.cricketinfo_Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketinfo_Application.model.Match;
import com.cricketinfo_Application.service.MatchServiceImpl;
@RestController
@RequestMapping("/matches")
@CrossOrigin
public class CricketController {
	@Autowired
	private MatchServiceImpl service;
	private MatchServiceImpl MatchServiceImpl;

    public CricketController(MatchServiceImpl service) {
        this.MatchServiceImpl = service;
    }

    // api for getting live matches

    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        System.out.println("getting live match");
        return new ResponseEntity<>(this.service.getLiveMatches(), HttpStatus.OK);
    }

   
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.service.getAllMatches(), HttpStatus.OK);
    }

}
