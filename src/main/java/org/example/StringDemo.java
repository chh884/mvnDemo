package org.example;

public class StringDemo {
    public static void main(String[] args) {
        String s = "  Hello, Java World  ";

        // 1. String 常用方法
        System.out.println("原字符串：[" + s + "]");
        System.out.println("长度：" + s.length());
        System.out.println("去空格：[" + s.trim() + "]");
        System.out.println("转大写：" + s.toUpperCase());
        System.out.println("包含Java吗：" + s.contains("Java"));
        System.out.println("Java的位置：" + s.indexOf("Java"));
        System.out.println("替换：" + s.replace("Java", "Python"));

        // 截取（先trim再去空格，再截前5个）
        String trimmed = s.trim();
        System.out.println("截取前5个：" + trimmed.substring(0, 5));

        // 2. 分割
        String[] parts = "张三,李四,王五".split(",");
        System.out.println("--- 分割结果 ---");
        for (String p : parts) {
            System.out.println(p);
        }

        // 3. == vs equals 的坑
        String a = "abc";
        String b = new String("abc");
        System.out.println("== 比较：" + (a == b));          // false（地址不同）
        System.out.println("equals 比较：" + a.equals(b));    // true（内容相同）

        // 4. StringBuilder 高效拼接（循环里用）
        System.out.println("--- StringBuilder 拼接 ---");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append("第").append(i).append("行 ");
        }
        System.out.println(sb.toString());
    }
}