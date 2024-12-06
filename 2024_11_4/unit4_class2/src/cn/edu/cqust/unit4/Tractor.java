package cn.edu.cqust.unit4;

import java.util.Scanner;

public class Tractor {
    public void plough() {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.journey);
        System.out.println(vehicle.wheelNum);
        System.out.println(vehicle.loadNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        
        Vehicle vehicle = new Vehicle();
        vehicle.driveAt(speed);

    }

}
