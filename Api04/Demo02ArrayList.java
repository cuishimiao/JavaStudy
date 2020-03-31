package Api04;

import java.util.ArrayList;
/*
数组的长度不可以发生改变
ArrayList集合的长度是可以随意变化的

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：集合中的元素是统一的类型
泛型只能是引用类型，不能是基本类型 ：String
对于ArrayList来说，自己打印不是地址值，而是内容
如果内容为空，得到的是中括号[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合名称是list ,里面装的全是String
        ArrayList<String> list =new ArrayList<>();
        String [] array=new String[5];
        System.out.println(list);
        //向集合当中添加数据 add方法
        list.add("赵丽颖");
        list.add("赵本山");
        list.add("古力娜扎");
        System.out.println(list);
        System.out.println(list.get(2));

    }
}
