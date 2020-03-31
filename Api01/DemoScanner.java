package Api01;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
/*
题目：键盘输入俩个int数字，并且求出和
1.Scanner
2.导包，创建，使用
3.需要俩个数字，调用俩次nextInt方法

alt+Enter  :导包
 */
public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入俩个字符：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int result=a+b;
        System.out.println("结果是："+result);
    }
}
