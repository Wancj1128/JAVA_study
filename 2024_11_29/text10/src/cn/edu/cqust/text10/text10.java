package cn.edu.cqust.text10;

import java.util.Scanner;

public class text10 {
    //定义一个方法，将int数组中的数据按照指定的格式拼接成一个字符串并返回，调用该方法，并在控制台输出结果。

    public static String PinJie(String[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符，中间使用逗号隔开;");
        String s = sc.nextLine();
        String[] arr = s.split(",");
        String  result = PinJie(arr);
        System.out.println(result);
    }

}
