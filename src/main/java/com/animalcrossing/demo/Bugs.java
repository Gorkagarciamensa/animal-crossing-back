package com.animalcrossing.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

@Entity
public class Bugs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String name;
    @ElementCollection
    @JoinColumn (name="northSeason")
    private List<String > northSeason = new ArrayList<>();
    @ElementCollection
    @JoinColumn (name="southSeason")
    private List<String> southSeason = new ArrayList<>();
    private String time;
    private String rarity;
    private String location;
    private Double price;

    public Bugs() {
    }
//constructor
    public Bugs(String name, List<String> northSeason, List<String> southSeason, String location, String rarity, Double price, String time) {
        this.name = name;
        this.northSeason = northSeason;
        this.southSeason = southSeason;
        this.time  = time;
        this.location = location;
        this.price = price;
        this.rarity = rarity;
    }
 //getters && setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNorthSeason() {
        return northSeason;
    }

    public void setNorthSeason(List<String> northSeason) {
        this.northSeason = northSeason;
    }

    public List<String> getSouthSeason() {
        return southSeason;
    }

    public void setSouthSeason(List<String> southSeason) {
        this.southSeason = southSeason;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea() {
        return location;
    }

    public void setArea(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bugs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", northSeason=" + northSeason +

                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
