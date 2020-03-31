package Api05;
/*
String 当中与转换相关的常用方法有

public char[] toCharArray() ;将字符串拆分成字符数组作为返回值
public byte[] getBytes() ;获取当前字符串底层的字节数组
public String replace(CharSequence oldString,chaSequence newString);
将所有出现的老字符串替换成新字符串
备注：charSequence意思是可以接受字符串类型
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println(chars.length);

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //替换
        System.out.println("=========");
        String str1="How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str2);
    }
}
