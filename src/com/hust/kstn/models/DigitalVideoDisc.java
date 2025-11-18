package com.hust.kstn.models;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private double weight;
	private int id;
    public int getId() {
    	return id;
    }
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public double getWeight() {
		return weight;
	}
	public DigitalVideoDisc(String title) {
	    this.title = title;
	    nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String category, String title, double cost) {
	    this.category = category;
	    this.title = title;
	    this.cost = cost;
	    nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String director, String category, String title, double cost) {
	    this.director = director;
	    this.category = category;
	    this.title = title;
	    this.cost = cost;
	    nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
	    this.title = title;
	    this.category = category;
	    this.director = director;
	    this.length = length;
	    this.cost = cost;
	    nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public void play() {
		if (this.length > 0) {
			System.out.println("Playing: "+ this.getTitle());
		}else {
			System.out.println("Cannot play: "+this.getTitle()+" has no length");
		}
	}
	@Override
	public String toString() {
	    return "DVD[" + this.id + "] – [" + this.title + "] – [" + this.cost + "] – [" + 
	           this.length + "] – [" + this.category + "] – [" + this.director + "]";
	}
}