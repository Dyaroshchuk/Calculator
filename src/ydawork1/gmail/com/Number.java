package ydawork1.gmail.com;

import java.util.Scanner;

public class Number {
    private String numberStr;//
    private int number = 0;
    private boolean checkNumber = false;
    private boolean checkRomanNumber = false;
    private int typeOfNumber = 2;
    Scanner scan = new Scanner(System.in);

    public String getNumberStr() {
        return numberStr;
    }

    public void setNumberStr(String numberStr) {
        this.numberStr = numberStr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(boolean checkNumber) {
        this.checkNumber = checkNumber;
    }

    public int getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(int typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    public boolean isCheckRomanNumber() {
        return checkRomanNumber;
    }

    public void setCheckRomanNumber(boolean checkRomanNumber) {
        this.checkRomanNumber = checkRomanNumber;
    }

    //request to enter number
    public void printMessag(){
        System.out.println("Enter value for calculator: ");
    }
    //if costumer entered invalid type of number request to enter valid type
    public void printErrorMessag(){
        System.out.println("You entered invalid value, please enter integer arabic or roman numbers");
    }

    ///checking is the input values is a number if it valid arabic number return true, otherwise return false
    public static boolean CheckNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    //checking is the input values is a number if it valid roman number return true, otherwise return false
    public static boolean CheckRomanNumber(String number){
        number = number.toUpperCase();
        if(number.equals("I") || number.equals("II") || number.equals("III") || number.equals("IV") || number.equals("V")
                || number.equals("VI") || number.equals("VII") || number.equals("VIII") || number.equals("IX") || number.equals("X")){
            return true;
        } else {
            return false;
        }
    }

    //Method which transform roman number to arabic number
    public static int RomanNumberToArabicNumber(String number){
        int a = 0;
        number = number.toUpperCase();
        if (number.equals("I")) a = 1;
        else if (number.equals("II")) a = 2;
        else if (number.equals("III")) a = 3;
        else if (number.equals("IV")) a = 4;
        else if (number.equals("V")) a = 5;
        else if (number.equals("VI")) a = 6;
        else if (number.equals("VII")) a = 7;
        else if (number.equals("VIII")) a = 8;
        else if (number.equals("IX")) a = 9;
        else if (number.equals("X")) a = 10;

        return a;
    }

    //created method with loop for entered number, if user input invalid type requested enter valid type
    //loop will processing while user won't input valid type
    public int createNumber(){
        printMessag();
        do{
            setNumberStr(scan.next());
            setCheckNumber(CheckNumber(getNumberStr()));
            setCheckRomanNumber(CheckRomanNumber(getNumberStr()));

            if(isCheckNumber()){
                 setNumber(Integer.parseInt(getNumberStr()));
                 setTypeOfNumber(0);
            } else if(isCheckRomanNumber()){
                setNumber(RomanNumberToArabicNumber(getNumberStr()));
                setCheckNumber(isCheckRomanNumber());
                setTypeOfNumber(1);
            } else {
                printErrorMessag();
            }
        } while(!isCheckNumber());
        return getNumber();
    }

}
