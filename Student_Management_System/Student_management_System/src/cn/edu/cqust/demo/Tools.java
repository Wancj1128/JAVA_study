package cn.edu.cqust.demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tools {
    public static User log_up(ArrayList<User> users){
        Scanner sc = new Scanner(System.in);
        User user = new User();
            while(true) {
                System.out.println("请输入用户名：");
                String username = sc.next();
                boolean flag = false;
                for (int i = 0; i < users.size(); i++) {
                    String old_name = users.get(i).getUsername();
                    if (username.equals(old_name)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    if (username.length() > 3 && username.length() < 15) {
                        int num = 0;
                        for (int i = 0; i < username.length(); i++) {
                            if (Character.isLetter(username.charAt(i)) && Character.isDigit(username.charAt(i)) ) {
                                if (Character.isDigit(username.charAt(i))) {
                                    num += 1;
                                }
                            }
                        }
                        if (num != username.length()) {
                            System.out.println("用户名创建成功");
                            user.setUsername(username);
                            break;
                        } else System.out.println("用户名不可以是纯数字");
                    }else System.out.println("用户名太短了");
                } else System.out.println("此用户名存在");

            }
            while (true) {
                System.out.print("请设置用户密码：");
                String password = sc.next();
                System.out.print("请确认密码：");
                String re_password = sc.next();
                if (password.equals(re_password)) {
                    System.out.println("密码设置成功！");
                    user.setPassword(password);
                    break;
                } else System.out.println("两次输入的密码不相同，请重新输入！");

            }
            while (true) {
                System.out.print("请输入身份证号码：");
                String idcard_num = sc.next();
                if (idcard_num.length() == 18 && idcard_num.charAt(0) != 0
                        && (idcard_num.charAt(17) == 'X' || idcard_num.charAt(17) == 'x' || Character.isDigit(idcard_num.charAt(17)) )) {
                    boolean flag = true;
                    for (int i = 0; i < idcard_num.length() - 1; i++) {
                        if (!Character.isDigit(idcard_num.charAt(i))) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        user.setIDcard(idcard_num);
                        break;
                    }else System.out.println("ERROR, Try Again :)");
                }else System.out.println("身份证号码有问题");
            }
            while (true) {
                System.out.println("请输入手机号：");
                String PhoneNumber = sc.next();
                if (PhoneNumber.length() == 11 && PhoneNumber.charAt(0) != 0) {
                    boolean flag = true;
                    for (int i = 0; i < PhoneNumber.length() - 1; i++) {
                        if (!Character.isDigit(PhoneNumber.charAt(i))) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        user.setPhone_number(PhoneNumber);
                        break;
                    }else System.out.println("电话号码有问题, Try Again :)");
                }else System.out.println("电话号码长度有问题或者第一位为0");
            }
        return user;
    }

    public static boolean log_in(ArrayList<User> users){
        for (int i = 0; i < 3; i++) {

            if (users.isEmpty()) {
                System.out.println("用户还未创建，请先创建用户");
                break;
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入用户账号：");
                String username = sc.next();
                boolean flag = false;
                String password = "";
                for (int x = 0; x < users.size(); x++) {
                    String old_name = users.get(x).getUsername();
                    if (username.equals(old_name)) {
                        flag = true;
                        password = users.get(x).getPassword();
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("用户名不存在");
                    break;
                } else {
                    while (true){
                        String verify_code = Verification_Code();
                        System.out.println(verify_code);
                        System.out.println("请输入上方的验证码:");
                        String result = sc.next();
                        if (result.equals(verify_code)) {
                            System.out.println("验证通过 :)");
                            break;
                        }
                        System.out.println("验证码输入错误，请重新输入 :(");

                    }
                    System.out.print("请输入密码：");
                    String new_password = sc.next();
                    if (password.equals(new_password)) {
                        System.out.println("登录成功！");
                        return true;
                    }
                    else if ((2-i) != 0) {
                        System.out.println("登录失败，请重新输入账号密码，您还有" + (2 - i) + "次机会");
                    }
                    else{
                        System.out.println("登录失败");
                    }
                }
            }
        }
        return false;
    }

    public static String Verification_Code(){
        String code = "";
        Random random = new Random();
        int choose = random.nextInt(5);
        for (int i = 0; i < 5; i++) {

            if (i == choose) {
                int number =  random.nextInt(9);
                String num = String.valueOf(number);
                code += number;
            }
            else if (random.nextBoolean()) {
                char letter = (char) ('A' + random.nextInt(26));
                code += letter;
            }
            else {
                char letter = (char) ('a' + random.nextInt(26));
                code += letter;
            }
        }
        return code;
    }

    public static void forget_password(ArrayList<User> users){
        String id = "";
        String phone_number = "";
        int index = 0;
        if (users.isEmpty()) {
            System.out.println("请先注册用户");
        }
        else {
            System.out.println("忘记密码");
            System.out.print("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String user_name = sc.next();
            boolean flag = false;
            for (int i = 0; i < users.size(); i++) {
                String old_name = users.get(i).getUsername();
                if (old_name.equals(user_name)) {
                    flag = true;
                    id = users.get(i).getIDcard();
                    phone_number = users.get(i).getPhone_number();
                    index = i;
                    break;
                }
            }
            if (flag) {
                System.out.print("请输入用户的身份证号：");
                String re_id = sc.next();
                System.out.print("请输入用户的手机号：");
                String re_phone = sc.next();
                if (id.equals(re_id) && phone_number.equals(re_phone)) {
                    System.out.print("请重新设置用户密码：");
                    String new_password = sc.next();
                    users.get(index).setPassword(new_password);
                }
                else {
                    System.out.println("信息不匹配，修改失败");
                }
            } else System.out.println("此用户还未注册");
        }
    }

    public static Student Add(ArrayList<Student> students) {
        System.out.println("添加学生");
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请录入此学生的id：");
            String id = sc.next();
            boolean flag = contains(students, id);
            if (flag) {
                System.out.println("此学生id已经存在,请重新录入");
            } else {
                System.out.println("此学生id不存在，可以继续录入");
                student.setID(id);
                break;
            }
        }

        System.out.print("请录入此学生的姓名：");
        String name = sc.next();
        student.setName(name);

        System.out.print("请录入此学生的年龄：");
        String age = sc.next();
        student.setAge(age);

        System.out.print("请录入此学生的家庭住址：");
        String HomeLocation = sc.next();
        student.setHomeLocation(HomeLocation);

        System.out.println("此学生添加成功！");

        return student;

    }


    public static void Delete(ArrayList<Student> students) {
        System.out.println("删除学生");
        System.out.println("请输入需要删除的学生的id");
        Scanner ID = new Scanner(System.in);
        String id = ID.nextLine();
        boolean flag = false;
        if (students.isEmpty()) {
            System.out.println("列表为空，不能删除");
        }
        else
            for (Student student : students) {
                if (student.getID().equals(id)) {
                    flag = true;
                    System.out.println("此学生存在");
                    students.remove(student);
                    System.out.println("此学生已经删除");
                    break;
                }

            }
        if (!flag) {
            System.out.println("此学生不存在");
        }

    }

    public static void Update(ArrayList<Student> students) {
        System.out.println("修改学生");
        System.out.println("请输入需要修改的学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        boolean flag = false;
        if (students.isEmpty()) {
            System.out.println("列表为空，不能删除");
        }
        else
            for (Student student : students) {
                if (student.getID().equals(id)) {
                    flag = true;
                    System.out.println("请输入需要修改的此学生的姓名：");
                    String Name = sc.next();
                    student.setName(Name);
                    System.out.println("请输入需要修改的此学生的年龄：");
                    String Age = sc.next();
                    student.setAge(Age);
                    System.out.println("请输入需要修改的此学生的家庭住址：");
                    String HomeLocation = sc.next();
                    student.setHomeLocation(    HomeLocation);
                }

            }
        if (!flag) {
            System.out.println("此学生不存在");
        }
    }

    //打印所有学生的信息
    public static void Find(ArrayList<Student> students) {
        System.out.println("查询学生");
        if (students.isEmpty()){
            System.out.println("当前没有学生信息，请添加之后再查询。");
            return;
        }
        for (Student student : students) {
            System.out.println("--------------------");
            System.out.println("学生id:" + student.getID());
            System.out.println("姓名:" + student.getName());
            System.out.println("年龄:" + student.getAge());
            System.out.println("家庭住址:" + student.getHomeLocation());
        }
    }

    public static boolean contains(ArrayList<Student> arr, String id) {
        for (int i = 0; i < arr.size(); i++) {
            Student student = arr.get(i);
            String studentID = student.getID();
            if (studentID.equals(id)) {
                return true;
            }
        }
        return false;
    }



}
