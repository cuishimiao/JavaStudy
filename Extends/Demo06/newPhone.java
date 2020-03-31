package Extends.Demo06;

public class newPhone extends Phone {

    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
    //快捷键： show.   快速重写
}
