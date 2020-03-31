package demo01;

/*
定义一个类来模拟手机

属性：
    品牌
    价格
    颜色
行为：
    打电话
    发短信

成员变量：（属性）
成员方法：（行为）
 */
public class Phone {
    String  brnad;
    double price;
    String color;

    public void call(String who)
    {
        System.out.println("call  "+who);
    }

    public void sendMessage()
    {
        System.out.println("send Message to evenryone");
    }

}
