package edu.wctc;

public class MissingNameException extends Exception{
    public MissingNameException(String nameType) {
        super(nameType + " cannot be blank");
    }
}
