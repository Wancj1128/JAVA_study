package cn.edu.cqust.BattleGame.data;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    public int HP = 100;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int loseHP(){
        Random rand = new Random();
        int Hurt = rand.nextInt(20);
        HP -= Hurt;
        return HP;
    }

    public int getHP(){
        Random rand = new Random();
        int recover =rand.nextInt(10);
        HP += recover;
        return HP;
    }

    public void Choose(String name1, String name2){
        if(){

        }
    }
}
