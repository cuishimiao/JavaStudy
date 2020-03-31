package API06;
/*
一旦使用了static修饰了方法，该方法不属于对象，而是属于类
本来中的静态方法，调用时可以省略类名称
1.静态不能访问非静态 （在内存中先有的静态，后有的非静态） 先人不知道后人
2.静态方法中不能使用this，this代表当前对象，静态方法没有对象调用
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method();;
        //静态方法要通过类名称来调用,也可以用对象名调用但是不推荐
       // MyClass.methodStatic();
        obj.methodStatic();
        myMethod();
    }
    public static void myMethod()
    {
        System.out.println("自己的方法");
    }
}
