package cn.edu.cqust.text1;

import java.util.StringJoiner;

public class text1 {


    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","{","}");    //间隔，前缀，后缀
        sj.add("123");
        sj.add("2");
        sj.add("3");
        sj.add("4");
        System.out.println(sj);
        int len = sj.length();
        System.out.println(len);
        String str = sj.toString();
    }
}