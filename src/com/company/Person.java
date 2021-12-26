package com.company;

public class Person {
    private String name;
    private String designation;

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    
    public void learn(){
        System.out.println(getDesignation()+" really likes to learn.");
    }
    public void eat(){
        System.out.println(getDesignation()+" likes eat an ice-cream so much.");
    }
    public void walk(){
        System.out.println(getDesignation()+" likes walk in the park too much.");
    }
    @Override
    public String toString(){
        return "Person{" +
                "name='"+name+'\''+
                ",designation="+designation+
                '}';
    }


}
