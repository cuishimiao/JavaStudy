package Api04;

import java.util.ArrayList;
import java.util.Random;
/*
题目：用一个大集合存入随机20个元素，然后筛选期中的偶数放到小集合中
要求自定义的方法来实现筛选
分析：
1.需要一个大集合，存储随机数字
2.随机数字用 Random
3.需要循环20次，将随机数字放入大集合
 */
public class Work04ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>  list=new ArrayList<>();
        Random rs=new Random();
        for (int i = 0; i < 20; i++) {
            int num=rs.nextInt(50);
            list.add(num);
        }
        ArrayList<Integer> listS=getOlder(list);
        System.out.println(listS);
    }
    public static ArrayList<Integer> getOlder(ArrayList<Integer> list)
    {
        ArrayList<Integer> listS=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                listS.add(list.get(i));
            }
        }
        return listS;
    }
}
