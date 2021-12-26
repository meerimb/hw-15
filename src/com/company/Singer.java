package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(){
    }
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("Singer likes sing the soul music.");
    }
    public void playGuitar(){
        System.out.println("Singer likes to play the Guitar");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Singer also likes to learn dance.");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public String toString(){
        return "Singer name:"+" "+getName()+
                ", Designation:"+" "+getDesignation()+
                ", Band Name:"+" "+bandName;
    }

}
