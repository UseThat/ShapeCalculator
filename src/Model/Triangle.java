package Model;

public class Triangle implements Shape {
    private double a, b, c, h;

    public Triangle (double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return 0.5*a*h;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return  "Triangle area "+calculateArea() + " and Perimeter "+calculatePerimeter();
    }
}
