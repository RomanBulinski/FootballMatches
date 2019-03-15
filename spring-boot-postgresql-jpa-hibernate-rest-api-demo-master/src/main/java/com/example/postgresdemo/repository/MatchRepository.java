package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchRepository extends JpaRepository< Matches, Long> {

}


