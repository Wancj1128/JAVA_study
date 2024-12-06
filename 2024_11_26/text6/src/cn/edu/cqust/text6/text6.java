package cn.edu.cqust.text6;

import java.util.Random;

public class text6 {
    public static void main(String[] args) {
        //自定义方法实现随机产生一个五位数的验证码
        PassWord();
    }
    public static void PassWord() {
        char[] word = new char[52];
        for (int i = 0; i < word.length; i++) {
            if (i <= 25) {
                word[i] = (char) (97 + i);
            }
            else
                word[i] = (char) (65 + i - 26);
        }
        System.out.println(word);
        Random r = new Random();
        String password = "";
        for (int i = 0; i < 4; i++) {
            int RandomWord = r.nextInt(word.length);
            password = password + word[RandomWord];
        }
        int RandomNum = r.nextInt(10);
        password = password + RandomNum;
        System.out.println(password);
    }
}
