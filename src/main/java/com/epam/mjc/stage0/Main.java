package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Bird myBird = new Bird();

        System.out.println("Dog: " + myDog.getDescription());
        System.out.println("Bird: " + myBird.getDescription());
    }
}
