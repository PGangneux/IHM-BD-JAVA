import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controleur {
    @FXML
    private Button btnCo;

    @FXML
    private Button btnAccueil;

    private JeuxOlympique vue;

    @FXML
    private void init(){}

    public Controleur(JeuxOlympique vue){
        this.vue = vue;
    }

    @FXML
    private void handleConnexion(ActionEvent event) throws IOException{
        this.vue.modeAthlete();
        System.out.println("Affichage fenetre Participants");
    }

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException{
        this.vue.modeConnexion();
        System.out.println("Affichage fenete Connexion");
    }
}
