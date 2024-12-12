package cn.edu.cqust.text2;

public class Vehicle {
    public float journey;
    public int wheelNum;
    public int loadNum;
    public int driveSpeed;

    public Vehicle(){
        journey = 100.3f;
        wheelNum = 4;
        loadNum = 1;

    }

    public void driveAt(int speed){
        if (speed >= 60){
            System.out.println("行车速度过快，容易造成事故。");
            //如果要求的车速过快，则机动车自动以40单位速度行驶。
            driveSpeed = 40;
        }
        else {
            System.out.println("您在安全的速度范围内行驶");
            driveSpeed = speed;
        }
    }
}
