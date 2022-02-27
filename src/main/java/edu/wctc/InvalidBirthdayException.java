package edu.wctc;

public class InvalidBirthdayException extends Exception{
    public InvalidBirthdayException(int year, int month, int day){
        super(month + "/" + day + "/" + year + " is not valid");
    }
}
