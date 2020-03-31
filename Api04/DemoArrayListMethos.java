package Api04;

import java.util.ArrayList;

/*
ArrayList常用方法:
public boolean  add(E e);向集合当中添加元素，参数的类型和泛型一致
public E  get(int index) ;从集合当中获取元素，参数是索引编号
public E remove(int index); 从集合当中删除元素，返回元素就是被删除的元素
public int size() :获取集合的尺寸长度，返回集合元素个数

对于ArrayList集合来说，添加动作一定是成功的（对于其他集合来说，add不一定成功，返回值有用）
 */
public class DemoArrayListMethos {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        //添加元素
        boolean success=list.add("路游");
        System.out.println(list);
        System.out.println("添加的动作是否成功"+success);

        list.add("李小龙");
        list.add("贾乃亮");
        System.out.println(list);

        String name=list.get(2);
        System.out.println(name);

       String good= list.remove(2);
        System.out.println(list);
         list.remove("路游");
        System.out.println("集合大小"+list.size());
    }
}
