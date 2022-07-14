package org.itmo.java.lesson12.strategy;

public class Reading implements Activity{
    @Override
    public void work() {
        System.out.println("Reading...");
    }
}
