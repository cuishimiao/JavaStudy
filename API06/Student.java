package API06;

public class Student {

    private String name;
    private int age;
    private int id; //学号

    private static int idCounter=0;//学号计数器（每当new一个对象的时候，计数器++）；

    static String room;

    public Student() {
        idCounter++;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
