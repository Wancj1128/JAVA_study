package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.util.DButil;
import cn.edu.cqust.classdesign.util.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class admincontrol {
    @FXML
    private TextField admin;

    @FXML
    private TextField password;

    @FXML
    private Label errorinfo;

    @FXML
    public void initialize() {

    }

    @FXML
    public void doadmin_login() {
        try {
            if (Tools.isEmpty(admin.getText())) {
                errorinfo.setText("账号为空！");
                errorinfo.setVisible(true);
                return;
            }

            if (Tools.isEmpty(password.getText())) {
                errorinfo.setText("密码为空！");
                errorinfo.setVisible(true);
                return;
            }

            if (DButil.login(admin.getText(), password.getText(), true)){
                //进入下页
                Main.changeview("view/admin.fxml");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
