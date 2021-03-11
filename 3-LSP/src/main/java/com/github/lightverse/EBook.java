package com.github.lightverse;

public class EBook extends Book{

    private int size;

    public EBook(int price, int page,int size) {
        super(price, page);
        this.size = size;
    }

    public int getSize(){
        return size;
    }


}
