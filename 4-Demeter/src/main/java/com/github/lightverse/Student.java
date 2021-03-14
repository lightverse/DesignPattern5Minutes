package com.github.lightverse;

public class Student {

    private String name;

    private boolean homeWorkDone = false;
    private int id;
    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void setHomeWorkDone(boolean isDone){
        homeWorkDone = isDone;
    }

    public boolean isHomeWorkDone() {
        return homeWorkDone;
    }

    public String getName() {
        return name;
    }
}
