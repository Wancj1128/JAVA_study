package cn.edu.cqust.demo3;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        //需求：在键盘录入一个三位数，将其拆分为个位，十位，百位并打印在控制台上

        //1:键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        //公式：
        //个位：数字 % 10
        //十位：数字 / 10 % 10
        //百位：数字 / 10 / 10 % 10
        //......
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println("您输入的这个三位数个位是：" + ge);
        System.out.println("您输入的这个三位数十位是：" + shi);
        System.out.println("您输入的这个三位数百位是：" + bai);
    }
}
