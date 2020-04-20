package com.animalcrossing.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fish {
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
    private List<String > southSeason = new ArrayList<>();
    private String size;
    private String location;
    private String date;
    private String rarity;
    private Double price;

    public Fish() {
    }

    public Fish(String name, List<String> northSeason, List<String> southSeason, String size, String location, Double price, String date, String rarity) {
        this.name = name;
        this.northSeason = northSeason;
        this.southSeason = southSeason;
        this.size = size;
        this.location = location;
        this.price = price;
        this.date = date;
        this.rarity = rarity;
    }

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

    public String getDate() {
        return date;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
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
        return "Fish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", northSeason=" + northSeason +
                ", southSeason=" + southSeason +
                ", size='" + size + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}

