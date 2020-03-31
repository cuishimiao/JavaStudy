package Api04;

import java.util.ArrayList;

/*
题目：自定义4个学生对象，添加到集合，并遍历
思路：
1.自定义Student学生类，四个部分
2.创建一个集合，用来存储学生对象 泛型<Student>
3.根据类，创建四个学生对象，加入集合
4.遍历集合
 */
public class Work2ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student one=new Student("洪七公",20);
        Student two=new Student("有眼福",20);
        Student three=new Student("一定能",20);
        Student four=new Student("黄药师",20);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
    }
}
