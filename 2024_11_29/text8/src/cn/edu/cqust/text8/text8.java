package cn.edu.cqust.text8;

import java.util.Scanner;

public class text8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String text = sc.nextLine();
        String result = FanZhuan(text);
        System.out.println(result);
    }
    //定义一个方法，使得输入的字符串呈反转输出：

    public static String FanZhuan(String text){
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            result += ch;
        }
        return result ;
    }

}
