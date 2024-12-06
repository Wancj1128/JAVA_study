package cn.edu.cqust.text4;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        double new_money;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票价：");
        double money = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入是为经济舱还是头等舱：");
        String seat = sc.next();
        boolean flag = false;
        if (seat.equals("头等舱")) {
            flag = true;
        }
        System.out.println(flag);
        new_money = money(money, month, flag);
        System.out.println(new_money);
    }
    public static double money(double money, int month, boolean seat) {
        if (seat) {
            if (month <= 10 && month >= 5) {
                money = money * 0.9;
                return money;
            }
                money = money * 0.7;
            return money;
        }
        else {
            if (month <= 10 && month >= 5) {
                money = money * 0.85;
                return money;
            }
            money = money * 0.65;
            return money;
        }

    }
}
