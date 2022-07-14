package org.itmo.java.lesson12.strategy;

public class Sleeping implements Activity{
    @Override
    public void work() {
        System.out.println("Sleeping...");
    }
}
