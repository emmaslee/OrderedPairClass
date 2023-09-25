
/**
 * Problem Set 2B
 *
 * Emma Lee
 * September 21 2023
 */
public class OrderedPair
{
    double x;
   double y;
  
    
    //constructor
    OrderedPair() {
        x = 0;
        y = 0;
    }
    
    OrderedPair(double a, double b) {
        x = a;
        y = b;
    }
    
    public String toString() {
        return x + ", " + y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
}
