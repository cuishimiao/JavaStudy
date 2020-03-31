package Api05;
/*
String 当中与获取有关的常用方法有
public int length();获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str);拼接字符串 （+号也可以）
public char charAt(int index);  获取指定索引的单个字符（索引从零开始）
public int indexOf(String str);  查看参数字符串在本字符串当中首次出现的索引位置
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "sfsdfsdfdfsdf".length();
        System.out.println(length);
        //快捷键：alt + Enter   补齐前面
        //拼接字符串  (字符串最大的特点：不变）
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //如果觉得字符串变了，一定是创建了一个新的
        System.out.println("==================");
        //获取指定索引位置的单个字符
        char c = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+c);
        System.out.println("==================");

        //查找参数在本来字符串当中第一次索引位置，如果没有返回-1
        String original="HelloWorld";
        int llo = original.indexOf("llo");
        System.out.println("第一个出现的位置"+llo);
    }
}
