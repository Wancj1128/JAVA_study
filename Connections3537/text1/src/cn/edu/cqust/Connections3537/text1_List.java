package cn.edu.cqust.Connections3537;

import java.util.ArrayList;
import java.util.List;

public class text1_List {
    //使用list关键字来实现
        public static void main(String[] args) {
            //初始化
            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();

            A.add(2);
            A.add(3);
            A.add(5);

            B.add(4);
            B.add(5);
            B.add(7);
            B.add(9);

            List<Integer> New_list = new ArrayList<>(A);
            for (Integer item : B) {
                if (!New_list.contains(item)) {
                    New_list.add(item);
                }
            }

            System.out.println("集合A和集合B的并集: " + New_list);
        }
}

