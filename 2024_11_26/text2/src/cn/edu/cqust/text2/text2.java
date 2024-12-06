package cn.edu.cqust.text2;

public class text2 {
    public static void main(String[] args) {
        int[] num = {11,22,33,44,55};
        int max_num = find_max(num);
        System.out.println(max_num);
    }
    public static int find_max(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
