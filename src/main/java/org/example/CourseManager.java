package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CourseManager {
    public static void main(String[] args) {
        // 1. ArrayList 管理选课名单（List 允许重复）
        List<String> students = new ArrayList<>();
        students.add("张三");
        students.add("李四");
        students.add("王五");
        students.add("张三");      // 故意重复添加

        System.out.println("--- 选课名单（List，允许重复）---");
        System.out.println("人数：" + students.size());   // 4（含重复）
        for (String name : students) {
            System.out.println(name);
        }

        // 增删改查
        System.out.println("第0个学生：" + students.get(0));
        students.set(1, "赵六");          // 把李四改成赵六
        students.remove(0);                // 删除第0个（张三删了一个）
        System.out.println("--- 修改删除后 ---");
        for (String name : students) {
            System.out.println(name);
        }

        // 2. HashSet 去重
        System.out.println("--- 用 Set 去重 ---");
        Set<String> uniqueStudents = new HashSet<>(students);  // 用 List 直接构造 Set，自动去重
        System.out.println("去重后人数：" + uniqueStudents.size());
        for (String name : uniqueStudents) {
            System.out.println(name);
        }

        // 3. 判断是否包含
        System.out.println("王五在名单里吗？" + students.contains("王五"));
        System.out.println("李四在名单里吗？" + students.contains("李四"));
    }
}