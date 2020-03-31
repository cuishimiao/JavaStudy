package demo03;
/*
对于基本类型当中的boolean型 ：get方法要写成isXXX的形式
 */
public class Student {
    private String name;
    private int age;
    private boolean male;//是不是男人

    public void setMale(boolean b)
    {
        male=b;
    }

    public boolean isMale()
    {
        return male;
    }

    public void setName(String str){
        name=str;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age=age;

    }
    public int getAge()
    {
        return age;
    }

}
