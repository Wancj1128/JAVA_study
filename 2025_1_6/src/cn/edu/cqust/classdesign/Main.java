package cn.edu.cqust.classdesign;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Main extends Application {

    private static Stage stage;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        Main.stage = stage;
        stage.setTitle("耗材管理系统");
        changeview("view/login.fxml");
        stage.show();
    }

    public static void changeview(String fxml){
        try{
            Parent root = FXMLLoader.load(Main.class.getResource(fxml));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
