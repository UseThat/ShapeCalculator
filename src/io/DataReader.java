package io;

import Model.Circle;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer){
        this.printer = printer;
    }

    public void calculateCircle(){
        printer.printLine("Set R: ");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        printer.printLine("Area for circle "+ circle.calculateArea());
        printer.printLine("");
    }
}
