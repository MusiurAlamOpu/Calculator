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
import java.util.logging.Level;
import java.util.logging.Logger;
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
 *
 * @author musiu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button number9Button;
    @FXML
    private Button clearButton;
    @FXML
    private Button number8Button;
    @FXML
    private Button number7Button;
    @FXML
    private Button buttonClearEntry;
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
    private Button backButton;
    @FXML
    private Button percentageButton;
    @FXML
    private Button squareButton;
    @FXML
    private Button squarerootButton;
    @FXML
    private Button oneBYxButton;
    @FXML
    private MenuButton menuButton;
    @FXML
    private Button numberd0button;
    @FXML
    private Button floatingPointButton;
    @FXML
    private Button equalButton;
    @FXML
    private TextField output;
    @FXML
    private Button number4Button;
    
    
    @FXML
    Button basicMoodButton;
    @FXML
    Button scientificMoodButton;
    @FXML
    Button aboutButton;
    
    
    private double number1 = 0;
    private String operator = "";
    private boolean start;
 
    
    public FXMLDocumentController() {
        this.start = false;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void clearButtonClick(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        value = String.valueOf(number1);
        number1 = 0;
        output.setText("");
    }

    @FXML
    private void buttonClearEntryClick(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        int len = value.length();
        char[] newValue = new char[(len - 1)];
        for (int i = 0; i < len; i++) {
            newValue[i] = value.charAt(i);
        }
        String valueAfterBack = String.valueOf(newValue);
        value = valueAfterBack;
        output.setText(value);
    }

    @FXML
    private void backButtonClick(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        int len = value.length();
        char[] newValue = new char[(len - 1)];
        for (int i = 0; i < len; i++) {
            newValue[i] = value.charAt(i);
        }
        String valueAfterBack = String.valueOf(newValue);

        output.setText(valueAfterBack);
    }

    

    

    @FXML
    private void Square(ActionEvent event) {
        double num = Double.valueOf(output.getText());
        double sqr = num * num;
        output.setText(String.valueOf(sqr));
    }

    @FXML
    private void SquareRoot(ActionEvent event) {
        double num = Double.valueOf(output.getText());
        double sqrR = Math.pow(num, 0.5);
        output.setText(String.valueOf(sqrR));
    }

    @FXML
    private void oneBYx(ActionEvent event) {
        double num = Double.valueOf(output.getText());
        double number = 1 / num;
        output.setText(String.valueOf(number));
    }

    @FXML
    private void output(ActionEvent event) {
    }

    @FXML
    private void processNumpad(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperation(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operator.isEmpty()) {
                return;
            }

            operator = value;
            number1 = Double.valueOf(output.getText());
            output.setText("");

        } else {
            if (operator.isEmpty()) {
                return;
            }
            output.setText(String.valueOf(BasicOperation.BasicOperations(number1, Double.parseDouble(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }
}
