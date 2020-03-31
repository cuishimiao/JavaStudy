package Api05;
/*
分割字符串的方法
public String[] split(String regex):安装参数的规则将字符串切分成若干部分
    regex：
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String str2="aaa bbb ccc";
        String[] arra2 = str2.split(" ");
        for (int i = 0; i < arra2.length; i++) {
            System.out.println(arra2[i]);
        }
    }
}
