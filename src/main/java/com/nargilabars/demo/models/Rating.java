package com.nargilabars.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "user_id")
    Long userID;

    @Column(name = "nargilabar_id")
    Long nargilaBarId;

    @Column(name = "ocjena")
    Double ocjena;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getNargilaBarId() {
        return nargilaBarId;
    }

    public void setNargilaBarId(Long nargilaBarId) {
        this.nargilaBarId = nargilaBarId;
    }

    public Double getOcjena() {
        return ocjena;
    }

    public void setOcjena(Double ocjena) {
        this.ocjena = ocjena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
