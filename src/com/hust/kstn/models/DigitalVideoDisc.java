package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, cost, category, length, director);
    }
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this(title, category, director, 0, cost);
    }
    
    public DigitalVideoDisc(String category, String title, double cost) {
        this(title, category, null, 0, cost);
    }
    
    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0); 
    }

    public void play() {
        if (getLength() > 0) {
            System.out.println("Playing DVD: " + getTitle());
        } else {
            System.out.println("Cannot play DVD: " + getTitle() + ", it has no length.");
        }
    }
    
    @Override
    public String toString() {
        return "DVD: " + super.toString();
    }
}