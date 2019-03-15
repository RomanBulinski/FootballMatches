package com.example.postgresdemo.repository;


import com.example.postgresdemo.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Teams, Long> {

//    @Query(value = "SELECT * FROM teams JOIN matches ON teams.teamid = matches.hometeamid", nativeQuery=true)
    @Query(value = "SELECT * FROM teams LIMIT 1", nativeQuery=true)
    Teams findByMatches();


}



