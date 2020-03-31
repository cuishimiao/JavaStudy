package demo03;

/*
问题描述：
用private 关键字将要保护的成员变量进行修饰

一旦用private本类中任然可以随意访问到age
超出了本类其他类都不能访问
 */
public class DemoPerson {
    public static void main(String[] args) {
        Person person =new Person();
        person.show();

        person.age=-20;
        person.name="赵林云";
        person.show();
    }
}
