package cn.edu.cqust.text5;

public class Mic implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了......");
    }
    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了......");
    }
}
