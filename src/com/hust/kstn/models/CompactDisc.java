package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private String artist;
    private double cost;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, String director, String artist, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.artist = artist;
        this.cost = cost;
        nbCompactDiscs++;
        this.id = nbCompactDiscs;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getCategory() {return category;}
    public String getDirector() {return director;}
    public double getCost() { return cost; }
    public List<Track> getTracks() { return tracks; }
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the CD. Cannot add.");
        } else {
            tracks.add(track);
            System.out.println("Track has been added to the CD.");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track has been removed.");
        } else {
            System.out.println("Track does not exist in the CD. Cannot remove.");
        }
    }
    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CD[" + id + "][" + title + "][" + category + "][" + artist + "]: " + cost + "$\n");
        sb.append("Director: " + director + "\n"); 
        sb.append("Total Length: " + totalLength() + "s\n");
        sb.append("Tracks:\n");
        if (tracks.isEmpty()) {
            sb.append("\tNo tracks yet.\n");
        } else {
            for (int i = 0; i < tracks.size(); i++) {
                sb.append("\t" + (i + 1) + ". Title: " + tracks.get(i).getTitle() 
                          + ", Length: " + tracks.get(i).getLength() + "s\n");
            }
        }
        return sb.toString();
    }
}