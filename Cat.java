package com.company;

public class Cat extends Animal{

    public Cat(String name, String color){
        super(name, color);
    }
    public void makeSound() {
        System.out.println("Kot o imieniu "+ name + " i sierścią " + color +" wydaje dzwiek miau miau");
    } }