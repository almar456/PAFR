package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


public class ViewWagonsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private Button viewButton;

    @FXML
    private ComboBox<?> wagonInput;


    @FXML
    void onBackClick(ActionEvent event) {
    }

    @FXML
    void onViewClick(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ViewTrains.fxml'.";
        assert viewButton != null : "fx:id=\"viewButton\" was not injected: check your FXML file 'ViewTrains.fxml'.";
        assert wagonInput != null : "fx:id=\"wagonInput\" was not injected: check your FXML file 'ViewTrains.fxml'.";


    }

}

