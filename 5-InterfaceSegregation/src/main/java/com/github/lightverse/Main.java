package com.github.lightverse;

public class Main {

    public static void main(String[] args) {
        User xiaoming = new User("xiaoming","1228888888");
        User xiaohong = new User("xiaohong","1227777777");

        DefaultUserManager userManager = new DefaultUserManager();
        userManager.addUser(xiaoming);
        userManager.addUser(xiaohong);

        printUserInfo(userManager,userManager,"xiaohong");

    }



    public static void printUserInfo(UserInfoManager userManager,UserPrinter userPrinter,String userName){
        User xiaohong = userManager.getUserByName("xiaohong");
        if(xiaohong != null){
            userPrinter.printUser(xiaohong);
        }else{
            System.out.println("没有找到user:"+userName);
        }
    }
}
