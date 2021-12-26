package com.company;

public class Main {

    public static void main(String[] args) {
	Person person=new Person();
        person.setName("Audrey");
        person.setDesignation("Artist");
        person.learn();
        person.eat();
        person.walk();
        System.out.println(person);
        System.out.println();

        Programmer programmer=new Programmer();
        programmer.setCompanyName("App Brewery");
        programmer.setName("Angela Yu");
        programmer.setDesignation("Programmer");
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println(programmer);
        System.out.println();

        Dancer dancer=new Dancer();
        dancer.setName("Diana");
        dancer.setDesignation("Dancer");
        dancer.setGroupName("WE8");
        dancer.dancing();
        dancer.eat();
        dancer.walk();
        dancer.learn();
        System.out.println(dancer);
        System.out.println();

        Singer singer=new Singer();
        singer.setName("Adam");
        singer.setDesignation("Singer");
        singer.setBandName("Maroon 5");
        singer.singing();
        singer.playGuitar();
        singer.eat();
        singer.walk();
        singer.learn();
        System.out.println(singer);
    }
}
