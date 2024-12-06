package cn.edu.cqust.text9;

import java.util.Scanner;

public class text9 {
    public static void main(String[] args) {
        //键盘录入金额：
        int num_money;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要转换的金额：");
        while (true) {
            num_money = sc.nextInt();
            if (num_money >= 0 && num_money <= 9999999 ) {
                break;
            }
            else {
                System.out.println("输入金额无效，请重新输入金额：");
            }
        }
        String str_money = "";      //定义一个金额的大写
        //得到num_money中的每一位的数字
        while (true){
            int WeiShu = num_money % 10;    //得到个位
            String capital_num = transform_nums(WeiShu);
//            System.out.print(capital_num);//此时得到的数据是反向的
            str_money = capital_num + str_money;
            num_money = num_money / 10;
            if (num_money == 0){
                break;
            }
        }

        //补零
        for (int i = str_money.length(); i < 7; i++) {
            str_money = "零" + str_money;
        }
        System.out.println(str_money);

        //插入单位：同样使用查表法
        String[] DanWei = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < str_money.length(); i++) {
            char ch = str_money.charAt(i);
            System.out.print(ch);
            System.out.print(DanWei[i]);
            result += ch + DanWei[i];
        }
        System.out.println(result);
        
    }

    //定义一个方法将数字转化为大写的中文格式：
    public static String transform_nums(int num) {
        String[] traditional_num = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return traditional_num[num] ;
    }
}
