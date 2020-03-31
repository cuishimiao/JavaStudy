package APi08;
/*
java.util.Math :提供了大量静态方法，完成与数学有关的运算
public static double abs(double num)  ;求绝对值
public static double ceil(double num); 向上取整
public static double floor(double num) ;向下取整
public static long round(double num) ;四舍五入
Math.PI  :3.1415926... 近似的圆周率常量
 */
public class Demo01Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-6.999999));
        System.out.println("==================");
        //向上取整
        double mod=10.0;
        double num=21;
        System.out.println(Math.ceil(num/mod));
        System.out.println("==================");
        //向下取整
        System.out.println(Math.floor(30.9));
        //四舍五入
        System.out.println(Math.round(30.5));
        System.out.println(Math.round(30.4));
    }
}
