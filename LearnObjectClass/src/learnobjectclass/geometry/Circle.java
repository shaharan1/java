
package learnobjectclass.geometry;


public class Circle {
  
    public double radius;
    
    public double getArea(){
    
        double result=Math.PI*Math.pow(radius, 2);
        
        return result;
    
    }
    
    public double getPerimeter(){
    
    double result=2*(Math.PI*radius);
    
    return result;
    
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
}
