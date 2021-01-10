
package complex.calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLABoutController implements Initializable {

    @FXML
    private Button basicMoodButton;
    @FXML
    private Button scientificMoodButton;
    @FXML
    private Button aboutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void basicMoodButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage window = (Stage) basicMoodButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    private void scientificMoodButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLScientificMood.fxml"));
        Stage window = (Stage) scientificMoodButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    private void aboutButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("About.fxml"));
        Stage window = (Stage) aboutButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    
}