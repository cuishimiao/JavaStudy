package demo03;

/*
面向对象三大特效：封装，继承，多态

1.方法就是一种封装
2.关键字private 也是一种封装

封装：将一些细节信息隐藏起来，对于外界不可见
 */
public class DemoMetho {
    public static void main(String[] args) {
        int []array ={5,15,25,100};
        int max=getMax(array);
        System.out.println("最大值"+max);
    }

    public  static int getMax(int [] array)
    {
        int max=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max) max=array[i];
        }
        return max;
    }
}
