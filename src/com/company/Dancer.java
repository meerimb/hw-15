package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("Dancer like dancing modern dance.");
    }
    @Override
    public void eat() {
        super.eat();

    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Dancer also likes to learn difficult languages.");
    }

    @Override
    public void walk() {
        super.walk();
    }
    @Override
    public String toString() {
        return "Dancer name:"+" "+getName()+
                ", Designation:"+" "+getDesignation()+
                ", Group Name:"+" "+groupName;
    }

    }



