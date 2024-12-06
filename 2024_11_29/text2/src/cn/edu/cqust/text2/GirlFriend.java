package cn.edu.cqust.text2;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;


    public int setAge(int a){
        if (a >= 18 && a<30){
            age=a;
        }else System.out.println("女朋友的年龄不合适");
        return age;
    }

    public String  getName(String age){
        return name;
    }

    public String getGender(String g){
        if (g.equals("男")){
            gender = g;
        }
     else if (g.equals("女")) {
            gender = g;
        }
     else System.out.println("非法性别");
     return gender;
    }

        //行为
    public void Hang_out() {
        System.out.println("出门逛街");
    }
    public void Eat() {
        System.out.println("在吃饭");
    }

}
