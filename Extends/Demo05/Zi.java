package Extends.Demo05;
/*

1.@Override 这个注解是可选的,为了保证正确的重写
2.子类的方法的返回值必须【小于等于】父类方法返回值的范围
3.子类方法的权限必须大于等于父类方法的权限修饰符 public > protected >(default)>private
java.lang.Object 类是所有类的公共最高父类（祖宗类） java.lang.String 是它的子类
 */
public class Zi extends Fu {

    @Override  //一种安全的检测手段
    public void  method()
    {

    }
}
