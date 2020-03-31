package demo03;

public class Person {

    String name;
    int age;

    public void show(){
        System.out.println("我叫"+name);
        System.out.println("年龄"+age);
    }

    public void setAge(int age){
        this.age=age;
    }
}
