package cn.edu.cqust.text2;

import java.util.Scanner;

public class GirlFriend_test {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
//        girlFriend.name = "Anna Yanami";
//        girlFriend.age = 18;
        Scanner sc = new Scanner(System.in);

        //获取女孩的姓名
        System.out.println("请输入女孩的姓名：");
        String  name = sc.next();
        girlFriend.getName(name);

        //获取女孩的年龄
        System.out.println("请输入女孩的年龄：");
        int age = sc.nextInt();
        girlFriend.setAge(age);


        girlFriend.Eat();
        girlFriend.Hang_out();
    }
}
