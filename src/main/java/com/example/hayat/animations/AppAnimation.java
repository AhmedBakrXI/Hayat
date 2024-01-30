package com.example.hayat.animations;

import javafx.animation.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class AppAnimation {
    public static void circleAnimation(Pane root, double radius) {
        Circle blackCircle = new Circle(radius);
        Color paint = new Color(0.0784, 0.0784, 0.0784, 0.2196);
        blackCircle.setFill(paint);
        root.getChildren().add(blackCircle);


        Timeline timeline = new Timeline();
        timeline.setCycleCount(Animation.INDEFINITE);
        KeyValue keyValue = new KeyValue(blackCircle.radiusProperty(), 140, Interpolator.EASE_OUT);
        KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), keyValue);
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
    }

    public static void wavyCircles(Pane root) {
        AppAnimation.circleAnimation(root, 5);
        AppAnimation.circleAnimation(root, 15);
        AppAnimation.circleAnimation(root, 25);
        AppAnimation.circleAnimation(root, 35);
        AppAnimation.circleAnimation(root, 45);
    }
}
