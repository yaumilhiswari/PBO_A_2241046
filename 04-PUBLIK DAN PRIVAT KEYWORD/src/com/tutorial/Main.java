package com.tutorial;

class player {
    // Data Member
    String name; //default bisa dibaca ditulis diluar class
    public int exp; //public, bisa dibaca dan ditulis diluar class
    private int health; //private, hanya dibaca oleh class

    //konstruktor
    player (String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;

    }

    void display(){
        System.out.println("hero 1 :" +this.name);
        System.out.println("hero health :" +this.health);
        System.out.println("hero exp :" +this.exp);
        
    }
}
public class Main {
    public static void main(String[] args) {
        player hero = new player("emil", 88, 99);
        hero.display();
        hero.name = "tiara";
        System.out.println(hero.name);

        hero.exp = 25;
        System.out.println(hero.exp);

    }
}