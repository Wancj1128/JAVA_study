package cn.edu.cqust.MyProgram;

public class Myprogram {
    private int data;
    private String str;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String toString() {
        return "Data: " + data + ", String: " + str;
    }

    public static void main(String[] args) {
        Myprogram MyProgram = new Myprogram();
        MyProgram.setData(42);
        MyProgram.setStr("Hello, World!");

        // 获取并显示属性值
        System.out.println("data: " + MyProgram.getData());
        System.out.println("str: " + MyProgram.getStr());

        // 调用 toString 方法显示属性
        System.out.println("Object: " + MyProgram.toString());
    }
}
