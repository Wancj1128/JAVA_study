package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.data.User;
import cn.edu.cqust.classdesign.util.DButil;
import cn.edu.cqust.classdesign.util.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class UpdateUser_control {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private TextField tel_number;

    @FXML
    private Label errorinfo;

    public void initialize() {

    }

    @FXML
    public void do_update() {
        if (Tools.isEmpty(username.getText())){
            errorinfo.setText("用户名为空");
            errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(password.getText())){
            errorinfo.setText("密码为空");
            errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(tel_number.getText())){
            errorinfo.setText("手机号为空");
            errorinfo.setVisible(true);
            return;
        }
        if (!DButil.user_isin(username.getText())){
            //System.out.println("用户不存在");
            errorinfo.setText("此用户不存在");
            errorinfo.setVisible(true);
            username.setText("");
            return;
        }
        if (DButil.user_isin(username.getText())){
            System.out.println("用户存在");
            User user = new User();
            user.setUname(username.getText());
            user.setPassword(password.getText());
            user.setTel(tel_number.getText());
            DButil.update_user(user, username.getText());
        }
    }
}
