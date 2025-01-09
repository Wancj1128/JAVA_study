package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import javafx.fxml.FXML;

public class usersuccess_control {

    @FXML
    public void DoNext(){
        Main.changeview("view/admin.fxml");
    }

}
