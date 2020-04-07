package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class TrainOverviewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Button backButton;

    @FXML
    private TextField companyInput;

    @FXML
    private Button deleteButton;

    @FXML
    private Label idLabel;

    @FXML
    private TextField lengthInput;

    @FXML
    private TextField propInput;

    @FXML
    private Label responseLabel;

    @FXML
    private TextField statusInput;

    @FXML
    private Button submitButton;

    @FXML
    private ComboBox<?> wagonInput;

    @FXML
    private TextField weightInput;

    @FXML
    private Label yearLabel;


    @FXML
    void onAddClick(ActionEvent event) {
    }

    @FXML
    void onBackClick(ActionEvent event) {
    }

    @FXML
    void onDeleteClick(ActionEvent event) {
    }

    @FXML
    void onSubmitClick(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert companyInput != null : "fx:id=\"companyInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert lengthInput != null : "fx:id=\"lengthInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert propInput != null : "fx:id=\"propInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert responseLabel != null : "fx:id=\"responseLabel\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert statusInput != null : "fx:id=\"statusInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert wagonInput != null : "fx:id=\"wagonInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert weightInput != null : "fx:id=\"weightInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        assert yearLabel != null : "fx:id=\"yearLabel\" was not injected: check your FXML file 'TrainOverview.fxml'.";


    }

}

