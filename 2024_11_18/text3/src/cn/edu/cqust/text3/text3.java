package cn.edu.cqust.text3;

import java.util.Scanner;

public class text3 {
    //大小写字母的切换
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
            else {
                result.append(c);
            }
        }
        System.out.println("输出后的字符串为：" + result);
    }


}
