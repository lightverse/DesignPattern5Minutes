package com.github.lightverse;

public class PrintedBook extends Book{

    private int weight;
    public PrintedBook(int price, int page,int weight) {
        super(price, page);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
