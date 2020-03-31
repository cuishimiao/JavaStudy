package API06;
/*
静态代码块格式：
public class 类名称{
    static{
    }
}
特点：
1.当第一次用到本类时，静态代码块执行唯一的一次
2.静态内容总是先执行
3.静态代码块典型用途：
    用来一次性的对静态成员变量进行赋值
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person person=new Person();

        Person one=new Person();
    }
}
