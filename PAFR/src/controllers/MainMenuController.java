package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button newTrainButton;

    @FXML
    private Button newWagonButton;

    @FXML
    private Button viewTrainsButton;

    @FXML
    private Button viewWagonsButton;


    @FXML
    void onNewTrainClick(ActionEvent event) {
    }

    @FXML
    void onNewWagonClick(ActionEvent event) {
    }

    @FXML
    void onViewTrainsClick(ActionEvent event) {
    }

    @FXML
    void onViewWagonsClick(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert newTrainButton != null : "fx:id=\"newTrainButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert newWagonButton != null : "fx:id=\"newWagonButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert viewTrainsButton != null : "fx:id=\"viewTrainsButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert viewWagonsButton != null : "fx:id=\"viewWagonsButton\" was not injected: check your FXML file 'MainMenu.fxml'.";


    }

}
