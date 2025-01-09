package cn.edu.cqust.classdesign.util;

public class Tools {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int isTrue(boolean bool) {
        if (bool) {
            return 1;
        }
        return 0;
    }
}
