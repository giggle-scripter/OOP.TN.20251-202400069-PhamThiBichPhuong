package com.hust.kstn.models;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsInCart[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; 
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully");
        } else {
            System.out.println("The cart is almost full. Cannot add more discs");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Cannot remove discs");
            return;
        }
        int foundIndex = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i].equals(disc)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for (int i = foundIndex; i < qtyOrdered - 1; i++) {
                itemsInCart[i] = itemsInCart[i + 1];
            }
            itemsInCart[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed successfully");
        } else {
            System.out.println("The disc does not exist in the cart");
        }
    }
    public double calculateTotalCost() {
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsInCart[i].getCost();
        }
        return total;
    }
    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc item = itemsInCart[i];
            System.out.println("[Title]: " + item.getTitle() + ", " + "[Cost]: " + item.getCost());
        }

    }
    public void searchByID(String id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i].getId().equals(id)) {
                System.out.println("Found DVD: " + itemsInCart[i].getTitle());
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Not found in cart");
        }
    }
    public void searchByTitle(String title) {
    	 boolean found = false;
         for (int i = 0; i < qtyOrdered; i++) {
             if (itemsInCart[i].getTitle().equals(title)) {
                 System.out.println("Found DVD: " + itemsInCart[i].getTitle());
                 found = true;
                 break; 
             }
         }
         if (!found) {
             System.out.println("Not found in cart");
         }
    }
    public DigitalVideoDisc getFreeGift() {
        if (qtyOrdered == 0) {
            return null;
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(qtyOrdered);
        return itemsInCart[randomIndex];
    }
    public void sortByTitle() {
        Arrays.sort(itemsInCart, 0, qtyOrdered, 
            Comparator.comparing(DigitalVideoDisc::getTitle).thenComparing(DigitalVideoDisc::getCost, Comparator.reverseOrder())
        );
    }
    public void sortByCost() {
         Arrays.sort(itemsInCart, 0, qtyOrdered, 
            Comparator.comparing(DigitalVideoDisc::getCost).reversed().thenComparing(DigitalVideoDisc::getTitle));
    }
}
