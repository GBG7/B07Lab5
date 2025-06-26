public class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
    
    public double computeCircumference() {
    	return Math.PI * radius * 2;
    }
    
    public double computeArcLength(double theta)  {
    	return radius * theta;
    }
}