package com.github.lightverse;

public class Monitor extends Student{

    private Class myClass;

    public Monitor(String name,int id, Class clazz) {
        super(name,id);
        myClass = clazz;
    }

    public Class getMyClass() {
        return myClass;
    }
//
//    public void checkHomeWorkDone(){
//        Class myClass = getMyClass();
//        for (Student student : myClass.getStudents()) {
//            System.out.println(student.getName() + "'s homework is done ? " + student.isHomeWorkDone());
//        }
//    }
}
