package com.company;

public class Bookshop extends Shop{
    private String[] products = {"Zostań kucharzem niczym Ramsay",
    "O psie co zawinął kumpla", "Chłopcy z placu broni"};

    Bookshop(String address, String size) {
        super(address, size);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Wybór książek: ");
        for (String rzeczy:products){
            System.out.println(rzeczy);
        } } }