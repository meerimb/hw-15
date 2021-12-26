package com.company;

public class Programmer extends Person{
    String companyName;

    public Programmer(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println("Programmer likes coding.");

    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Programmer also likes eat a chocolate.");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Programmer likes to learn Java.");
    }
    @Override
    public String toString(){
        return
                "Programmer name:"+" "+getName()+
                ", Designation:"+" "+getDesignation()+
                ", Company Name:"+" "+companyName;
    }


}

