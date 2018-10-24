package com.nargilabars.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "nargila_bars")
public class NargilaBar {
    @Id
    @Column(name = "id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "adress")
    String adress;

    @Column(name = "rating")
    Double rating;

    @Column(name = "number_of_guests")
    Long numberOfGuests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Long getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Long numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
