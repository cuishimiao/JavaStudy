package demo01;

public class Demo05Phone {
    public static void main(String[] args) {

        Phone one=getPhone();
        System.out.println(one.brnad);
        System.out.println(one.color);
        System.out.println(one.price);
    }

    public static Phone getPhone()
    {
        Phone one =new Phone();
        one.brnad="苹果";
        one.price=89;
        one.color="玫瑰金";
        return one;
    }

}
