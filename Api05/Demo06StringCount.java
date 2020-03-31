package Api05;

import java.util.Scanner;
/*
题目：
键盘输入一个字符串，并统计其中各种字符出现的次数
种类：大学字母，小写字母，数字，其他

思路：
1.键盘输入  String str =sc.next();
2.定义四个变量代表四种字符各自出现的次数
3.对字符串一个字符一个字符的检查 toCharArray
4.遍历char[] 判断
 */
public class Demo06StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input =sc.next();
        char[] chars = input.toCharArray();
        int coutUpper=0;
        int coutLower=0;
        int coutNumber=0;
        int countOther=0;
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if('A'<=ch && ch<='Z') coutUpper++;
            else if('a'<=ch && ch<='z') coutLower++;
            else if('0'<=ch && ch <='9') coutNumber++;
            else countOther++;
        }

        System.out.println("大写字母有："+coutUpper);
        System.out.println("小写字母有："+coutLower);
        System.out.println("数字有有："+coutNumber);
        System.out.println("其他字符有："+countOther);
    }
}
