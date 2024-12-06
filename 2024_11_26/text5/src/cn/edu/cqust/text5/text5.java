package cn.edu.cqust.text5;

public class text5 {
    public static void main(String[] args) {
        int nums = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int r = 2; r < i; r++) {
                if (i % r == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) nums++;
            if (flag) System.out.println(i + "是素数");
        }
        System.out.print("101到200之间的素数有:" + nums +"个");
    }
}
