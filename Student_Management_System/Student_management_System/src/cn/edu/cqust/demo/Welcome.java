package cn.edu.cqust.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        log_in: while (true) {
            System.out.println("欢迎来到学生管理系统登录界面");
            System.out.println("请选择 1：登录 2：注册 3：忘记密码");
            Scanner choose = new Scanner(System.in);
            String num = choose.nextLine();
            switch (num) {
                case "1":
                    if (Tools.log_in(users)){
                        System.out.println("用户登录成功！");
                        break log_in;
                    }
                    break;
                case "2":
                    users.add(Tools.log_up(users));
                    System.out.println(users);
                    break;
                case "3":
                    Tools.forget_password(users);
                    System.out.println(users);
                    break;
                default:
                    System.out.println("输入错误，请重新选择");
                    break;
            }
        }


        ArrayList<Student> students = new ArrayList<>();
        System.out.println("---------欢迎进入此学生管理系统:)---------");
         while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出程序");
            System.out.println("请输入您的选择:");
            String choice = sc.next();
            switch (choice){
                case "1":
                     students.add(Tools.Add(students));
                    System.out.println(students);
                    break;
                    case "2":
                        Tools.Delete(students);
                        break;
                        case "3":
                            Tools.Update(students);
                            break;
                            case "4":
                                Tools.Find(students);
                                break;
                                case "5":
                                    System.exit(0);
                                    break;
                                    default:
                                        System.out.println("输入错误，请重新选择");
                                        break;


            }
        }

    }

}
