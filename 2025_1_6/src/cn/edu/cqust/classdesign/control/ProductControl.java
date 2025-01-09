package cn.edu.cqust.classdesign.control;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.data.product;
import cn.edu.cqust.classdesign.util.DButil;
import cn.edu.cqust.classdesign.util.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProductControl {
    @FXML
    private TextField name;

    @FXML
    private TextField brand;

    @FXML
    private TextField model;

    @FXML
    private TextField number;

    @FXML
    private TextField price;

    @FXML
    private TextField company;

    @FXML
    private TextField home_loc;

    @FXML
    private TextField tel_number;

    @FXML
    private TextField people;

    @FXML
    private Label errorinfo;

    @FXML
    public void initialize() {

    }

    @FXML
    public void do_add_product() {

        if (name.getText().isEmpty()){
            errorinfo.setText("耗材名称未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (brand.getText().isEmpty()){
            errorinfo.setText("品牌名称未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (DButil.is_in(model.getText())){
            errorinfo.setText("此型号耗材不存在，重新输入");
            errorinfo.setVisible(true);
            model.setText("");
            return;
        }

        if (model.getText().isEmpty()){
            errorinfo.setText("型号名称未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (number.getText().isEmpty()){
            errorinfo.setText("数量未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (price.getText().isEmpty()){
            errorinfo.setText("价格未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (company.getText().isEmpty()){
            errorinfo.setText("供应商未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (home_loc.getText().isEmpty()){
            errorinfo.setText("地址未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (tel_number.getText().isEmpty()){
            errorinfo.setText("电话号码未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (people.getText().isEmpty()){
            errorinfo.setText("联系人未填写");
            errorinfo.setVisible(true);
            return;
        }

        if (!DButil.is_in(model.getText())){
            product p = new product();
            p.setName(name.getText());
            p.setBrand(brand.getText());
            p.setModel(model.getText());
            p.setNumber(number.getText());
            p.setPrice(price.getText());
            p.setCompany_name(company.getText());
            p.setLocation(home_loc.getText());
            p.setTel_number(tel_number.getText());
            p.setContact_people(people.getText());
            DButil.add(p);
        }
    }

    //删除操作
    @FXML
    private TextField delete_model;

    @FXML
    private Label delete_errorinfo;

    @FXML
    public void do_delete_produte() {

        if (Tools.isEmpty(delete_model.getText())){
            delete_errorinfo.setText("型号未填写");
            delete_errorinfo.setVisible(true);
            return;
        }

        if (!DButil.is_in(delete_model.getText())){
            delete_errorinfo.setText("此型号耗材不存在，重新输入");
            delete_errorinfo.setVisible(true);
            delete_model.setText("");
            return;
        }

        if (DButil.is_in(delete_model.getText())){
            DButil.del_Product(delete_model.getText());
        }
    }


    //修改操作

    @FXML
    private TextField update_name;

    @FXML
    private TextField update_brand;

    @FXML
    private TextField update_model;

    @FXML
    private  TextField update_number;

    @FXML
    private  TextField update_price;

    @FXML
    private  TextField update_company;

    @FXML
    private  TextField update_home_loca;

    @FXML
    private  TextField update_tel_number;

    @FXML
    private  TextField update_people;

    @FXML
    private  Label update_errorinfo;

    @FXML
    public void doupdate() {
        if (Tools.isEmpty(update_model.getText())){
            update_errorinfo.setText("型号未填写");
            update_errorinfo.setVisible(true);
        }

        if (!DButil.is_in(update_model.getText())){
            update_errorinfo.setText("此型号不存在，请重新输入");
            update_errorinfo.setVisible(true);
            update_model.setText("");
        }

        if (Tools.isEmpty(update_name.getText())){
            update_errorinfo.setText("耗材名称未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(update_brand.getText())){
            update_errorinfo.setText("品牌未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(update_number.getText())){
            update_errorinfo.setText("数量未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(update_price.getText())){
            update_errorinfo.setText("价格未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(update_company.getText())){
            update_errorinfo.setText("供应商公司名未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(update_home_loca.getText())){
            update_errorinfo.setText("地址未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (Tools.isEmpty(update_price.getText())){
            update_errorinfo.setText("联系人未填写");
            update_errorinfo.setVisible(true);
            return;
        }
        if (DButil.is_in(update_model.getText())){
            product p = new product();
            p.setName(update_name.getText());
            p.setBrand(update_brand.getText());
            p.setModel(update_model.getText());
            p.setNumber(update_number.getText());
            p.setPrice(update_price.getText());
            p.setCompany_name(update_company.getText());
            p.setLocation(update_home_loca.getText());
            p.setTel_number(update_tel_number.getText());
            p.setContact_people(update_people.getText());
            DButil.update_product(p, update_model.getText());
        }
    }
}
