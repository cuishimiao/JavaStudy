package Api05;

/*
==是对对象的地址值比较，如果确实需要字符串的内容比较，可以使用俩个方法
public boolean equals(Object obj):参数可以是任意对象，只有参数是一个字符串，并且内容相等才会返回true
    ""包含的就是字符串对象
注意：
1.equals方法具有对称性
2.任何对象都能进行equals
3.如果比较双方一个产量和一个变量，推荐 "abc".equals(str);
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char [] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4="hello";
        System.out.println(str1.equals(str4));
    }
}
