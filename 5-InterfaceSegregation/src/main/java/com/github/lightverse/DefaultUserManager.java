package com.github.lightverse;

import java.util.ArrayList;
import java.util.List;

public class DefaultUserManager implements UserManager,UserInfoManager,UserPrinter {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void printUser(User user) {
        System.out.print("userinfo:"+user);
    }
}
