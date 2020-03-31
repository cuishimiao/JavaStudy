package demo01;

public class DemoCallPhone {
    public static void main(String[] args) {
        //根据Phoebe类，创建one的对象
        Phone one =new Phone();
        one.brnad="sanxing";
        one.price=34;
        one.color="red";
        one.call("two");
        one.sendMessage();
        System.out.println(one.price);

    }
}
