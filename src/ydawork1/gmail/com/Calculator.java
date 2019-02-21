package ydawork1.gmail.com;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String operation;


    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Calculator(int firstNumber, int secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    //method that performs an operation depending on the input operation value
    public double calculatorOperation(String operation){
        double result = 0;
        if(operation.equals("-")){
            result = getFirstNumber() - getSecondNumber();
        }

        if(operation.equals("+")){
            result = getFirstNumber() + getSecondNumber();
        }

        if(operation.equals("*")){
            result = getFirstNumber() * getSecondNumber();
        }

        if(operation.equals("/")){
            result = getFirstNumber() / getSecondNumber();
        }
        return result;
    }

    //print arabic result
    public void printResult(){
        System.out.println("Your result = " + calculatorOperation(getOperation()));
    }
    //if calculator result will be negative or zero, ze result will displayed in arabic number
    // indicates that the number has been rounded
    // convert arabic numbers to roman number and print result
    public void printRomanResult(){
       int a = (int) Math.round(calculatorOperation(getOperation()));
        String romanNumbersResult = "";

        if (a <= 0){
            System.out.println("Your result can't be transform to roman number");
            System.out.println("Your result = " + a);
        } else {
            while (a > 0){
                if(a >= 100){
                    romanNumbersResult += "С";
                    a -= 100;
                } else if (a >= 50) {
                    romanNumbersResult += "L";
                    a -= 50;
                } else if (a >= 10){
                    romanNumbersResult += "X";
                    a -= 10;
                } else if(a == 9){
                    romanNumbersResult += "IX";
                    a -= 9;
                } else if (a >= 5){
                    romanNumbersResult += "V";
                    a -= 5;
                } else if(a == 4){
                    romanNumbersResult += "IV";
                    a -= 4;
                } else  if (a >= 1){
                    romanNumbersResult +="I";
                    a -= 1;
                }
            }
            System.out.println("Since you used roman numbers, the result was rounded");
            System.out.println("Your resurt: " + romanNumbersResult);
        }

    }


}
