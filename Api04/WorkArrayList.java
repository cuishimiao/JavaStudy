package Api04;

import java.util.ArrayList;
import java.util.Random;
/*
题目：
生成6个1~33之间的随机整数，添加到几何，并遍历集合
思路：
1.存储  ：集合
2. 产生6随机数 ：循环+Random
3. 循环内需要调用r.nextInt(int n)+1;
 */
public class WorkArrayList {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
