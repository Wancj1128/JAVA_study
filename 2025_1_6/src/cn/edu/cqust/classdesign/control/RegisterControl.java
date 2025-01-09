package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.data.User;
import cn.edu.cqust.classdesign.util.DButil;
import cn.edu.cqust.classdesign.util.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.sql.SQLException;

public class RegisterControl {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private TextField confirm;

    @FXML
    private TextField tel;

    @FXML
    private Text errorinfo;

    @FXML
    private CheckBox highlevel;

    @FXML
    private void initialize() {

    }

    @FXML
    public void doregister() {

        if (Tools.isEmpty(username.getText())) {
            errorinfo.setText("用户名为空");
            errorinfo.setVisible(true);
            return;
        }

        if (Tools.isEmpty(password.getText())
                || Tools.isEmpty(confirm.getText())) {
            errorinfo.setText("密码为空");
            errorinfo.setVisible(true);
            return;
        }

        if (Tools.isEmpty(tel.getText())) {
            errorinfo.setText("电话号码为空");
            errorinfo.setVisible(true);
            return;
        }

        if (password.getText().equals(confirm.getText())) {
            User user = new User();
            user.setLevel(highlevel.isSelected());
            user.setUname(username.getText());
            user.setPassword(password.getText());
            user.setTel(tel.getText());
            try {
                if(DButil.register(user)) {
                    Main.changeview("view/RegisterSuccess.fxml");
                }
            }catch (SQLException e) {e.printStackTrace();}
        }else {
            errorinfo.setText("两次输入的密码不一样！");
            errorinfo.setVisible(true);
        }
    }
}
