package Api01;

import java.util.Scanner;

public class Demo02Anoymous {
    public static void main(String[] args) {
//        Scanner sc=new Scanner();
//        int num=sc.nextInt();

        //匿名对象的使用方式
        int  num=new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num);
    }
}
