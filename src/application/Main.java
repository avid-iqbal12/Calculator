package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent loader = FXMLLoader.load(getClass().getResource("MainWindowView.fxml"));		
		//AnchorPane pane = loader.load();
		
		Scene scene = new Scene(loader);
				
		scene.getStylesheets().add("application.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
