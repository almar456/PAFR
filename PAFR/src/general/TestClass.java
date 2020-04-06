package general;

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

public class Testclass extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	try {
		FXMLLoader loader = new FXMLLoader(new File("C:\\Users\\Almar\\PAFR\\PAFR\\resources\\NewTrain.fxml").toURI().toURL());
		Parent root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    } 
       catch(Exception e)    {
        e.printStackTrace();
    }
	}
       
    public static void main(String[] args) {
    //JavaFX test
    launch(args);
    
    //PostgresDB train test	
    TrainPostgresDAOImpl tt1 = new TrainPostgresDAOImpl();
    tt1.addTrain("Thalys", 9, 2000, 20000, "Electric", 230, 2012, "Prorail");
    	
	//PostgresDB FreightWagon test	
    FreightWagonPostgresDAOImpl fwt1 = new FreightWagonPostgresDAOImpl();
    fwt1.addFreightWagon("Freight", 4, 1500, 4000, "Graafmachines", "NS", 1992);
    	
	//PostgresDB PassengerWagon test	
    PassengerWagonPostgresDAOImpl pwt1 = new PassengerWagonPostgresDAOImpl();
    pwt1.addPassengerWagon("Passenger", 50, true, 4000, true, "NS", 1992, 2500);
    }
}
