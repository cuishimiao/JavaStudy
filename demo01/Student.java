package demo01;

/*
定义一个类来模拟学生事务，期中就有俩个组成部分
属性：
    姓名
    年龄
行为：
    吃饭
    睡觉
    学习

成员变量：属性
成员方法：行为

注意事项：
1.成员变量是直接卸载类当中的
2.成员方法不要写static
 */

public class Student {
    protected String name;
    protected int age;

    public  void eat(){
        System.out.println("eat");
    };
    public  void learn(){
        System.out.println("Study");
    };
    public void sleep(){
        System.out.println("sleep");
    };

}
