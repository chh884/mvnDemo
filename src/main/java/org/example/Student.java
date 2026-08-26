package org.example;

public class Student {
    // 属性（成员变量）
    String name;
    int age;
    double score;

    // 构造方法：创建对象时初始化
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 实例方法（没 static）—— 自我介绍
    public void introduce() {
        System.out.println("我叫" + name + "，今年" + age + "岁，成绩" + score);
    }

    // 实例方法 —— 学习，成绩+1
    public void study() {
        System.out.println(name + " 正在学习...");
        score += 1;
        System.out.println("  学习后成绩变成：" + score);
    }

    // main：造对象、测试
    public static void main(String[] args) {
        // 造两个学生对象，各自独立
        Student s1 = new Student("张三", 20, 85.5);
        Student s2 = new Student("李四", 21, 92.0);

        // 各自介绍（看，两个对象的属性互不干扰）
        s1.introduce();
        s2.introduce();

        // 张三学习一次，看成绩变化
        s1.study();
        s1.introduce();   // 再介绍一次，成绩应该变成 86.5

        // 李四没学习，成绩不变
        s2.introduce();
    }
}