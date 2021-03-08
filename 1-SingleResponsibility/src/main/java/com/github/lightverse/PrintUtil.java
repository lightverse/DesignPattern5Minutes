package com.github.lightverse;

public class PrintUtil {

    public static void printUserInfo(User user){
        System.out.println("Name:"+ user.getName() +"\nPhone Number:"+user.getPhoneNumber());
    }

    public static void printUserNameAndAge(User user){
        System.out.println("Name:"+ user.getName() +"\nAge:"+user.getAge());
    }
}
