package com.cricketinfo_Application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketinfo_Application.model.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {
	//we are fetching match details through teamHeading property 
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
