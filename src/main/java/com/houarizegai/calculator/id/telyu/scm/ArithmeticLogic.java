package com.houarizegai.calculator.id.telyu.scm;

public class ArithmeticLogic {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }

        return firstNumber / secondNumber;
    }
}