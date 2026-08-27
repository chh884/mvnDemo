package org.example;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"java", "python", "java", "c++", "java", "python", "go"};

        Map<String,Integer> countMap=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(countMap.containsKey(words[i])){
                countMap.put(words[i],countMap.get(words[i])+1);
            }
            else {
                countMap.put(words[i],1);
            }
        }

        //遍历打印结果用entrySet
        for(Map.Entry<String,Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("java 出现次数: " + countMap.get("java"));
        System.out.println("go 在统计里吗？"+countMap.containsKey("go"));
        System.out.println("php 在统计里吗？" + countMap.containsKey("php"));

    }
}

