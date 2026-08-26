package org.example;

public class Variables {
    public static void main(String[] args) {
        int age = 25;
        double height = 1.75;
        boolean isStudent = true;
        char gender = 'M';
        String name = "David-chan";

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);
        System.out.println("是学生吗：" + isStudent);
        System.out.println("性别：" + gender);

        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("整数除法：" + (10 / 3));       // 你猜？ 3
        System.out.println("小数除法：" + (10 / 3.0));      // 你猜？3.3333
        System.out.println("不加括号拼接：" + 10 + 3);       // 你猜？（最坑的一行）103
        System.out.println("加括号先算：" + (10 + 3));       // 你猜？13

    }
}