package cn.edu.cqust.demo;


public class Student {
    private String ID;
    private String Name;
    private String Age;
    private String HomeLocation;


    public Student() {
    }

    public Student(String ID, String name, String age, String home_Location) {
        this.ID = ID;
        Name = name;
        Age = age;
        HomeLocation = home_Location;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getHomeLocation() {
        return HomeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        HomeLocation = homeLocation;
    }

    public String toString() {
        return "ID: " + getID() + ", Name: " + Name + ", Age: " + Age + ", HomeLocation: " + HomeLocation;
    }

}
