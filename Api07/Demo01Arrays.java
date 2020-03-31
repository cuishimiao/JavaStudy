package Api07;

import java.util.Arrays;

/*
public static String toString(数组); 将参数数组变成字符串（元素1，元素2，元素3）
public static void sort(数组) ;按照默认升序对数组的元素进行排序
1.如果是自定义的类型，自定义的类需要Comparabl或者comparator接口支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int [] intarray={10,20,30,50,25,16,90};
        String intStr= Arrays.toString(intarray);
        System.out.println(intStr);//[10, 20, 30]
        Arrays.sort(intarray);
        System.out.println(Arrays.toString(intarray));

        String[] arry2={"bbb","aaa","ccc"};
        Arrays.sort(arry2);
        System.out.println(Arrays.toString(arry2));
    }
}
