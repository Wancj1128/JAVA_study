package cn.edu.cqust.demo1;
//类的定义：
public class employee {
    String name;
    int age;
    double salary;
//构造方法：
    public employee() {
    }
    public void sayHello() {
        System.out.println("My name is " + name);
    }
    public double computerSalary(int hours, double rate){
        double totalSalary;
        totalSalary = salary + hours * rate;
        return totalSalary;
    }
}
