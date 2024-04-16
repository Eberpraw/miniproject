package com.example.miniproject;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class AppController {

    @FXML
    private ImageView chickenImage;

    @FXML
    private ImageView brocolliImage;

    @FXML
    public void initialize() {
        // Chicken animation
        ScaleTransition chickenScaleTransition = new ScaleTransition();
        chickenScaleTransition.setDuration(Duration.seconds(2));
        chickenScaleTransition.setNode(chickenImage);
        chickenScaleTransition.setByX(0.2);
        chickenScaleTransition.setByY(0.2);
        chickenScaleTransition.setCycleCount(TranslateTransition.INDEFINITE);
        chickenScaleTransition.setAutoReverse(true);
        chickenScaleTransition.play();

        // Broccoli animation
        ScaleTransition broccoliScaleTransition = new ScaleTransition();
        broccoliScaleTransition.setDuration(Duration.seconds(2));
        broccoliScaleTransition.setNode(brocolliImage);
        broccoliScaleTransition.setByX(-0.1);
        broccoliScaleTransition.setByY(-0.1);
        broccoliScaleTransition.setCycleCount(TranslateTransition.INDEFINITE);
        broccoliScaleTransition.setAutoReverse(true);
        broccoliScaleTransition.play();
    }

    @FXML
    private Button startButton;

    @FXML
    protected void onStartButtonClick() throws IOException {
        // Get current stage
        Stage stage = (Stage) startButton.getScene().getWindow();

        // Load the calculator scene
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 357.27, 774.54);

        // Set the scene and show the stage
        stage.setScene(calculatorScene);
    }
}

