
package ScientificMood;

public class ComplexNumberOperations {
    
    private int[] result;
    
    public int[] addingComplexNumbers(int xR, int xI, int yR, int yI){
        result[0] = xR+yR;
        result[1] = xI+yI;
        return result;
    } 
    public int[] subtractingComplexNumbers(int xR, int xI, int yR, int yI){
        result[0] = xR-yR;
        result[1] = xI-yI;
        return result;
    }
}
