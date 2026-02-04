package org.itmo.lesson11.factory;

public class CsvConverter implements DocumentConverter {
    @Override
    public void convertFile() {
        System.out.println("Converting to csv...");
    }
}
