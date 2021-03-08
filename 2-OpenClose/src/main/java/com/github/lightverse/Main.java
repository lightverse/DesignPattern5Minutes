package com.github.lightverse;

public class Main {


    public static void main(String[] args) {
        Order order = new Order(300);//新增订单
        order.setDiscountVoucher(new DiscountPercentageVoucher(0.8f));//订单设置折扣券
        order.setDiscountVoucher(new DiscountPriceVoucher(30));
        order.submit();//提交订单 打印订单信息
    }
}
