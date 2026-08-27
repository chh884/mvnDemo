package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileIODemo {
    public static void main(String[] args)  {
        String fileName="data.txt";
        System.out.println("写文件");
        try(BufferedWriter bf=new BufferedWriter(new FileWriter(fileName))){
            bf.write("写入");
            bf.newLine();
            bf.write("写入2");
            System.out.print("写入完成");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
