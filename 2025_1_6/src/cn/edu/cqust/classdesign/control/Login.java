package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.util.DButil;
import cn.edu.cqust.classdesign.util.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Login {

    @FXML
    private TextField account;

    @FXML
    private PasswordField password;

    @FXML
    private Label error_information;

    @FXML
    public void initialize() {

    }

    @FXML
    public void doLogin() throws SQLException {

        if(Tools.isEmpty(account.getText())) {
            error_information.setText("请输入账号！！");
            error_information.setVisible(true);
            return;
        }

        if(Tools.isEmpty(password.getText())) {
            error_information.setText("请输入密码！！");
            error_information.setVisible(true);
            return;
        }

        if(DButil.login(account.getText(), password.getText(), false)) {
            //登录成功，进入下一页面
            Main.changeview("view/main.fxml");
        } else{
            error_information.setText("登录失败，账号或密码错误！！");
            error_information.setVisible(true);
        }
    }

    @FXML
    public void goregister() throws SQLException {
        Main.changeview("view/register.fxml");
    }

    @FXML
    public void doexchange() {
        Main.changeview("view/admin_login.fxml");
    }
}
