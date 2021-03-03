package com.company;

public class Bakery extends Shop{
    private String[] products = {"Pasztecik", "Bułka czosnkowa", "Pasztecik premium"};

    Bakery(String adress, String size) {

        super(adress, size);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Przykładowe wypieki: ");
        for (String rzeczy:products){
            System.out.println(rzeczy);
        } } }