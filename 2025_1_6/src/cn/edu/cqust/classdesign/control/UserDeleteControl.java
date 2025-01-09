package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.util.DButil;
import cn.edu.cqust.classdesign.util.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UserDeleteControl {

    @FXML
    private TextField delete_username;

    @FXML
    private Label errorinfo;

    //删除操作
    @FXML
    public void DoNext(){
        if(Tools.isEmpty(delete_username.getText())){
            errorinfo.setText("用户名未填写！");
            errorinfo.setVisible(true);
            return;
        }

        if (DButil.user_isin(delete_username.getText())){
            DButil.del_user(delete_username.getText());
            return;
        }

        if(!DButil.user_isin(delete_username.getText())){
            errorinfo.setText("此用户不存在");
            errorinfo.setVisible(true);
            delete_username.setText("");
        }


    }
}
