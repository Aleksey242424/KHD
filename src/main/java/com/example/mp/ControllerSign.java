package com.example.mp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerSign {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField emailUsers;

    @FXML
    private TextField lastUserName;

    @FXML
    private Button regButtonOnLogWin;

    @FXML
    private Button registUserButton;

    @FXML
    private TextField secondUserName;

    @FXML
    private TextField userLogin;

    @FXML
    private TextField userName;

    @FXML
    private TextField userPassword;

    @FXML
    void initialize() {
        registUserButton.setOnAction(e -> {
            try {
                Stage currentStage = (Stage) registUserButton.getScene().getWindow();
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

                FXMLLoader loader = new FXMLLoader(getClass().getResource("avtor-view.fxml"));
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
