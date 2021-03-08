package com.github.lightverse;

public class DiscountPriceVoucher implements DiscountVoucher{

    private int discount;

    public DiscountPriceVoucher(int discount) {
        this.discount = discount;
    }

    @Override
    public float getDiscountPrice(float price) {
        return Math.max(0, price - discount);
    }
}
