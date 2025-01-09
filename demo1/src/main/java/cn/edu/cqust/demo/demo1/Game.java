package cn.edu.cqust.demo.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.Random;

public class Game extends Application {
    private char currentLetter; // 当前显示的字母
    private int score = 0; // 用户得分
    private Label letterLabel = new Label(); // 显示随机字母
    private Label scoreLabel = new Label("得分: 0"); // 显示得分

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // 设置主窗口标题
        primaryStage.setTitle("打字母游戏");

        // 显示字母的标签
        Label displayTextLabel = new Label("显示字母: ");
        letterLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // 输入框
        TextField inputField = new TextField();
        inputField.setPromptText("输入所显示的字母并按回车");
        inputField.setStyle("-fx-font-size: 16px;");

        // 布局
        VBox vbox = new VBox(10, displayTextLabel, letterLabel, inputField, scoreLabel);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // 定时器每隔2秒生成一个随机字母
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            currentLetter = (char) ('a' + new Random().nextInt(26));
            letterLabel.setText(String.valueOf(currentLetter));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        // 处理用户输入
        inputField.setOnAction(event -> {
            String userInput = inputField.getText();
            if (userInput.length() == 1 && userInput.charAt(0) == currentLetter) {
                score++; // 正确输入得1分
            }
            scoreLabel.setText("得分: " + score); // 更新得分
            inputField.clear(); // 清空输入框
        });

        // 设置场景和显示窗口
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
