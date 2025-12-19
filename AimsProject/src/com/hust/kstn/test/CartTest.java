package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        
        System.out.println("========== Empty cart ==========");
        cart.print();
        
        System.out.println("\n========== Add DVD ==========");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
     
        cart.addDVD(dvd1);
        cart.print();
        
        System.out.println("\n========== Add list of DVDs ==========");
        cart.addDVD(dvd2, dvd3);
        cart.print();
        
        System.out.println("\n========== Remove DVD ==========");
        cart.removeDVD(dvd2);
        cart.print();
        cart.addDVD(dvd2);
        
        System.out.println("\n========== Add DVDs til full ==========");
        for (int i = 4; i <= 20; i++) {
            DigitalVideoDisc dvd = new DigitalVideoDisc("DVD " + i, "Category " + i, "Director " + i, 90, 15.99);
            cart.addDVD(dvd);
        }
        cart.print();
        
        System.out.println("\n========== Add DVD when cart is full ==========");
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("DVD 21", "Action", "Director 21", 120, 25.99);
        cart.addDVD(dvd21);
        cart.print();
        
        System.out.println("\n========== Add DVDs when cart is full ==========");
        DigitalVideoDisc dvd22 = new DigitalVideoDisc("DVD 22", "Drama", "Director 22", 100, 20.99);
        DigitalVideoDisc dvd23 = new DigitalVideoDisc("DVD 23", "Comedy", "Director 23", 95, 18.99);
        cart.addDVD(dvd22, dvd23);
        
        System.out.println("\n========== Clear all DVDs out of cart ==========");
        cart.clearCart();
        cart.print();
        
        Cart emptyCart = new Cart();
        emptyCart.addDVD(dvd1);
        emptyCart.removeDVD(dvd1);
        emptyCart.print();
        
        System.out.println("\n========== Remove DVD when cart is empty ==========");
        emptyCart.removeDVD(dvd2);
        emptyCart.print();
        
        System.out.println("\n========== Remove DVD that did not exist in the cart ==========");
        Cart cart2 = new Cart();
        cart2.addDVD(dvd1);
        cart2.print();
        
        DigitalVideoDisc dvdNotInCart = new DigitalVideoDisc("Not in Cart", "Mystery", "Unknown", 100, 30.00);
        cart2.removeDVD(dvdNotInCart);
        cart2.print();
        
        System.out.println("\n========== Search DVDs ==========");
        Cart cart3 = new Cart();
        cart3.addDVD(dvd1, dvd2, dvd3);
        cart3.print();
        
        System.out.println("\n Search by ID (ID = 1):");
        cart3.searchByID(1);
        
        System.out.println("\nSearch by title (Title = 'Star Wars'):");
        cart3.searchByTitle("Star Wars");
        
        System.out.println("\n Search non-existance ID (ID = 999):");
        cart3.searchByID(999);
        
        System.out.println("\n========== Sort the cart ==========");
        System.out.println("\n Before sorting:");
        cart3.print();
        
        System.out.println("\n After sort by title:");
        cart3.sortByTitle();
        cart3.print();
        
        System.out.println("\n After sort by cost:");
        cart3.sortByCost();
        cart3.print();
        
        System.out.println("\n========== Receive random gift ==========");
        DigitalVideoDisc freeGift = cart3.getFreeGift();
        if (freeGift != null) {
            System.out.println("Free gift: " + freeGift.toString());
        }
    }
}