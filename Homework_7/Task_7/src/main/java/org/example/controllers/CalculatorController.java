package org.example.controllers;

import org.example.services.CalculatorService;
import org.example.models.ComplexNumber;
import org.example.view.CalculatorView;

public class CalculatorController {
    private CalculatorService service;
    private CalculatorView view;

    public CalculatorController(CalculatorService model, CalculatorView view) {
        this.service = model;
        this.view = view;
    }

    public void run() {
        int choice = -1;

        while (choice != 0) {
            view.displayMenu();
            choice = view.readChoice();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performMultiplication();
                    break;
                case 3:
                    performDivision();
                    break;
                case 0:
                    view.displayExitMessage();
                    break;
                default:
                    view.displayErrorMessage("Недопустимый выбор");
            }
        }
    }

    private void performAddition() {
        ComplexNumber number1 = view.readComplexNumber();
        ComplexNumber number2 = view.readComplexNumber();
        service.add(number1, number2);
    }

    private void performMultiplication() {
        ComplexNumber number1 = view.readComplexNumber();
        ComplexNumber number2 = view.readComplexNumber();
        service.multiply(number1, number2);
    }

    private void performDivision() {
        ComplexNumber number1 = view.readComplexNumber();
        ComplexNumber number2 = view.readComplexNumber();

        if (number2.getReal() == 0 && number2.getImaginary() == 0) {
            view.displayErrorMessage("Деление на ноль невозможно");
            return;
        }

        service.divide(number1, number2);
    }
}
