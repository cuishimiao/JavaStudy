package Api04;

import java.util.ArrayList;
/*
泛型不能是基本类型：集合中保存的都是地址值。基本类型没有地址值
如果希望向ArrayList当中存储基本类型，必须使用基本类型的包装类。

基本类型   包装类（引用类型，都位于java.lang包下，不需要导包）
byte   Byte
short   Short
int  Integer    【特殊】
long  Long
float  Float
double  Double
char  Character 【特殊】
boolean Boolean

从JDK 1.5+ 开始支持自动装箱和自动拆箱
自动装箱  ： 基本类型-->  包装类型
自动拆箱  ： 包装类型-->  基本类型
 */
public class Demo05ArraylistBasic {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        System.out.println(list1);

        int num = list1.get(1);
        System.out.println("第一号元素是："+num);
    }
}
