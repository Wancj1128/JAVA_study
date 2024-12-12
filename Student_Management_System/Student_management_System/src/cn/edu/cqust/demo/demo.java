package cn.edu.cqust.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(Tools.log_up(users));
        users.add(Tools.log_up(users));
        users.add(Tools.log_up(users));
        System.out.println(users);
    }
}
