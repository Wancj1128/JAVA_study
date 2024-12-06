package cn.edu.cqust.demo1;

public class EmployeeDemo {
    public static void main(String[] args) {
        employee employee;

        employee = new employee();
        employee.name = "wancj";
        employee.age = 20;
        employee.salary = 10000000000000000.00;

        System.out.println("姓名 = " + employee.name);
        System.out.println("年龄 = " + employee.age);
        System.out.println("工资 = " + employee.salary);
        employee.sayHello();
    }
}
