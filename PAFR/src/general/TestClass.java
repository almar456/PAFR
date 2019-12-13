package general;

import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
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
      launch(args);
    }
	}
