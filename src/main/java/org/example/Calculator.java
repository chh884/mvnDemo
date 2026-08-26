package org.example;

public class Calculator {

    // 加法（int 版）
    public static int add(int a, int b) {
        return a + b;
    }

    // 加法（double 版）—— 方法重载，同名不同参数
    public static double add(double a, double b) {
        return a + b;
    }

    // 减法
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 乘法
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 除法—— 注意！用 (double) 强转，避免整数除法坑
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    // 主程序：测试所有方法
    public static void main(String[] args) {
        System.out.println("10 + 3 = " + add(10, 3));          // 调 int 版
        System.out.println("10.5 + 3.2 = " + add(10.5, 3.2));    // 调 double 版（重载）
        System.out.println("10 - 3 = " + subtract(10, 3));
        System.out.println("10 * 3 = " + multiply(10, 3));
        System.out.println("10 / 3 = " + divide(10, 3));         // 用 double 避免 3.33 坑
    }
}