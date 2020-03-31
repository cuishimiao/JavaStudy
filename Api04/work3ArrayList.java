package Api04;

import java.util.ArrayList;

public class work3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张山峰");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list);
        PrintArrayList(list);
    }
    public static void PrintArrayList(ArrayList<String> list)
    {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(i!=list.size()-1)
            System.out.print(name+"@");
            else
                System.out.print(name);
        }
        System.out.print("}");
    }
}
