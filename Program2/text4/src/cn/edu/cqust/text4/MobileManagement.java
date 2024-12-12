package cn.edu.cqust.text4;

import cn.edu.cqust.text4.data.Mobile;

public class MobileManagement {
    /** Defines the entry point of the application. */


    public static void main(String[] args) {
        // Creates two mobile phone objects.
        Mobile mobile1 = new Mobile("荣耀8", 1099);
        Mobile mobile2 = new Mobile("小米Max2", 1699);

        String mobile1_name = mobile1.getName();

        System.out.format("mobile[品牌：%s, 价格：%s]",mobile1_name,mobile1.getPrice());
        System.out.println();
        System.out.format("mobile[品牌：%s, 价格：%s]",mobile2.getName(),mobile2.getPrice());
    }
}

