package Api01;

/*
类名称 对象名 = new 对象名

匿名对象只能使用唯一的一次
使用建议：
    如果确定有一个对象只需要使用一次，就可以使用匿名对象
 */
public class DemoAnoymous {
    public static void main(String[] args) {
        Person one =new Person();
       one.name="高圆圆";

       //匿名对象
        new Person().name="赵又提";
        new Person().show(); //显示空值
    }
}
