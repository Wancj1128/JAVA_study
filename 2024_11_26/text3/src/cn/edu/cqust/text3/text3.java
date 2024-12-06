package cn.edu.cqust.text3;

public class text3 {
    public static void main(String[] args) {
        int[] num = {11,22,33,44,55,66};
        int target = 99;
        if(find_num(num,target))
            System.out.println(target);
    }
    public static boolean find_num(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}
