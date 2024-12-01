package com.example.mp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerAvtor {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button logButtonOnLogWin;

    @FXML
    private TextField logOnRegW;

    @FXML
    private PasswordField paswOnRegW;

    @FXML
    private Button regButtonOnLogWin;

    @FXML
    void initialize() {

        logButtonOnLogWin.setOnAction(e -> {
            try {
                Stage currentStage = (Stage) logButtonOnLogWin.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("main-view.fxml"));
                Scene newScene = new Scene(loader.load());
                Stage newStage = new Stage();
                newStage.setScene(newScene);
                currentStage.close();
                newStage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        regButtonOnLogWin.setOnAction(e -> {
            try {
                Stage currentStage = (Stage) regButtonOnLogWin.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sign-view.fxml"));
                Scene newScene = new Scene(loader.load());
                Stage newStage = new Stage();
                newStage.setScene(newScene);
                currentStage.close();
                newStage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

}