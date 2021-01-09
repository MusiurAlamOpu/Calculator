
package ScientificMood;


public class Trigonometry {
    public double degreeToRadian(double angle){
        return (angle*Math.PI)/180;
    }
    public double RadianTodegree(double angle){
        return (angle*180)/Math.PI;
    }
    
    public double sinValue(double angle){
        return Math.sin(angle);
    }
    public double cosValue(double angle){
        return Math.cos(angle);
    }
    public double tanValue(double angle){
        return Math.tan(angle);
    }
    public double cotValue(double angle){
        return 1/(Math.tan(angle));
    }
    public double secValue(double angle){
        return 1/(Math.cos(angle));
    }public double cosecValue(double angle){
        return 1/(Math.sin(angle));
    }
    
}
