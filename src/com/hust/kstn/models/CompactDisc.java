package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, String director, String artist, double cost) {
        super(title, cost, category, 0, director);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

    public List<Track> getTracks() { 
        return tracks;
    }
    
    public int totalLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    @Override
    public int getLength() {
    	return this.totalLength();
    }
    
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + getId() + "][" + getTitle() + "][" + getCategory() + "][" + getDirector() + "][" + artist + "]" + "[" + getCost() + "]\n");
        sb.append("Total Length: " + getLength() + "s\n");
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