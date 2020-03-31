package API06;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置教室
        Student.room="101教室";
        Student one=new Student("郭靖",20);
        Student two=new Student("黄蓉",18);

        System.out.println("one的姓名："+one.getName());
        System.out.println("one的教室："+Student.room);
        System.out.println("one的年龄："+one.getAge());

    }
}
