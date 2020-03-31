package Api05;
/*
题目：
定义一个方法 ，吧数组{1,2,3} 变成[word1#word2#word3]
 */
public class Demo06StringPractice {
    public static void main(String[] args) {
        int [] num={1,2,3,4};

        String result=GetString(num);
        System.out.println(result);

    }
    public static String GetString(int [] num)
    {
        String str="[";
        for (int i = 0; i < num.length; i++) {
            if(i==num.length-1)
            {
                str+="word"+num[i]+"]";
            }
            else
                str+="word"+num[i]+"#";
        }
        return str;
    }
}
