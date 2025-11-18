package com.hust.kstn.models;

public abstract class Disc extends Media {
    protected int length;
    protected String director;
    public Disc(String title, double cost, String category, int length, String director) {
        super(title, cost, category);
        this.length = length;
        this.director = director;
    }
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
    @Override
    public String toString() {
        return super.toString()
               + "\n Director: [" + director + "]"
               + "\n Length: [" + length + "s]";
    }
}