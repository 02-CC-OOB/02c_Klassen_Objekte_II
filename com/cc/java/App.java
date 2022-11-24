package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Cat cat = new Cat("Grizabella","white",29, true);
        output(cat.getNamgetStringAttributes("#name"));
        output(cat.getNamgetStringAttributes("#color"));
        output(cat.getAge());


    
        output("------------------------");

        Cat cat1 = new Cat("Alonzo", "grey", 35, false);
        output(cat1.getNamgetStringAttributes("#name"));
        output(cat1.getNamgetStringAttributes("#color"));
        output(cat1.getAge());
    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

