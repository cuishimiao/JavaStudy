package Api03;

import java.util.Random;
import java.util.Scanner;
/*
用代码模拟猜数字的小游戏
思路：
1.首先产生一个随机数字，并且一旦产生不再变化
2.需要键盘输入
3.获取键盘输入的数字，用Scanner的nextInt
4.拿到来个数字，判断一下
 */
public class Demo04Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int guess=sc.nextInt();
        int chance=10;
        boolean flag=true;
        while(guess!=num)
        {
            chance--;
            if(guess>num)
                System.out.println("太大了");
            else
                System.out.println("太小了");
            guess=sc.nextInt();
            if(chance==0)
            {
                flag=false;
                break;
            }
        }
        if(!flag) System.out.println("很抱歉，10次机会已经用完");
       else System.out.println("恭喜你，猜对了");
    }
}
