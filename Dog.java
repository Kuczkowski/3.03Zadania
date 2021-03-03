package com.company;

public class Dog extends Animal{

    public Dog(String name, String color){
        super(name, color);
    }
    public void makeSound() {
        System.out.println("Pies o imieniu "+name + " i sierśćią " + color +" wydaje dzwiek hau hau");
    } }