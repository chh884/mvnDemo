package org.example;

public class ScoreStats {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88, 73, 90};

        // 1. 打印所有成绩（用普通 for + 下标）
        System.out.print("所有成绩：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        // 2. 求总分
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("总分：" + sum);

        // 3. 平均分（用 double 避免整数除法坑）
        double avg = (double) sum / scores.length;
        System.out.println("平均分：" + avg);

        // 4. 最高分
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("最高分：" + max);

        // 5. 用 for-each 再求一次和（对比写法）
        int sum2 = 0;
        for (int s : scores) {
            sum2 += s;
        }
        System.out.println("for-each 求和：" + sum2);
    }
}