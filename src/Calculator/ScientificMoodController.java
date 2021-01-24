
package Calculator;

import BasicMood.BasicOperation;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ScientificMoodController implements Initializable {

    @FXML
    private TextField output;
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
    private Button numberd0button;
    @FXML
    private Button floatingPointButton;
    @FXML
    private Button equalButton;
    @FXML
    private MenuButton moodButton;
    @FXML
    private MenuItem ScientificMoodMenuItem;
    
    
    
    private double number1 = 0;
    private String operator = "";
    private boolean start;
    @FXML
    private Button naturalLogButton;
    @FXML
    private Button logarithmButton;
    @FXML
    private Button xToYButton;
    @FXML
    private Button absoluteButton;
    @FXML
    private Button PIvalue;
    @FXML
    private Button tenToPowerXButton;
    @FXML
    private Button factorial;
    @FXML
    private Button eValue;
    @FXML
    private Button modulus;
    @FXML
    private MenuButton functionMenu;
    @FXML
    private MenuItem floor;
    @FXML
    private MenuItem ceil;
    @FXML
    private Button Remainder;
    @FXML
    private Button sin;
    @FXML
    private Button cos;
    @FXML
    private Button tan;
    @FXML
    private Button cot;
    @FXML
    private Button sec;
    @FXML
    private Button cosec;
 
    
    public ScientificMoodController() {
        this.start = false;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void clearButtonClick(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        value = String.valueOf(number1);
        number1 = 0;
        output.setText("");
    }

    @FXML
    private void buttonClearEntryClick(ActionEvent event) throws Exception{
        try{
         String currentText = output.getText();
        int lenghtOfcurrentText = currentText.length();
        String previousText = currentText.substring(lenghtOfcurrentText);
        output.setText(previousText);
       }catch(Exception e){
            System.out.println("No text found on screen!");
            output.setText("Press C!");
       }
    }

    @FXML
    private void backButtonClick(ActionEvent event)  throws Exception{
        try{
            String currentText = output.getText();
            int lenghtOfcurrentText = currentText.length();
            String previousText = currentText.substring(0, (lenghtOfcurrentText-1));
            output.setText(previousText); 
        }catch(Exception e){
            System.out.println("No text found on Screen!");
            output.setText("Press C!");
        }
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

    @FXML
    private void moodButtonClick(ActionEvent event) {
    }

    @FXML
    private void ScientificMenuItemClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));  
//        Scene scene = new Scene(root);
//        Stage window2 = (Stage)moodButton.getScene().getWindow();
//        window2.setScene(scene);
//        window2.show();
    }

    @FXML
    private void functionMenuClick(ActionEvent event) {
    }
    
}
