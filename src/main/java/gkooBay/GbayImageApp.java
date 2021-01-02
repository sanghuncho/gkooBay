package gkooBay;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GbayImageApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("gbay.fxml"));
        primaryStage.setTitle("GbayImageApp");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}