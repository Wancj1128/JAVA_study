package cn.edu.cqust.text5;

public class Test {
    public static void main(String[] args) {
        //实例化计算机对象
        Computer computer=new Computer();
        //向计算机中添加鼠标、麦克风、键盘
        computer.add(new Mouse());
        computer.add(new Mic());
        computer.add(new KeyBoard());

        //启动计算机
        computer.powerOn();
        //关闭计算机
        computer.powerOff();

    }
}
