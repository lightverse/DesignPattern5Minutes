package com.github.lightverse;

public class Main {


    public static void main(String[] args) {
        User user = new User("lightverse","88888888");
        user.setAge(12);
        user.setAddress("北京");
        PrintUtil.printUserInfo(user);
    }
}
