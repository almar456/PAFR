package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import domain.DomainFacade;
import domain.FreightWagon;
import domain.PassengerWagon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PassengerWagonOverviewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private Label responseLabel;

    @FXML
    private TextField seatInput;

    @FXML
    private TextField silentInput;

    @FXML
    private TextField statusInput;

    @FXML
    private Button submitButton;

    @FXML
    private TextField toiletInput;

    @FXML
    private TextField weightInput;

    @FXML
    private Label yearLabel;
    
    @FXML
    private Label trainIdLabel;


    @FXML
    void onBackClick(ActionEvent event) {
    }

    @FXML
    void onDeleteClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if(dfc.deletePWFromDb(Integer.parseInt(idLabel.getText()))) {
    		responseLabel.setText("Wagon succesfully deleted.");
    	} else {
    		responseLabel.setText("Something went wrong, wagon not deleted.");
    	};
    }

    @FXML
    void onSubmitClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if(dfc.updatePW(Integer.parseInt(idLabel.getText()), Double.parseDouble(lengthInput.getText()), Double.parseDouble(weightInput.getText()),
    			Integer.parseInt(seatInput.getText()), Boolean.parseBoolean(silentInput.getText()),
    			Boolean.parseBoolean(toiletInput.getText()), companyInput.getText(), statusInput.getText())) {
    		responseLabel.setText("Wagon succesfully updated.");
    	} else {
    		responseLabel.setText("Something went wrong, wagon not updated.");
    	};
    }
    
    @FXML
    void onDcClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if (dfc.disconnectPW(Integer.parseInt(idLabel.getText()))) {
    		responseLabel.setText("Wagon disconnected succesfully.");
    		trainIdLabel.setText(""+0);
    	} else {
    		responseLabel.setText("Something went wrong, wagon not disconnected.");
    	}
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert companyInput != null : "fx:id=\"companyInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert lengthInput != null : "fx:id=\"lengthInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert responseLabel != null : "fx:id=\"responseLabel\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert seatInput != null : "fx:id=\"seatInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert silentInput != null : "fx:id=\"silentInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert statusInput != null : "fx:id=\"statusInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert toiletInput != null : "fx:id=\"toiletInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert weightInput != null : "fx:id=\"weightInput\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert yearLabel != null : "fx:id=\"yearLabel\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";
        assert trainIdLabel != null : "fx:id=\"trainIdLabel\" was not injected: check your FXML file 'PassengerWagonOverview.fxml'.";

        DomainFacade df = new DomainFacade();
        PassengerWagon pw = df.getPWFromDb(5);
        
        yearLabel.setText(""+pw.getConstructionYear());
        idLabel.setText(""+pw.getId());
        seatInput.setText(""+pw.getAmountSeats());
        silentInput.setText(""+pw.getSilent());
        toiletInput.setText(""+pw.getToilet());
        statusInput.setText(pw.getStatus());
        companyInput.setText(pw.getCompany());
        weightInput.setText(""+pw.getWeight());
        lengthInput.setText(""+pw.getLength());
        trainIdLabel.setText(""+pw.getTrainId());
    }

}