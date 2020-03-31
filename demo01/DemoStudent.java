package demo01;
/*
一个类通常不能直接使用
1.导包： 指出需要是要使用的类，在生命地方
        对于和当前类在同一包的情况，可以省略不写
2.创建 ：
    类名称  对象名 = new 类名称（）
3.使用
    使用成员变量 :对象名.成员变量名
    使用成员方法 ：对象名.成员方法名(参数)
 */
public class DemoStudent {
    public static void main(String[] args) {
        Student wang=new Student();
        wang.eat();
        wang.sleep();
        wang.age=18;
        wang.name="zhaoliyin";
        System.out.println(wang.name+wang.age);
    }

}
