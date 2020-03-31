package Extends.Demo02;

public class Zi extends Fu {
    int numZi=20;
    int num=300;

    public void methodZi()
    {
        //因为本类当中有num，所以用的是自己的
        System.out.println(num);
    }
}
