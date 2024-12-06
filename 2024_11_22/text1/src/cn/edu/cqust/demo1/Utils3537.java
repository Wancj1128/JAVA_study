package cn.edu.cqust.demo1;

import java.util.Scanner;

public class Utils3537 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String old_str = sc.nextLine();

        StringBuilder new_str = new StringBuilder();

        for (int i = 0; i < old_str.length(); i++) {
            char c = old_str.charAt(i);
            if (Character.isUpperCase(c)) {
                new_str.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                new_str.append(Character.toUpperCase(c));
            }
            else {
                new_str.append(c);
            }
        }
        System.out.println("输出后的字符串为：" + new_str);
    }
}
