package com.example.hayat;

import com.example.hayat.animations.AppAnimation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane root = fxmlLoader.load();
        double arcRadius = 250.0;
        Rectangle rectangle = new Rectangle(145, 140);
        rectangle.setArcWidth(arcRadius);
        rectangle.setArcHeight(arcRadius);
        root.setClip(rectangle);
        Scene scene = new Scene(root, Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        HelloController.myStage = stage;
        AppAnimation.wavyCircles(root);
    }
}