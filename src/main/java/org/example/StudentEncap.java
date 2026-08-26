package org.example;

public class StudentEncap {
    // private 私有属性—— 外部不能直接访问
    private String name;
    private int age;
    private double score;

    // 构造方法：通过 setter 完成赋值（统一走校验）
    public StudentEncap(String name, int age, double score) {
        setName(name);
        setAge(age);
        setScore(score);
    }

    // getter：读取
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getScore() { return score; }

    // setter：设置，带校验
    public void setName(String name) { this.name = name; }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("⚠️ 年龄不合理：" + age + "，保持原值");
            return;
        }
        this.age = age;
    }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("⚠️ 成绩不合理：" + score + "，必须在0-100，保持原值");
            return;
        }
        this.score = score;
    }

    public void introduce() {
        System.out.println("我叫" + name + "，今年" + age + "岁，成绩" + score);
    }

    public static void main(String[] args) {
        // 1. 正常创建
        StudentEncap s1 = new StudentEncap("张三", 20, 85.5);
        s1.introduce();

        // 2. 试图设非法值—— 校验会拦截
        s1.setScore(-10);      // 成绩不合理，保持 85.5
        s1.setAge(200);        // 年龄不合理，保持 20
        s1.introduce();        // 还是原来的值

        // 3. 用 setter 正常修改
        s1.setScore(90);       // 合法，改为 90
        s1.introduce();        // 成绩 90

        // 4. 用 getter 读取
        System.out.println("用getter读名字：" + s1.getName());
        System.out.println("用getter读成绩：" + s1.getScore());

        // 5. 如果取消下面这行的注释，会编译报错（因为 score 是 private）
        // s1.score = 50;     // ❌ 错误：score 在 StudentEncap 中是 private 访问权限
    }
}