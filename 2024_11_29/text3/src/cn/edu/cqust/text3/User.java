package cn.edu.cqust.text3;

public class User {
    //属性：用户名，密码，邮箱，性别，年龄
    private String UserName;
    private String Password;
    private int age;
    public String gender;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public User() {
        System.out.println("测试");
    }
    public User(String UserName, String Password, int age, String gender) {
        
    }
}
