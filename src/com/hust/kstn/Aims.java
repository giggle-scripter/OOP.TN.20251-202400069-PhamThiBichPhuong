package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
    	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Jungle Book (2016)", "Adventure", "Jon Favreau", 106, 22.99);
    	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Wolfgang Reitherman", "Animation", "The Jungle Book (1967)", 15.99);
    	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 21.50);
    	DigitalVideoDisc dvd4 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 21.50);
    	DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King");
    	DigitalVideoDisc dvd6 = new DigitalVideoDisc("Animation", "Aladdin", 18.99);
    	DigitalVideoDisc dvd7 = new DigitalVideoDisc("Unknown","test","Director",0,10.00);
        Cart cart = new Cart();
        //add&remove
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);
        cart.addDVD(dvd4);
        cart.addDVD(dvd5);
        cart.addDVD(dvd7);
        cart.print();
        cart.removeDVD(dvd6);
        cart.print();
        cart.addDVD(dvd6);
        cart.print();
        cart.removeDVD(dvd5);
        cart.removeDVD(dvd7);
        cart.print();
        //sort
        System.out.println("+Sort cart by cost");
        cart.sortByCost();
        cart.print();
        System.out.println("+Sort cart by title");
        cart.sortByTitle();
        cart.print();
        //calculate total cost
        System.out.println("+Total cost: "+cart.calculateTotalCost());
        //search
        System.out.print("+Searching by ID 'DVD001': ");
        cart.searchByID("DVD001"); 
        System.out.print("+Searching by title 'Aladdin': ");
        cart.searchByTitle("Aladdin"); 
        System.out.print("+Searching by title 'Titanic': ");
        cart.searchByTitle("Titanic"); 
        //random gift
        DigitalVideoDisc gift = cart.getFreeGift();
        if(gift != null) {
            System.out.println("You receive " + gift.getTitle() +" for free");
        }
        //play
        System.out.println("+Play demo");
        dvd1.play();
        dvd7.play(); 

    }
}
