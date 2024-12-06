package cn.edu.cqust.text5;

import java.util.Scanner;

public class text6 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数。
        //键盘录入一个字符串：
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符串：");
        String strs = sc.nextLine();

        //统计 --> 需要想到计数器思想
        //1:先定义三个计数器：
        int CountUpper = 0;
        int CountLower = 0;
        int CountNum = 0;
        for (int i = 0; i < strs.length(); i++) {
            char ch = strs.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                CountUpper++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                CountLower++;
            }
            else if (ch >= '0' && ch <= '9') {
                CountNum++;
            }
        }
        System.out.printf("在这串字符串当中，大写字符有%d个，小写字符有%d个，数字字符有%d个", CountUpper, CountLower, CountNum);
    }
}
