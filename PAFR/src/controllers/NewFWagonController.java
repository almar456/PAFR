package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import domain.DomainFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class NewFWagonController {

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
    private TextField cargoInput;

    @FXML
    private TextField weightInput;


    @FXML
    void onCancelClick(ActionEvent event) {
    }

    @FXML
    void onCreateClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	dfc.addFWagon(Double.parseDouble(lengthInput.getText()), Double.parseDouble(weightInput.getText()), cargoInput.getText(), companyInput.getText());
    }

    @FXML
    void initialize() {
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'NewFWagon.fxml'.";
        assert companyInput != null : "fx:id=\"companyInput\" was not injected: check your FXML file 'NewFWagon.fxml'.";
        assert createButton != null : "fx:id=\"createButton\" was not injected: check your FXML file 'NewFWagon.fxml'.";
        assert lengthInput != null : "fx:id=\"lengthInput\" was not injected: check your FXML file 'NewFWagon.fxml'.";
        assert cargoInput != null : "fx:id=\"cargoInput\" was not injected: check your FXML file 'NewFWagon.fxml'.";
        assert weightInput != null : "fx:id=\"weightInput\" was not injected: check your FXML file 'NewFWagon.fxml'.";


    }

}
