package cn.edu.cqust.demo;

public class User {
    private String username;
    private String password;
    private String IDcard;
    private String phone_number;

    public User() {
    }

    public User(String username, String password, String IDcard, String phone_number) {
        this.username = username;
        this.password = password;
        this.IDcard = IDcard;
        this.phone_number = phone_number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String toString() {
        return "username: " + username + ", password: " + password + ", IDcard: " + IDcard + ", phone_number: " + phone_number;
    }
}
