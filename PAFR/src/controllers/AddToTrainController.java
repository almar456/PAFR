package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import domain.DomainFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class AddToTrainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Label trainIdLabel;
    
    @FXML
    private Label responseLabel;
    
    @FXML
    private ComboBox<String> wagonInput;


    @FXML
    void onAddClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if (dfc.addUWagon(wagonInput.getValue().split(" ")[0], Integer.parseInt(wagonInput.getValue().split(" ")[1]),
    			Integer.parseInt(trainIdLabel.getText()))) {
    		responseLabel.setText("Wagon successfully added.");
    	} else {
    		responseLabel.setText("Something went wrong, wagon not added.");
    	}
    }

    @FXML
    void onCancelClick(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'AddToTrain.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'AddToTrain.fxml'.";
        assert trainIdLabel != null : "fx:id=\"trainIdLabel\" was not injected: check your FXML file 'AddToTrain.fxml'.";
        assert responseLabel != null : "fx:id=\"responseLabel\" was not injected: check your FXML file 'AddToTrain.fxml'.";
        assert wagonInput != null : "fx:id=\"wagonInput\" was not injected: check your FXML file 'AddToTrain.fxml'.";

        DomainFacade df = new DomainFacade();
        ArrayList<String> lst = df.getIdsByTrain(0);
        
        trainIdLabel.setText("1");
        wagonInput.getItems().addAll(lst);
        wagonInput.getSelectionModel().select(0);
    }

}
