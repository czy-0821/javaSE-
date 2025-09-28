package com.itheima.HomeWork.homeWork01;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", '男', 17,
                "中华人民共和国", "杭州电子科技大学", "2021213021");
        Worker worker = new Worker("李四", '男', 32,
                "中华人民共和国", "中国建筑集团", 10);
        StudentLeader studentLeader = new StudentLeader("赵敏", '女', 20,
                "中华人民共和国", "浙江大学", "2020203029", "学生会会长");


        student.work();
        worker.work();
        studentLeader.meeting();

    }
}
