package com.example.postgresdemo.model;

import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Teams {

//    @GeneratedValue(strategy=GenerationType.AUTO)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamid;

    private String name;

    private String country;

    private String city;



    public Teams() {
    }

    public Teams(String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
    }

    public Teams(Long teamid, String name, String country, String city) {
        this.teamid = teamid;
        this.name = name;
        this.country = country;
        this.city = city;
    }

    public Long getTeamid() {
        return teamid;
    }

    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
