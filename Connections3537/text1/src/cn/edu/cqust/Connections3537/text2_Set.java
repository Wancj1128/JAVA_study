package cn.edu.cqust.Connections3537;

import java.util.HashSet;
import java.util.Set;

public class text2_Set {
    //使用Set关键字来实现：
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        A.add(2);
        A.add(3);
        A.add(5);

        B.add(4);
        B.add(5);
        B.add(7);
        B.add(9);

        Set<Integer> New_list = new HashSet<>(A);
        New_list.addAll(B);

        System.out.println("集合A和集合B的并集: " + New_list);
    }
}
