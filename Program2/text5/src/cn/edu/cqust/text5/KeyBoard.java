package cn.edu.cqust.text5;

public class KeyBoard implements USB {
    @Override
    public void turnOn() {
        System.out.println("键盘启动了......");
    }
    @Override
    public void turnOff() {
        System.out.println("键盘关闭了......");
    }
}

