package app;

import io.ConsolePrinter;
import io.DataReader;

public class ShapeLogic {
    ConsolePrinter printer = new ConsolePrinter();
    DataReader dataReader = new DataReader(printer);

    public ShapeLogic(){
        controlLoop();
    }

    private void controlLoop(){
        getOptions();
    }

    private void getOptions(){
        printer.printLine("Choose options:");
        for(Options options : Options.values()){
            printer.printLine(options.toString());
        }
    }
}
