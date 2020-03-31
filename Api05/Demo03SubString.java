package Api05;
/*
字符串的截取方法
public String SubString(int index); 从参数的位置截取一直到字符串末尾
public String SubString(int begin,int end); 截取一个范围
备注：左闭右开区间
 */
public class Demo03SubString {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===========");
        String str3=str1.substring(4,7);
        System.out.println(str3);
    }
}
