package day0;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Дымка");
        Cat.test = "1";
        System.out.println(Cat.test);
        cat1 = new Cat("Лооол");
        cat1.test = "2";
        System.out.println(cat1.getTest());
        System.out.println(Cat.test);
        System.out.println(cat1.getName() + " " + cat1.getAge());
        cat1.consoleOut("Лол. вывод в консоль работает");

    }
}

class Cat{
    private String name;
    private int agee;

    public static String test;
    public Cat(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getTest(){
        return test;
    }
    public void setAgeeee(int Userage) {
        if(Userage>0) {
            agee = Userage;
        }else{
            System.out.println("Возвраст должен быть положительным ");
        }
    }

    public void consoleOut(String console){
        System.out.println(console);
    }
    public int getAge() {
        return agee;
    }
}