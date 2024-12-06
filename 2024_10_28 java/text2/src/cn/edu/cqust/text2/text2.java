package cn.edu.cqust.text2;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int x = sc.nextInt();
        System.out.println("请输入除数：");
        int y = sc.nextInt();
        if(x < y){
            System.out.println("商为0");
            System.out.printf("余数为:%d",x);
        }
        else{
            while((x - y) > y )
            {
                int shang = 0;
                x = x - y;
                shang++;
            }
        }
    }
}
