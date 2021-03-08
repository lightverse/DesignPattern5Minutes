package com.github.lightverse;

public class Order {

    private float amount;//总价

    private DiscountVoucher discountVoucher;//折扣券

    public Order(float price){
        amount = price;
    }


    public void setDiscountVoucher(DiscountVoucher discountVoucher){
        this.discountVoucher = discountVoucher;
    }


    public void submit(){
        System.out.print("订单提交，商品总价"+amount);
        if(discountVoucher != null){
            System.out.print(",折扣价"+ discountVoucher.getDiscountPrice(amount));
        }else{
            System.out.print(",无折扣");
        }
    }
}
