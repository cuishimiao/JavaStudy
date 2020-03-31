package Api07;
import java.util.Arrays;
/*
题目：
使用Arrays将一个随机字符串进行升序排列，倒序打印
 */
public class Demo02Prac {
    public static void main(String[] args) {
        String str="fskjslkagk4rkfsj4534";
        //必须是数字才可以用Arrays
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

}
