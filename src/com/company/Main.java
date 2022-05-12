package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Programmer programmer = new Programmer("Isa", "Bekend", "Google");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println();

        Dancer dancer = new Dancer("Dastan", "teacher","Aralai");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println();

        Singer singer = new Singer("Atana","sing and play the gitar", "Kutalka");
        System.out.println(singer);
        singer.sing();
        singer.playgitar();
        singer.eat();
        singer.learn();
        singer.walk();
    }
}
