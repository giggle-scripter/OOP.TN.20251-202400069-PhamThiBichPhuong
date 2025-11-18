package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\\\Users\\\\bpscm\\\\eclipse-workspace\\\\OtherProject\\\\src\\\\com\\\\hust\\\\kstn\\\\garbage\\\\text";
        
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();
        
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
        
        String outputString = outputStringBuilder.toString();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
    }
}