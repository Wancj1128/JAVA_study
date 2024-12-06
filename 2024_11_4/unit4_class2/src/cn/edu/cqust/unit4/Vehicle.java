package cn.edu.cqust.unit4;

public class Vehicle {
    public float journey;
    public int wheelNum;
    public int loadNum;
    public int driveSpeed;

    public Vehicle() {
        journey = 100.3f;
        wheelNum = 4;
        loadNum = 1;


    }
    public void driveAt(int speed) {
        if (speed >= 60 ) {
            System.out.println("机动车速度太快，容易造成事故");
            //如果要求的车速太快,则机动车自动以40单位速度行驶
            driveSpeed = 40;
        }
        else {
            System.out.println("您在安全的速度下行驶");
            driveSpeed = speed;
        }
    }
}
