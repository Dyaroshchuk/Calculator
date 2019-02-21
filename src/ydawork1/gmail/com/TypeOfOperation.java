package ydawork1.gmail.com;

import java.util.Scanner;

public class TypeOfOperation {
    private String operation;
    private boolean checkOperation = false;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean isCheckOperation() {
        return checkOperation;
    }

    public void setCheckOperation(boolean checkOperation) {
        this.checkOperation = checkOperation;
    }

    Scanner scan = new Scanner(System.in);

    //request to enter type of operation
    public void printInputMessag(){
        System.out.println("Enter type of operation, you can use \"+\", \"-\", \"*\', \"/\" ");
    }
    //if costumer entered invalid type of operation request to enter valid type
    public void printErrorMessag(){
        System.out.println("You entered invalid value, please enter \"+\", \"-\", \"*\', \"/\" ");
    }

    //created method with loop for type of operation, if user input invalid type requested enter valid type
    //loop will processing while user won't input valid type
    public String createTypeOfOperation(){
        printInputMessag();
        do{
            setOperation(scan.next());
            setCheckOperation(checkOperation(operation));
            if (isCheckOperation()){
                operation = operation;
            } else {
                printErrorMessag();
            }
        } while (!isCheckOperation());
        return operation;
    }


    //checking is the entered type is valid
    public static boolean checkOperation(String operation){
        if (operation.equals("-") || operation.equals("+") || operation.equals("/") || operation.equals("*")){
            return true;
        } else {
            return false;
        }
    }
}

