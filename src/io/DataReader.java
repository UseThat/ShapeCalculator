package io;

import Model.Circle;
import Model.Rectangle;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer){
        this.printer = printer;
    }

    public void close(){
        scanner.close();
    }


    public void calculateCircle(){
        printer.printLine("Set R: ");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        printer.printLine(circle.toString());

    }

    public void calculateRectangle(){
        printer.printLine("Set A: ");
        double a = scanner.nextDouble();
        printer.printLine("Set B: ");
        double b = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(a,b);
        printer.printLine(rectangle.toString());
    }
}
