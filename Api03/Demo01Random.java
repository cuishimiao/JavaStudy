package Api03;

/*
Random类用来生成随机产生：使用步骤
1导入
2.创建
Random r=new Random();
3.使用
int num=r.nextInt();  范围是int的所有范围，有正负俩种
 */
import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(10);
        System.out.println(num);
    }

}
