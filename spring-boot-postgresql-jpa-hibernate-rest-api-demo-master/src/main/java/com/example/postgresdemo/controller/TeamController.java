package com.example.postgresdemo.controller;

import com.example.postgresdemo.exception.ResourceNotFoundException;

import com.example.postgresdemo.model.Teams;

import com.example.postgresdemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Page<Teams> getTeams(Pageable pageable) {
        return  teamRepository.findAll(pageable);
    }

    @PostMapping("/teams")
    public Teams createTeam(@Valid @RequestBody Teams teams) {
        return teamRepository.save(teams);
    }

    @GetMapping("/teams/q")
    public Teams  getInfoFromQuery() {
        return teamRepository.findByMatches();
    }



}
