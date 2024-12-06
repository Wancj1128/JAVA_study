package cn.edu.cqust.text4;

import java.util.Scanner;

public class log_in {
    public static void main(String[] args) {
        //已知正确的用户名和密码：
        String UserName = "wancj";
        String Password = "WancJ041128";

        boolean result = false;
        //一共有三次机会来输入
        for (int i = 1; i <= 3; i++){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String give_user_name = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("请输入密码：");
            String give_password = sc2.nextLine();

            if (give_user_name.equals(UserName) && give_password.equals(Password)){
                result = true;
                break;
            }
            System.out.println("登录失败，请重新检查并输入账号密码,您还剩下"+ (3-i) +"次机会");
            System.out.println("-------------------------------------");
        }
        if (result){
            System.out.println("登录成功");
        }
        else System.out.println("登录失败");

    }
}
