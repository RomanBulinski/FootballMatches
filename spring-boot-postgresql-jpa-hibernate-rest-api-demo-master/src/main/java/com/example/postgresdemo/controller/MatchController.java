package com.example.postgresdemo.controller;


import com.example.postgresdemo.model.Matches;
import com.example.postgresdemo.model.Teams;

import com.example.postgresdemo.repository.MatchRepository;

import com.example.postgresdemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatchController {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MatchRepository matchRepository;

    @GetMapping("/matches")
    public Page<Matches> getMatches(Pageable pageable) {
        return matchRepository.findAll(pageable);
    }

//    @GetMapping("/matches")
//    public List<Answer> getAnswersByQuestionId(@PathVariable Long questionId) {
//        return answerRepository.findByQuestionId(questionId);
//    }


}
