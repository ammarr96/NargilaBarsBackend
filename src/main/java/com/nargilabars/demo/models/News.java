package com.nargilabars.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "naslov")
    String naslov;

    @Column(name = "preview_text")
    String previewText;

    @Column(name = "text")
    String text;

    @Column(name = "nargilabar_id")
    Integer nargilabarId;

    @Column(name = "image_url")
    String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getPreviewText() {
        return previewText;
    }

    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNargilabarId() {
        return nargilabarId;
    }

    public void setNargilabarId(Integer nargilabarId) {
        this.nargilabarId = nargilabarId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
