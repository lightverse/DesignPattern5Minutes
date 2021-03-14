package com.github.lightverse;

public interface UserManager {

    void addUser(User user);

    void removeUser(User user);

    User getUserByName(String name);

    void printUser(User user);
}
