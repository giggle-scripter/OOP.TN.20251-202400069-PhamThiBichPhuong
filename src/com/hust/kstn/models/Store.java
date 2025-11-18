package com.hust.kstn.models;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot add null DVD to store");
            return;
        }
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("DVD has been added to store successfully");
        } else {
            System.out.println("Store is full. Cannot add more");
        }
    }
    public void addDVD(DigitalVideoDisc... discs) {
        if (qtyInStore + discs.length <= MAX_ITEMS_IN_STORE) {
            for (DigitalVideoDisc disc : discs) {
                addDVD(disc);
            }
        } else {
            System.out.println("Store does not have enough space. Cannot add more");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot remove null DVD from store");
            return;
        }
        
        if (qtyInStore == 0) {
            System.out.println("Store is empty. Cannot remove DVD");
            return;
        }
        int foundIndex = -1;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for (int i = foundIndex; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyInStore - 1] = null;
            qtyInStore--;
            System.out.println("DVD has been removed from store successfully");
        } else {
            System.out.println("DVD does not exist in store");
        }
    }
    public void print() {
        System.out.println("======================= STORE INVENTORY =======================");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Total DVDs in store: " + qtyInStore);
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("===============================================================");
    }
    public int getQtyInStore() {
        return qtyInStore;
    }
}