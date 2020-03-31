package Extends;
/*
在继承关系中，子类就是一个父类 ； -> 子类可以被当做父类看待
例如父类是员工，子类是讲师，那么讲师就是一个员工。关系是is a

定义子类格式：
public class 子类名称 extends  父类名称{
}
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.method();

        Assitant assitant=new Assitant();
        assitant.method();
    }
}
