package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import domain.DomainFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class NewTrainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField companyInput;

    @FXML
    private Button createButton;

    @FXML
    private TextField lengthInput;

    @FXML
    private TextField propInput;

    @FXML
    private TextField speedInput;

    @FXML
    private TextField weightInput;


    @FXML
    void onCancelClick(ActionEvent event) {
    }

    @FXML
    void onCreateClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	dfc.addTrain(Double.parseDouble(lengthInput.getText()), Double.parseDouble(weightInput.getText()), propInput.getText(), Integer.parseInt(speedInput.getText()), companyInput.getText());
    }

    @FXML
    void initialize() {
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'NewTrain.fxml'.";
        assert companyInput != null : "fx:id=\"companyInput\" was not injected: check your FXML file 'NewTrain.fxml'.";
        assert createButton != null : "fx:id=\"createButton\" was not injected: check your FXML file 'NewTrain.fxml'.";
        assert lengthInput != null : "fx:id=\"lengthInput\" was not injected: check your FXML file 'NewTrain.fxml'.";
        assert propInput != null : "fx:id=\"propInput\" was not injected: check your FXML file 'NewTrain.fxml'.";
        assert speedInput != null : "fx:id=\"speedInput\" was not injected: check your FXML file 'NewTrain.fxml'.";
        assert weightInput != null : "fx:id=\"weightInput\" was not injected: check your FXML file 'NewTrain.fxml'.";


    }

}
