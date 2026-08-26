package org.example;
//接口1：会飞的能力
interface Flyable {
    void fly();
}
//接口2：会游的能力
interface Swimmable {
    void swim();
}
//抽象类：动物 有属性 + 抽象方法 +  普通方法
abstract class Animal2 {
    String name;
    Animal2(String name) {
        this.name = name;
    }
    abstract void makeSound();

    void eat() {
        System.out.println(name + "正在吃");
    }
}

class Bird extends Animal2 implements Flyable {
    public Bird (String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + "叽叽喳喳");
    }
    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }
}

class Fish extends Animal2 implements Swimmable {
    public Fish (String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + "鱼不会叫。。。。");
    }
    @Override
    public void swim() {
        System.out.println(name + "正在游");
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        Bird bird =new Bird("鸟儿");
        bird.makeSound();
        bird.fly();

        Fish fish=new Fish("小鱼");
        fish.makeSound();
        fish.swim();

        //接口多态
        Flyable flyer=new Bird("小鸟");
        flyer.fly();



        //抽象类多态
        Animal2 animal=new Bird("小鸟");
        animal.makeSound();
        animal.eat();


    }

}
