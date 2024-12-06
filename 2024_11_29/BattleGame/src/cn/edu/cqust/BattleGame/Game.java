package cn.edu.cqust.BattleGame;

import cn.edu.cqust.BattleGame.data.Player;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("格斗游戏");

        Player player1 = new Player();
        Player player2 = new Player();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入PLAYER1的姓名");
        player1.setName(sc.nextLine());
        System.out.println("请输入PLAYER2的姓名");
        player2.setName(sc.nextLine());
        System.out.println("游戏开始：");
        while(player1.HP == 0 || player2.HP == 0){
            System.out.println("Player1选择：1：攻击；2：恢复血量");
            Scanner sc1 = new Scanner(System.in);
            int chose = sc1.nextInt();

            //PLAYER1打PLAYER2:
            switch (chose){
                case 1:
                    System.out.println(player1.getName() + "举起拳头打了" + player2.getName() + "一下" );
                    player2.loseHP();
                case 2:
                    System.out.println(player1.getName() + "恢复了血量");
                    player1.getHP();
            }


        }

        System.out.println(player1.getName());
    }
}
