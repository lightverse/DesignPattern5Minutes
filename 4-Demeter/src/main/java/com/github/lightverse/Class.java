package com.github.lightverse;

import java.util.HashSet;
import java.util.Set;

public class Class {

    private final Set<Student> studentSet = new HashSet<>();

    public void addStudent(Student student){
        studentSet.add(student);
    }

    public void removeStudent(Student student){
        studentSet.remove(student);
    }

    public Set<Student> getStudents() {
        return new HashSet<>(studentSet);
    }
}
