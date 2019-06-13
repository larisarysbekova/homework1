package com.company;

public class Warrior implements  Applyable {
    @Override
    public void apply() {
        System.out.println( "Воин атакавал: " + "Physical");
    }
}

