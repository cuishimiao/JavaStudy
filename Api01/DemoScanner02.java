package Api01;

import java.util.Scanner;
/*
题目：键盘输入三个数，求出其中最大值
1.键盘输入，需要调用Scanner
2.输入三个数字
3.求max
 */
public class DemoScanner02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个个数字");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result = a>b?a:b;
        if(result<c) result=c;

        System.out.println("最大值："+result);
    }
}
