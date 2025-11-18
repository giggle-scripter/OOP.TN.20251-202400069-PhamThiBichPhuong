package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        System.out.println("========== Empty Store ==========");
        store.print();
        
        System.out.println("\n========== Add DVD to store ==========");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
        
        store.addDVD(dvd1);
        store.print();
        
        System.out.println("\n========== Add DVDs to store ==========");
        store.addDVD(dvd2, dvd3);
        store.print();
        
        System.out.println("\n========== Remove DVD ==========");
        store.removeDVD(dvd2);
        store.print();
        
        System.out.println("\n========== Remove non-existance DVD ==========");
        DigitalVideoDisc dvdNotInStore = new DigitalVideoDisc("Not in Store", "Mystery", "Unknown", 100, 30.00);
        store.removeDVD(dvdNotInStore);
        store.print();
        
        System.out.println("\n========== Remove DVD in an empty store ==========");
        Store emptyStore = new Store();
        emptyStore.removeDVD(dvd1);
        emptyStore.print();
     
        System.out.println("\n========== Add DVD til full ==========");
        Store bigStore = new Store();
        for (int i = 1; i <= 100; i++) {
            DigitalVideoDisc dvd = new DigitalVideoDisc(
                "Movie " + i, 
                "Category " + (i % 5), 
                "Director " + (i % 10), 
                90 + (i % 30), 
                10.0 + (i % 20)
            );
            bigStore.addDVD(dvd);
        }
        System.out.println("DVD quantity: " + bigStore.getQtyInStore());
        
        System.out.println("\n========== Add DVD when store is full ==========");
        DigitalVideoDisc dvd101 = new DigitalVideoDisc("Movie 101", "Comedy", "Director C", 95, 18.0);
        bigStore.addDVD(dvd101);
        
        System.out.println("\n========== Remove null ==========");
        store.removeDVD(null);
    }
}