package Extends.Demo09;
/*
this 关键字用来访问本类的内容，用法也有三种
1.访问本类的成员变量
2.访问本类的成员方法,起到强调方法属于本类
3.在本类的构造方法中，访问本类的另一个构造方法
    1.this()也必须是构造方法的第一个语句
    2.super（）和this()不能同时使用，这俩个都得是第一个

 */
public class Zi extends Fu {

    int num=20;
    public Zi()
    {
        this(123); //
    }
    public Zi(int n)
    {

    }

    public void show()
    {
        int num=-10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
