

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JeuxOlympique extends Application{
    private Controleur controleur;
    private Scene scene;
    private Stage stage;
    @Override
    public void init() throws IOException{
        this.controleur = new Controleur(this);
        VBox root = pageConnexion();
        this.scene = new Scene(root);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        this.stage.setScene(this.scene);
        this.stage.setTitle("Jeux Olympique");
        this.stage.show();
    }

    public VBox pageConnexion() throws IOException{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PageConnexion.fxml"));
        loader.setController(this.controleur);
        VBox root = loader.load();
        return root;
    }

    public BorderPane pageParticipant() throws IOException{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PageParticipant.fxml"));
        loader.setController(this.controleur);
        BorderPane root = loader.load();
        this.stage.setMinWidth(850);
        this.stage.setMinHeight(450);
        this.stage.setMaximized(true);
        return root;
    }

    public BorderPane pageCompetition() throws IOException{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PageCompetition.fxml"));
        loader.setController(this.controleur);
        BorderPane root = loader.load();
        this.stage.setMinWidth(850);
        this.stage.setMinHeight(450);
        this.stage.setMaximized(true);
        return root;
    }

    

    public void modeConnexion() throws IOException{
        this.scene.setRoot(this.pageConnexion());
    }

    public void modeParticipant() throws IOException{
        this.scene.setRoot(this.pageParticipant());
    }

    public void modeCompetition() throws IOException{
        this.scene.setRoot(this.pageCompetition());
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
