package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


public class ViewTrainsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private ComboBox<?> trainInput;

    @FXML
    private Button viewButton;


    @FXML
    void onBackClick(ActionEvent event) {
    }

    @FXML
    void onViewClick(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ViewTrains.fxml'.";
        assert trainInput != null : "fx:id=\"trainInput\" was not injected: check your FXML file 'ViewTrains.fxml'.";
        assert viewButton != null : "fx:id=\"viewButton\" was not injected: check your FXML file 'ViewTrains.fxml'.";


    }

}
