package Api05;

/*
字符串常量池：程序当中直接写上【双引号】的字符串，就在字符串常量池中
对于基本类型来说：== 是进行数值的比较
对于引用类型来说：== 是【地址】值的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        char[] charArray={'a','b','c'};
        String str3=new String(charArray);
        //比较
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str3==str2);
    }
}
