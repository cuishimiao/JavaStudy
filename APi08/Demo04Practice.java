package APi08;
/*
题目：
计算子-10.8到5.9之间绝对值大于6或者小于2.1的整数都多少个
分析：
1.确定了范围-->用for循环
2.起点位置-10 终点位置5 向上取整（向正方向取整）
3.每个数字都是整数 num++
4.获取绝对值 Math.abs()
 */
public class Demo04Practice {
    public static void main(String[] args) {
        double min=-10.8;
        double max=5.9;
        for(int i=(int)min;i<max;i++)
        {
            int abs=Math.abs(i);
            if(abs>6 || abs<2.1)
                System.out.println(i);
        }
    }
}
