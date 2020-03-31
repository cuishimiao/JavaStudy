package Api05;

/*
java.lang.String 类代表字符串。
API当中说，java程序中的所有字符串字面值（入“abc"）都作为此类的实例实现

字符串的特点：
1.字符串是常量，字符串的内容永不可变
2.正是因为字符串不可改变，所有字符串的可以共享使用的
3.字符串效果上相当于char[]字符数组，底层原理是byte字节数组

创建字符串的常见3+1种模式：
1.public String();创建一个空白字符串
2.public String(char[] array);根据字符数组的内容来创建对应的字符串
3.public String(Byte[] array);根据字节数组的内容，来创建对应的字符串。
4.一种直接创建: String str4="Hello"; //也是字符串的对象
 */
public class Demo01String {
    public static void main(String[] args) {
        //空参构造
        String str=new String();
        System.out.println("第一个字符串："+str);

        //根据字符数组创建
        char [] charArray={'A','B','C','D'};
        String str2=new String(charArray);
        System.out.println(str2);

        //根据字节数组来创建字符串
        byte[] byteArra={ 97,98,99,};
        String str3=new String(byteArra);
        System.out.println(str3);

        //直接创建
        String str4="Hello";
        System.out.println("第四个字符串"+str4);

    }
}
