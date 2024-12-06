package cn.edu.cqust.text1;

import java.util.Scanner;

public class text1 {
    public static void BianLi(int[] num1) {
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }

    public static void main(String[] args) {
        int[] num = {11,22,33,44,55};
        BianLi(num);
    }
}
