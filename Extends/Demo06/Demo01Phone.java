package Extends.Demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=====");

        newPhone newPhone=new newPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
