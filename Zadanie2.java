package com.company;

public class Zadanie2 {
    public static void main(String[] args){
{
    Shop shop = new Shop("Jasna Góra 4","50x50m^2");
    shop.get_info();

    Bookshop ksiazki = new Bookshop("Zimna 2","60x90m^2");
    ksiazki.get_info();

    Bakery piec = new Bakery("Lidlowska 0","100x100m^2");
    piec.get_info();
} } }