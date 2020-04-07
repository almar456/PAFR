package domain;

import java.io.File;

import java.sql.Connection;
import java.sql.DriverManager;

import javafx.application.Application;
import javafx.stage.Stage;
import persistence.FreightWagonPostgresDAOImpl;
import persistence.PassengerWagonPostgresDAOImpl;
import persistence.TrainPostgresDAOImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Main extends Application{
	
    public static void main(String[] args) {
    Application.launch(args);
    }


	@Override
	public void start(Stage primaryStage) throws Exception {
	try {
		AnchorPane firstPane = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("AddToTrain.fxml"));
		
        primaryStage.setScene(new Scene(firstPane));
        primaryStage.show();
    } 
       catch(Exception e)    {
        e.printStackTrace();
    }
	}    
}
