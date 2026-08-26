package org.example;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name+"发出声音");
    }
    public void eat() {
        System.out.println(name+"正在吃");
    }
}

class Cat extends Animal {
    public Cat(String name,int age) {
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+"喵喵");
    }
}

class Dog extends Animal{
    public Dog(String name,int age) {
        super(name,age);
    }
    @Override
    public void makeSound() {
        System.out.println(name+"汪汪");
    }
    public void wagTail() {
        System.out.println(name+"正在摇尾巴");
    }

}
public  class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog =new Dog("旺财",12);
        Cat cat =new Cat("丫丫",6);
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
        dog.wagTail();


        //多态
        Animal a2=new Dog("dd",22);
        Animal a1=new Cat("yy",6);

        //动态绑定：父类引用调用子类方法
        a2.makeSound();
        a1.makeSound();

        //方法参数多态
        letSpeak(a1);
        letSpeak(a2);

        //向下转型：父类转子类
        if(a2 instanceof Dog){
            Dog d1=(Dog)a2;
            d1.wagTail();

        }

    }
    public static void letSpeak(Animal animal) {
        animal.makeSound();
    }
}