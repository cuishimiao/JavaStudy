package demo01;

public class PhonePara {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brnad="苹果";
        one.price=8388;
        one.color="土豪金";

        method(one);
    }

    public static void method(Phone para)
    {
        System.out.println(para.brnad);
        para.call("乔布斯");
        para.sendMessage();
    }
}
