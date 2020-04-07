package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import domain.DomainFacade;
import domain.FreightWagon;
import domain.FreightWagonBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FreightWagonOverviewController {

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private TextField cargoInput;

    @FXML
    private TextField companyInput;

    @FXML
    private Label idLabel;

    @FXML
    private TextField lengthInput;

    @FXML
    private Label responseLabel;

    @FXML
    private TextField statusInput;

    @FXML
    private Button submitButton;
    
    @FXML
    private Button deleteButton;

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
    void onSubmitClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if(dfc.updateFW(Integer.parseInt(idLabel.getText()), Double.parseDouble(lengthInput.getText()), Double.parseDouble(weightInput.getText()), cargoInput.getText(), companyInput.getText(), statusInput.getText())) {
    		responseLabel.setText("Wagon succesfully updated.");
    	} else {
    		responseLabel.setText("Something went wrong, wagon not updated.");
    	};
    }
    
    @FXML
    void onDeleteClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if(dfc.deleteFWFromDb(Integer.parseInt(idLabel.getText()))) {
    		responseLabel.setText("Wagon succesfully deleted.");
    	} else {
    		responseLabel.setText("Something went wrong, wagon not deleted.");
    	};
    }
    
    @FXML
    void onDcClick(ActionEvent event) {
    	DomainFacade dfc = new DomainFacade();
    	if (dfc.disconnectFW(Integer.parseInt(idLabel.getText()))) {
    		responseLabel.setText("Wagon disconnected succesfully.");
    		trainIdLabel.setText(""+0);
    	} else {
    		responseLabel.setText("Something went wrong, wagon not disconnected.");
    	}
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert cargoInput != null : "fx:id=\"cargoInput\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert companyInput != null : "fx:id=\"companyInput\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert idLabel != null : "fx:id=\"idLabel\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert lengthInput != null : "fx:id=\"lengthInput\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert responseLabel != null : "fx:id=\"responseLabel\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert statusInput != null : "fx:id=\"statusInput\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert weightInput != null : "fx:id=\"weightInput\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert yearLabel != null : "fx:id=\"yearLabel\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";
        assert trainIdLabel != null : "fx:id=\"trainIdLabel\" was not injected: check your FXML file 'FreightWagonOverview.fxml'.";

        DomainFacade df = new DomainFacade();
        FreightWagon fw = df.getFWFromDb(5);
        
        yearLabel.setText(""+fw.getConstructionYear());
        idLabel.setText(""+fw.getId());
        trainIdLabel.setText(""+fw.getTrainId());
        cargoInput.setText(fw.getCargo());
        statusInput.setText(fw.getStatus());
        companyInput.setText(fw.getCompany());
        weightInput.setText(""+fw.getWeight());
        lengthInput.setText(""+fw.getLength());
    }

}
