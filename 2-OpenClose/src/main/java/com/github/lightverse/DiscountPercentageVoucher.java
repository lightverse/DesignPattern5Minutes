package com.github.lightverse;

public class DiscountPercentageVoucher implements DiscountVoucher{

    private float discountPercentage;

    public DiscountPercentageVoucher(float percentage){
        this.discountPercentage = percentage;
    }

    @Override
    public float getDiscountPrice(float originPrice){
        return originPrice * discountPercentage;
    }

}
