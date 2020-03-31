package API06;
/*
如果一个成员变量使用了static关键字，这个变量不在属于对象
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student two=new Student("黄蓉",18);
        Student one=new Student("郭靖",16);


        one.room="101教室";

        System.out.println("姓名："+one.getAge()+"年龄"+one.getAge()+"教室："+one.room+"学号："+one.getId());
        System.out.println("姓名："+two.getAge()+"年龄"+two.getAge()+"教室："+two.room+"学号："+two.getId());

    }
}
