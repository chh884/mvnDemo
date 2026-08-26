package org.example;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        // 1. 生成一个 1-100 的随机答案
        Random random = new Random();
        int answer = random.nextInt(100) + 1;

        // 2. 准备读键盘输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎯 猜数字游戏！我心里想了一个 1-100 的数，你来猜：");

        // 3. while(true) 无限循环，猜对了用 break 跳出
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = scanner.nextInt();   // 读你输入的整数

            if (guess == answer) {
                System.out.println("🎉 恭喜！猜对了！答案就是 " + answer);
                break;                       // 猜对了，跳出循环
            } else if (guess < answer) {
                System.out.println("猜小了，往大了猜！");
            } else {
                System.out.println("猜大了，往小了猜！");
            }
        }

        scanner.close();   // 用完关掉（好习惯）
    }
}