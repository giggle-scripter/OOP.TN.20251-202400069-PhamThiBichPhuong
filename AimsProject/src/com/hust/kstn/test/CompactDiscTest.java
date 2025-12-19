package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track track1 = new Track("Bohemian Rhapsody", 355); 
        Track track2 = new Track("Don't Stop Me Now", 209); 
        Track track3 = new Track("Another One Bites the Dust", 215); 
        CompactDisc queenGreatestHits = new CompactDisc(
            "Greatest Hits", 
            "Rock", 
            "Roy Thomas Baker", 
            "Queen", 
            22.99
        );
        System.out.println("===== CD Info =====");
        System.out.println(queenGreatestHits);
        
        System.out.println("===== Add track =====");
        queenGreatestHits.addTrack(track1);
        queenGreatestHits.addTrack(track2);
        
        System.out.println("===== Add added track =====");
        queenGreatestHits.addTrack(track1); 
        
        System.out.println("===== CD Info after adding tracks =====");
        System.out.println(queenGreatestHits);
        
        System.out.println("===== Remove track =====");
        queenGreatestHits.removeTrack(track2);
        
        System.out.println("===== Remove non-existance track =====");
        queenGreatestHits.removeTrack(track3);

        System.out.println("===== CD Info after removing track =====");
        System.out.println(queenGreatestHits);
    }
}