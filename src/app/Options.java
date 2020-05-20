package app;

import exceptions.NoSuchOptionsExceptions;

import java.util.InputMismatchException;

public enum Options {
    EXIT(0,"Exit"),
    RECTANGLE(1,"Calculate Rectangle"),
    TRIANGLE(2,"Calculate Triangle"),
    CIRCLE(3,"Calculate Circle");

    private int value;
    private String description;

    Options(int value, String description){
        this.description = description;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return value +" - "+ description;
    }

    static Options createFromInt(int option) throws NoSuchOptionsExceptions{
        try {
            return Options.values()[option];
        }catch (ArrayIndexOutOfBoundsException ex){
            throw new NoSuchOptionsExceptions("We don't have that options" + option);
        }
    }
}
