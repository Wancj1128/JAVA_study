package cn.edu.cqust.demo;

import java.util.Scanner;

public class HuiWenShu {
    public static void main(String[] args) {
        //回文数的打印
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数x：");
        int x = sc.nextInt();
        int origen = x;
        int sum = 0;
        while (x != 0) {

            int y = x % 10;
            x = x / 10;
            sum = sum*10 + y;

        }
        System.out.println(sum);
        System.out.println(sum == origen);
    }
}

