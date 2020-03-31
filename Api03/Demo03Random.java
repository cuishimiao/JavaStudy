package Api03;

import java.util.Random;

/*
题目要求：
根据int变量n值，来获取随机数字，范围是【1，n】
思路：
1.定义一个int
2.使用Random  [0,n） ：左闭右开
3.整体加一即可
 */
public class Demo03Random {
    public static void main(String[] args) {
        int num=5;
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int result=r.nextInt(num)+1; //范围是 0-n-1   ->[1,n]
            System.out.println(result);
        }
    }
}
