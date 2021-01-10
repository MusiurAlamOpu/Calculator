/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex.calculator;

import BasicMood.BasicOperation;
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author musiu
 */
public class FXMLScientificMoodController implements Initializable{

    @FXML
    private Button number4Button;
    @FXML
    private Button number9Button;
    @FXML
    private Button clearButton;
    @FXML
    private Button number8Button;
    @FXML
    private Button number7Button;
    @FXML
    private Button number5Button;
    @FXML
    private Button operatorButtonDivide;
    @FXML
    private Button operationButtonMinus;
    @FXML
    private Button number6Button;
    @FXML
    private Button operatorButtonMultiple;
    @FXML
    private Button operatorButtonPlus;
    @FXML
    private Button number3Button;
    @FXML
    private Button number2Button;
    @FXML
    private Button number1Button;
    @FXML
    private Button numberd0button;
    @FXML
    private Button floatingPointButton;
    @FXML
    private Button equalButton;
    @FXML
    private TextField output;
    
    
    @FXML
    Button basicMoodButton;
    @FXML
    Button scientificMoodButton;
    @FXML
    Button aboutButton;
    
    
    private double number1 = 0;
    private String operator ="";
    private boolean start;
    @FXML
    private Button logButton;
    @FXML
    private Button lnButton;
    @FXML
    private Button NthSquareButton;
    @FXML
    private Button NthSquareRoot;
    @FXML
    private Button factionButton;
    @FXML
    private Button trigonometryButton;

    public FXMLScientificMoodController() {
        this.start = false;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void processNumpad(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void clearButtonClick(ActionEvent event) {
            String value = ((Button)event.getSource()).getText();
            value = String.valueOf(number1);
            number1 = 0;
            output.setText("");
    }

    @FXML
    private void processOperation(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        
        if(!"=".equals(value)){
            if(!operator.isEmpty()){
                return;
            }
            
            operator = value;
            number1 = Double.valueOf(output.getText());
            output.setText("");
            
        }else{
            if(operator.isEmpty()){
                return;
            }       
           output.setText(String.valueOf(BasicOperation.BasicOperations(number1, Double.parseDouble(output.getText()), operator)));
            operator ="";
            start = true;
        }
    } 

    @FXML
    private void output(ActionEvent event) {
        
    }

    @FXML
    private void basicMoodButtonClick() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage window = (Stage) basicMoodButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    
    
    @FXML
    private void scientificMoodButtonClick() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLScientificMood.fxml"));
        Stage window = (Stage) scientificMoodButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    private void aboutButtonClick() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLAbout.fxml"));
        Stage window = (Stage) aboutButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    private void logButtonClick(ActionEvent event) {
    }


    @FXML
    private void lnButtonClick(ActionEvent event) {
    }

    @FXML
    private void NthSquareButtonClick(ActionEvent event) {
    }

    @FXML
    private void NthSquareRootClick(ActionEvent event) {
    }

    @FXML
    private void factionButtonClick(ActionEvent event) {
    }

    @FXML
    private void trigonometryButton(ActionEvent event) {
    }
    
}
