package Extends.Demo02;
/*
在父子类的关系当中，如果成员变量重名，则创建子类对象时，访问方式有俩种
1.自己通过子类对象访问成员变量
    等号左边是谁，就优先使用谁，没有则向上找
2.间接通过成员方法访问成员变量
    该方法属于谁，就优先用谁

 */
public class Demo02Extends {
    public static void main(String[] args) {
        Fu fu=new Fu();
        Zi zi=new Zi();
        System.out.println(fu.numFu);
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("==========");

        System.out.println(zi.num);
        //这个方法是子类的，就优先用子类的

        zi.methodZi(); //300
        System.out.println();
        //    该方法属于谁，就优先用谁
        zi.methodFu();  //100
    }
}
