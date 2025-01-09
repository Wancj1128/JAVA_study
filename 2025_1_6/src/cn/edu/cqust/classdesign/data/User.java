package cn.edu.cqust.classdesign.data;

public class User {

    private String uname;
    private String password;
    private String tel;
    private boolean level;

    public User() {
    }

    public User(String uname, String password, String tel, boolean level) {
        this.uname = uname;
        this.password = password;
        this.tel = tel;
        this.level = level;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean getLevel() {
        return level;
    }

    public void setLevel(boolean level) {
        this.level = level;
    }
}
