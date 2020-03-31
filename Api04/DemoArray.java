package Api04;

/*
题目：
定义一个数组，用来存储三个Person对象
数组有一个缺点：一旦创建，程序运行期间长度不能发生改变
 */
public class DemoArray {
    public static void main(String[] args) {
       // int [] arr =new int[3];
        Person[] array=new Person[3];
        Person one=new Person("迪丽热巴",18);
        Person two =new Person("古丽扎娜",87);
        Person three=new Person("马儿啥子",36);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[1].getName());

    }
}
