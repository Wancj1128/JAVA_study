package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SuccessControl {
    @FXML
    private Label infor;

    @FXML
    public void initialize() {

    }

    @FXML
    public void donext() {
        Main.changeview("view/login.fxml");
    }

}
