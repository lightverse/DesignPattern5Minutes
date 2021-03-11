package com.github.lightverse;

public abstract class Book {

    private int price;

    private int page;


    public Book(int price, int page) {
        this.price = price;
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public int getPage() {
        return page;
    }
}
