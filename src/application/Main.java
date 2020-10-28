package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SchuleView.fxml"));
			Parent rootComponent = loader.load();
			Scene scene = new Scene(rootComponent);
			scene.getStylesheets().add(getClass().getResource("DarkTheme.css").toExternalForm());
			primaryStage.setTitle("NotenVerwaltung");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
