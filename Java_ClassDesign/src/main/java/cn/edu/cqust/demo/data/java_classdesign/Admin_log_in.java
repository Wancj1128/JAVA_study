package cn.edu.cqust.demo.data.java_classdesign;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class Admin_log_in extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("登录界面");

        // 创建 GridPane 布局
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // 创建标签和输入框
        Label userName = new Label("用户名:");
        grid.add(userName, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 0);

        Label pw = new Label("密码:");
        grid.add(pw, 0, 1);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 1);

        // 创建登录和取消按钮
        Button loginBtn = new Button("登录");
        Button cancelBtn = new Button("取消"); // 创建取消按钮

        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().addAll(loginBtn, cancelBtn); // 将两个按钮添加到 HBox
        grid.add(hbBtn, 1, 2);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        // 添加按钮事件处理
        loginBtn.setOnAction(e -> {
            String username = userTextField.getText();
            String password = pwBox.getText();

            if (username.equals("admin") && password.equals("password")) {
                actiontarget.setText("登录成功！");
            } else {
                actiontarget.setText("用户名或密码错误！");
            }
        });

        cancelBtn.setOnAction(e -> {
            primaryStage.close(); // 关闭窗口
            // 或者执行其他取消操作，例如清空输入框
            // userTextField.clear();
            // pwBox.clear();
            // actiontarget.setText("");
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}