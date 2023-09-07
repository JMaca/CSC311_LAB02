package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setStyle("-fx-text-fill: RED;");
    }
    @FXML
    protected void nameBtnOnAction(){
        welcomeText.setText("JOHN MACA");
        welcomeText.setStyle("-fx-text-fill: PURPLE;-fx-rotate: 20");

    }
}