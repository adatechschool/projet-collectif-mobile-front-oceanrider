package com.oceanrider.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "surf_spots", schema = "public")
public class SurfSpot {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationStateCountry() {
        return destinationStateCountry;
    }

    public void setDestinationStateCountry(String destinationStateCountry) {
        this.destinationStateCountry = destinationStateCountry;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getSurfBreak() {
        return surfBreak;
    }

    public void setSurfBreak(String surfBreak) {
        this.surfBreak = surfBreak;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public String getMagicSeaweedLink() {
        return magicSeaweedLink;
    }

    public void setMagicSeaweedLink(String magicSeaweedLink) {
        this.magicSeaweedLink = magicSeaweedLink;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGeocode() {
        return geocode;
    }

    public void setGeocode(String geocode) {
        this.geocode = geocode;
    }

    public String getPeakSurfSeasonBegins() {
        return peakSurfSeasonBegins;
    }

    public void setPeakSurfSeasonBegins(String peakSurfSeasonBegins) {
        this.peakSurfSeasonBegins = peakSurfSeasonBegins;
    }

    public String getPeakSurfSeasonEnds() {
        return peakSurfSeasonEnds;
    }

    public void setPeakSurfSeasonEnds(String peakSurfSeasonEnds) {
        this.peakSurfSeasonEnds = peakSurfSeasonEnds;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "destination")
    private String destination;

    @Column(name = "destination_state_country")
    private String destinationStateCountry;

    @Column(name = "difficulty_level")
    private String difficultyLevel;

    @Column(name = "surf_break")
    private String surfBreak;

    @Column(name = "photos")
    private String photos;

    @Column(name = "magic_seaweed_link")
    private String magicSeaweedLink;

    @Column(name = "address")
    private String address;

    @Column(name = "geocode")
    private String geocode;

    @Column(name = "peak_surf_season_begins")
    private String peakSurfSeasonBegins;

    @Column(name = "peak_surf_season_ends")
    private String peakSurfSeasonEnds;

}
