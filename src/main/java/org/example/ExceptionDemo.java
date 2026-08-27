package org.example;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入被除数：");
        int a = scanner.nextInt();
        System.out.print("请输入除数：");
        int b = scanner.nextInt();

        try {
            int result = divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获到异常：" + e.getMessage());
            System.out.println("除数不能为0！");
        } finally {
            System.out.println("计算结束（无论对错都执行）");
            scanner.close();
        }
    }

    // 除法：除数为0时主动抛异常
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }
}