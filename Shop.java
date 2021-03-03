package com.company;

public class Shop {
    protected String address, size;

    Shop(String adress, String size){
        this.address = adress;
        this.size = size;
    }

    public void get_info(){
        System.out.println("\nMieścimy się pod adresem: "+ address + " a zajmujemy: "+ size);
    } }