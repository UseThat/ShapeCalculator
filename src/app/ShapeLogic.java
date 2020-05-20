package app;

import exceptions.NoSuchOptionsExceptions;
import io.ConsolePrinter;
import io.DataReader;

import java.util.InputMismatchException;

public class ShapeLogic {
    ConsolePrinter printer = new ConsolePrinter();
    DataReader dataReader = new DataReader(printer);

    public ShapeLogic(){
        controlLoop();
    }

    private void controlLoop(){
        Options options;

        do{
            options = getOptions();
            switch (options){
                case CIRCLE:
                    dataReader.calculateCircle();
                    break;
                case TRIANGLE:
                    dataReader.calculateTriangle();
                    break;
                case RECTANGLE:
                    dataReader.calculateRectangle();
                    break;

            }
        }while (options != Options.EXIT);
        dataReader.close();
    }

    private Options getOptions(){
        boolean isOptionsOk = false;
        Options options = null;
        while (!isOptionsOk){
            printOptions();
            try {
                options = Options.createFromInt(dataReader.getInt());
                isOptionsOk = true;
            }catch (NoSuchOptionsExceptions ex){
                printer.printLine(ex.getMessage() + ", try one more time");
            }catch(InputMismatchException ex){
                printer.printLine("This is not number!");
            }
        }
        return options;
    }

    private void printOptions(){
        printer.printLine("Choose options:");
        for(Options options : Options.values()){
            printer.printLine(options.toString());
        }
    }
}
