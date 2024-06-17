import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PageEpreuve extends Application{
    @Override 
    public void init() throws Exception {
        
    }
    
    @Override 
    public void start(Stage primarystage) throws Exception{
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PageEpreuve.fxml"));
            BorderPane root = loader.load();
            Scene mainScene = new Scene(root);
            primarystage.setScene(mainScene);
            primarystage.show();
        } catch (Exception e) {
            System.out.println(e);
        }   
    }   

    public static void main(String[] args) {
        launch(args);
    }
    
}