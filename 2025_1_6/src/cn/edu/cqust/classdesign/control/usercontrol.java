package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.data.User;
import cn.edu.cqust.classdesign.data.product;
import cn.edu.cqust.classdesign.util.DButil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.text.TabableView;

public class usercontrol {

    @FXML
    private TableView<User> userview;

    @FXML
    private TableColumn<User,String> username;

    @FXML
    private TableColumn user_password;

    @FXML
    private TableColumn user_tel_number;

    @FXML
    public void initialize() {
        ObservableList<User> list = FXCollections.observableArrayList();
        username.setCellValueFactory(new PropertyValueFactory<>("uname"));
        user_password.setCellValueFactory(new PropertyValueFactory<>("password"));
        user_tel_number.setCellValueFactory(new PropertyValueFactory<>("tel"));
        list.addAll(DButil.readUser());
        userview.setItems(list);
    }
    @FXML
    public void adduser() {
        Main.changeview("view/register.fxml");
    }

    @FXML
    public void updateuser() {
        Main.changeview("view/updateUser.fxml");
    }

    @FXML
    public void deletuser() {
        Main.changeview("view/deleteUser.fxml");
    }

    @FXML
    public void exit() {
        Main.changeview("view/login.fxml");
    }

}
