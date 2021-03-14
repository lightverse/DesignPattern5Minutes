package com.github.lightverse;

import java.util.Set;

public class Teacher {

    private Class aClass;

    public Teacher(Class aClass){
        this.aClass = aClass;
    }


    public void checkHomeWorkDone(){
        Set<Student> students = aClass.getStudents();
        for (Student student : students) {
            System.out.println(student.getName() + "'s homework is done ? " + student.isHomeWorkDone());
        }
    }
}
