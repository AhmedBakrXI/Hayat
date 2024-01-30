package com.example.hayat;


import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class HelloController {
    public static Stage myStage;
    private double x, y;


    public void dragWindow(MouseEvent mouseEvent) {
        myStage.setX(mouseEvent.getScreenX() - x);
        myStage.setY(mouseEvent.getScreenY() - y);
    }

    public void pressWindow(MouseEvent mouseEvent) {
        x = mouseEvent.getSceneX();
        y = mouseEvent.getSceneY();
    }

}