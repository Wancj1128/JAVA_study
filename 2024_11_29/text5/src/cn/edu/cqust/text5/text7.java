package cn.edu.cqust.text5;

public class text7 {
    public static void main(String[] args) {
        //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回,调用该方法,并在控制台输出结果。
        int[] arr = {1,2,3,4};
        String result = Together(arr);
        System.out.println(result);
    }
    public static String Together(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                result += arr[i] + ", ";
            }
            else {
                result += arr[i];}

        }
        result += "]" ;
        return result;
    }
}

