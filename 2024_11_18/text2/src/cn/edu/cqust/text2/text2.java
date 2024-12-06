package cn.edu.cqust.text2;

import java.io.CharArrayReader;
import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码");
        String ID = sc.nextLine();
        char[] Old_ID = ID.toCharArray();
        for (int i = 6; i < 10; i++) {
            Old_ID[i] = '*';
        }
        String New_ID = new String(Old_ID);
        System.out.println(New_ID);
    }

}
