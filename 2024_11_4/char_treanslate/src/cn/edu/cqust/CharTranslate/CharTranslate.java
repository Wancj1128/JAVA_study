package cn.edu.cqust.CharTranslate;

import java.util.Scanner;

public class CharTranslate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));  // 大写转小写
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));  // 小写转大写
            } else {
                result.append(c);  // 非字母字符不变
            }
        }

        System.out.println("转换后的字符串：" + result.toString());
        
        scanner.close();
    }
}
