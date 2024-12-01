package com.example.mp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class ControllerMainViwe {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button InformationLessonsButton;

    @FXML
    private Button analiticDateButton;

    @FXML
    private Button docsButton;

    @FXML
    private Button insideDateBankBut;

    @FXML
    private Text mainText;

    @FXML
    private Button personalDatteBut;


    private Color defaultColor = Color.web("#F7943C");
    private Button currentlySelectedButton = null;


    @FXML
    public void initialize() {
        InformationLessonsButton.setStyle("-fx-background-color: " + colorToHex(defaultColor));
        analiticDateButton.setStyle("-fx-background-color: " + colorToHex(defaultColor));
        docsButton.setStyle("-fx-background-color: " + colorToHex(defaultColor));
        insideDateBankBut.setStyle("-fx-background-color: " + colorToHex(defaultColor));
        personalDatteBut.setStyle("-fx-background-color: " + colorToHex(defaultColor));


        InformationLessonsButton.setOnAction(e -> selectButton(InformationLessonsButton));
        analiticDateButton.setOnAction(e -> selectButton(analiticDateButton));
        docsButton.setOnAction(e -> selectButton(docsButton));
        insideDateBankBut.setOnAction(e -> selectButton(insideDateBankBut));
        personalDatteBut.setOnAction(e -> selectButton(personalDatteBut));

    }

    private void selectButton(Button button) {
        if (currentlySelectedButton != null && currentlySelectedButton != button) {
            currentlySelectedButton.setStyle("-fx-background-color: " + colorToHex(defaultColor));
        }
        currentlySelectedButton = button;
        button.setStyle("-fx-background-color: #C06C30;");
    }

    private String colorToHex(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
}