package com.example.postgresdemo.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "matches")
public class Matches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matchid")
    private Long matchid;

    private String date;

    @ManyToOne(targetEntity=Teams.class, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hometeamid", nullable = false, referencedColumnName="teamid")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Long hometeamid;

    @ManyToOne(targetEntity=Teams.class, fetch = FetchType.LAZY, optional = false )
    @JoinColumn(name="awayteamid", nullable = false, referencedColumnName="teamid")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Long awayteamid;

    private Long goalehome;
    private Long goaleaway;

    public Matches() {
    }

    public Matches(String date, Long hometeamid, Long awayteamid, Long goalehome, Long goaleaway) {
        this.date = date;
        this.hometeamid = hometeamid;
        this.awayteamid = awayteamid;
        this.goalehome = goalehome;
        this.goaleaway = goaleaway;
    }

    public Long getMatchid() {
        return matchid;
    }

    public void setMatchid(Long matchid) {
        this.matchid = matchid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getHometeamid() {
        return hometeamid;
    }

    public void setHometeamid(Long hometeamid) {
        this.hometeamid = hometeamid;
    }

    public Long getAwayteamid() {
        return awayteamid;
    }

    public void setAwayteamid(Long awayteamid) {
        this.awayteamid = awayteamid;
    }

    public Long getGoalehome() {
        return goalehome;
    }

    public void setGoalehome(Long goalehome) {
        this.goalehome = goalehome;
    }

    public Long getGoaleaway() {
        return goaleaway;
    }

    public void setGoaleaway(Long goaleaway) {
        this.goaleaway = goaleaway;
    }
}
