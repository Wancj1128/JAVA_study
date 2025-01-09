package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.data.product;
import cn.edu.cqust.classdesign.util.DButil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class MainControl {

    @FXML
    private TableView<product> product_view;

    @FXML
    private TableColumn<product, String> name;

    @FXML
    private TableColumn<product, String> brand;

    @FXML
    private TableColumn<product, String> model;

    @FXML
    private TableColumn<product, String> number;

    @FXML
    private TableColumn<product, String> price;

    @FXML
    private TableColumn<product, String> company_name;

    @FXML
    private TableColumn<product, String> home_loca;

    @FXML
    private TableColumn<product, String> tel_number;

    @FXML
    private TableColumn<product, String> Contact_people;


    @FXML
    public void initialize() {
        ObservableList<product> list = FXCollections.observableArrayList();
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        brand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        model.setCellValueFactory(new PropertyValueFactory<>("model"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        company_name.setCellValueFactory(new PropertyValueFactory<>("company_name"));
        home_loca.setCellValueFactory(new PropertyValueFactory<>("location"));
        tel_number.setCellValueFactory(new PropertyValueFactory<>("tel_number"));
        Contact_people.setCellValueFactory(new PropertyValueFactory<>("Contact_people"));

        list.addAll(DButil.readData());
        product_view.setItems(list);
    }

    @FXML
    public void DoAddProduct() {
        Main.changeview("view/addproduct.fxml");
    }

    @FXML
    public void DoDeletProduct() {
        Main.changeview("view/deleteproduct.fxml");
    }

    @FXML
    public void DoUpdateProduct() {
        Main.changeview("view/updateproduct.fxml");
    }
}
