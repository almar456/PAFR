package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import domain.DomainFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class NewPWagonController {

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
    private TextField seatInput;

    @FXML
    private TextField silentInput;

    @FXML
    private TextField toiletInput;

    @FXML
    private TextField weightInput;


    @FXML
    void onCancelClick(ActionEvent event) {
    }

    @FXML
    void onCreateClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	dfc.addPWagon(Integer.parseInt(seatInput.getText()), Boolean.parseBoolean(silentInput.getText()),
    			Double.parseDouble(lengthInput.getText()), Boolean.parseBoolean(toiletInput.getText()),
				companyInput.getText(), Double.parseDouble(weightInput.getText()));
    }

    @FXML
    void initialize() {
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert companyInput != null : "fx:id=\"companyInput\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert createButton != null : "fx:id=\"createButton\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert lengthInput != null : "fx:id=\"lengthInput\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert seatInput != null : "fx:id=\"seatInput\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert silentInput != null : "fx:id=\"silentInput\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert toiletInput != null : "fx:id=\"toiletInput\" was not injected: check your FXML file 'NewPWagon.fxml'.";
        assert weightInput != null : "fx:id=\"weightInput\" was not injected: check your FXML file 'NewPWagon.fxml'.";


    }

}
