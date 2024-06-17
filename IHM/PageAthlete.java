import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class PageAthlete extends Application {
    @Override
    public void init(){

    }


    @Override
    public void start(Stage primarystage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PageAthlete.fxml"));
        BorderPane root = loader.load();
        Scene maiScene = new Scene(root);
        primarystage.setScene(maiScene);
        primarystage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}