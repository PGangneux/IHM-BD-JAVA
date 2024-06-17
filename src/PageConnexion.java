import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PageConnexion extends Application {
    @Override
    public void init(){

    }


    @Override
    public void start(Stage primarystage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("fxml/PageConnexion.fxml"));
        VBox root = loader.load();
        Scene maiScene = new Scene(root);
        primarystage.setScene(maiScene);
        primarystage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}