package io;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public void close() {
        scanner.close();
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public void calculateCircle() {
        try {
            printer.printLine("Set R: ");
            double r = scanner.nextDouble();
            Circle circle = new Circle(r);
            printer.printLine(circle.toString());
        } catch (InputMismatchException ex) {
            printer.printLine("Problem with calculations");
        }finally {
            scanner.nextLine();
        }

    }

    public void calculateRectangle() {
        try {
            printer.printLine("Set A: ");
            double a = scanner.nextDouble();
            printer.printLine("Set B: ");
            double b = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(a, b);
            printer.printLine(rectangle.toString());
        } catch (InputMismatchException ex) {
            printer.printLine("Problem with calculations");
        }finally {
            scanner.nextLine();
        }
    }

    public void calculateTriangle() {
        try {
            printer.printLine("Set A: ");
            double a = scanner.nextDouble();
            printer.printLine("Set B: ");
            double b = scanner.nextDouble();
            printer.printLine("Set C: ");
            double c = scanner.nextDouble();
            printer.printLine("Set H: ");
            double h = scanner.nextDouble();
            Triangle triangle = new Triangle(a, b, c, h);
            printer.printLine(triangle.toString());
        } catch (InputMismatchException ex) {
            printer.printLine("Problem with calculations");
        }finally {
            scanner.nextLine();
        }
    }
}
