import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PageEpreuve extends Application{
    @Override 
    public void init() throws Exception {
        
    }
    
    @Override 
    public void start(Stage primarystage) throws Exception{
        // FXMLLoader loader = new FXMLLoader(this.getClass().getResource("file:./src/Page_Accueil.fxml"));
        // BorderPane root = loader.load();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("file:./IHM/PageEpreuve.fxml"));
        BorderPane root = loader.load();
        Scene mainScene = new Scene(root);
        primarystage.setScene(mainScene);
        primarystage.setTitle("test");
        primarystage.show();
        
    }   

    public static void main(String[] args) {
        launch(args);
    }
    
}