package demo04;
/*
一个标准的类：
1.所有的成员变量都用private修饰
2.为每个成员变量编写一对getter /setter方法
3.编写一个无参数的构造方法
4.编写一个全部参数的构造方法

这样的标准的类叫做Java Bean
 */
public class StandarStudent {
    private String  name;
    private int age;

    public StandarStudent() {
    }

    public StandarStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
