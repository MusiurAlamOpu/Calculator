
package BasicMood;

//import java.lang.Math;


public class BasicOperation {
    
    
    public static String BasicOperations(double number1, double number2, String operator){
        switch(operator){
                case "+": 
                    return String.valueOf(number1+number2);
                case "-": 
                    return String.valueOf(number1-number2);
                case "*":     
                    return String.valueOf(number1*number2);
                case "Percentage": 
                    return String.valueOf((number1*number2)/100);
                case "/":
                    if(number2 == 0){
                        return "Math error!";
                    }
                    return String.valueOf(number1/number2);
                
        }
        return "Unknown operator  " + operator;
    }
}
