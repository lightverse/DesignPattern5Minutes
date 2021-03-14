package com.github.lightverse;

public class Main {

    //需求：老师亲自统计班里面同学的作业完成情况
    public static void main(String[] args) {
        Class class1 = new Class();

        Student xiaoMing = new Student("xiao ming",1);
        Student xiaoHong = new Student("xiao hong",2);
        Student xiaoHuang = new Student("xiao huang",2);
        Monitor zhaoHua = new Monitor("zhao hua",3,class1);

        class1.addStudent(xiaoMing);
        class1.addStudent(xiaoHong);
        class1.addStudent(xiaoHuang);
        class1.addStudent(zhaoHua);

        xiaoMing.setHomeWorkDone(true);
        xiaoHong.setHomeWorkDone(false);
        xiaoHuang.setHomeWorkDone(false);
        zhaoHua.setHomeWorkDone(true);

        Teacher teacher = new Teacher(class1);
        teacher.checkHomeWorkDone();
    }
}
