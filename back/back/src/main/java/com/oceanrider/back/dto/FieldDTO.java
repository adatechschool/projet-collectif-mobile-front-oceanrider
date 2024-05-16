package com.oceanrider.back.dto;

import java.util.List;

public class FieldDTO {
    public FieldDTO() {
        this.peakSurfSeasonEnds = peakSurfSeasonEnds;
        this.difficultyLevel = difficultyLevel;
        this.destination = destination;
        this.geocode = geocode;
        this.surfBreak = surfBreak;
        this.magicSeaweedLink = magicSeaweedLink;
        this.photos = photos;
        this.peakSurfSeasonBegins = peakSurfSeasonBegins;
        this.destinationStateCountry = destinationStateCountry;
        this.address = address;
    }

    private List<String> influencers;
    private String peakSurfSeasonEnds;
    private int difficultyLevel;
    private String destination;
    private String geocode;
    private List<String> surfBreak;
    private String magicSeaweedLink;
    private String photos;
    private String peakSurfSeasonBegins;
    private String destinationStateCountry;
    private String address;

    public List<String> getInfluencers() {
        return influencers;
    }

    public void setInfluencers(List<String> influencers) {
        this.influencers = influencers;
    }

    public String getPeakSurfSeasonEnds() {
        return peakSurfSeasonEnds;
    }

    public void setPeakSurfSeasonEnds(String peakSurfSeasonEnds) {
        this.peakSurfSeasonEnds = peakSurfSeasonEnds;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGeocode() {
        return geocode;
    }

    public void setGeocode(String geocode) {
        this.geocode = geocode;
    }

    public List<String> getSurfBreak() {
        return surfBreak;
    }

    public void setSurfBreak(List<String> surfBreak) {
        this.surfBreak = surfBreak;
    }

    public String getMagicSeaweedLink() {
        return magicSeaweedLink;
    }

    public void setMagicSeaweedLink(String magicSeaweedLink) {
        this.magicSeaweedLink = magicSeaweedLink;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public String getPeakSurfSeasonBegins() {
        return peakSurfSeasonBegins;
    }

    public void setPeakSurfSeasonBegins(String peakSurfSeasonBegins) {
        this.peakSurfSeasonBegins = peakSurfSeasonBegins;
    }

    public String getDestinationStateCountry() {
        return destinationStateCountry;
    }

    public void setDestinationStateCountry(String destinationStateCountry) {
        this.destinationStateCountry = destinationStateCountry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
