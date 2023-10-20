package org.example.services;

import org.example.models.ComplexNumber;
import org.example.models.Logger;

public class CalculatorService {
    private Logger logger;

    public CalculatorService(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.add(number2);
        logger.log("Результат сложения: " + result.getReal() + " + " + result.getImaginary() + "i");
        return result;
    }

    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.multiply(number2);
        logger.log("Результат умножения: " + result.getReal() + " + " + result.getImaginary() + "i");
        return result;
    }

    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.divide(number2);
        logger.log("Результат деления: " + result.getReal() + " + " + result.getImaginary() + "i");
        return result;
    }
}

