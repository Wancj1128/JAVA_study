package cn.edu.cqust.text1;
import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.replaceAll("\\D","");
        try {
            int number = Integer.parseInt(result);
            System.out.println(number);
        }catch(NumberFormatException e) {
            System.out.println("无数字");
        }

    }

}
