package ydawork1.gmail.com;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        String operation;

        Number myFirstNumber = new Number();
        firstNumber = myFirstNumber.createNumber();

        TypeOfOperation myTipe = new TypeOfOperation();
        operation = myTipe.createTypeOfOperation();

        Number mySecondNumber = new Number();
        secondNumber = mySecondNumber.createNumber();


        Calculator myCalculator = new Calculator(firstNumber, secondNumber, operation);

        if(myFirstNumber.getTypeOfNumber() == 0 && mySecondNumber.getTypeOfNumber() == 0){
            myCalculator.printResult();
        } else if (myFirstNumber.getTypeOfNumber() == 1 && mySecondNumber.getTypeOfNumber() == 1){
            myCalculator.printRomanResult();
        } else {
            System.out.println("You can't use Arabic and Roman numbers at the same time");
        }

    }
}
