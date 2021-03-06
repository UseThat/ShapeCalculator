package Model;

public class Circle implements Shape{
    private double r;

    public Circle (double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }

    @Override
    public String toString() {
        return  "Circle area "+calculateArea() + " and Perimeter "+calculatePerimeter();
    }
}
