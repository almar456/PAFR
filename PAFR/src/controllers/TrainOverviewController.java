package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import domain.DomainFacade;
import domain.Train;
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
    private ComboBox<String> wagonInput;

    @FXML
    private TextField weightInput;
    
    @FXML
    private TextField speedInput;

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
    	DomainFacade dfc = new DomainFacade();
    	if(dfc.deleteTrainFromDb(Integer.parseInt(idLabel.getText()))) {
    		responseLabel.setText("Train succesfully deleted.");
    	} else {
    		responseLabel.setText("Something went wrong, train not deleted.");
    	};
    }

    @FXML
    void onSubmitClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if(dfc.updateTrain(Integer.parseInt(idLabel.getText()), Double.parseDouble(lengthInput.getText()), Double.parseDouble(weightInput.getText()), propInput.getText(), Double.parseDouble(speedInput.getText()), companyInput.getText(), statusInput.getText())) {
    		responseLabel.setText("Train succesfully updated.");
    	} else {
    		responseLabel.setText("Something went wrong, train not updated.");
    	};
    }
    
    @FXML
    void onCWagonClick(ActionEvent event) {
        System.out.print(wagonInput.getValue());
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
        assert speedInput != null : "fx:id=\"speedInput\" was not injected: check your FXML file 'TrainOverview.fxml'.";
        
        DomainFacade dfc = new DomainFacade();
        
        Train tr = dfc.getTrainFromDb(1);
        
        yearLabel.setText(""+tr.getConstructionYear());
        idLabel.setText(""+tr.getId());
        speedInput.setText(""+tr.getMaxSpeed());
        propInput.setText(tr.getPropulsion());
        statusInput.setText(tr.getStatus());
        companyInput.setText(tr.getCompany());
        weightInput.setText(""+tr.getWeight());
        lengthInput.setText(""+tr.getLength());
        ArrayList<String> lst = dfc.getIdsByTrain(Integer.parseInt(idLabel.getText()));
        
        wagonInput.getItems().addAll(lst);
        wagonInput.getSelectionModel().select(0);
    }

}

