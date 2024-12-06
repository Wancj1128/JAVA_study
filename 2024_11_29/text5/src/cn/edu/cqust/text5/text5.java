package cn.edu.cqust.text5;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        //键盘录入一个字符串，使用程序实现在控制台遍历改字符串

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符串：");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            //字符串的每一个索引
            System.out.println(str.charAt(i));
        }
    }
}
