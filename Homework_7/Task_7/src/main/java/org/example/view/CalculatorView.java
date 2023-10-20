package org.example.view;

import org.example.models.ComplexNumber;
import org.example.models.Logger;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;
    private Logger logger;

    public CalculatorView(Logger logger) {
        scanner = new Scanner(System.in);
        this.logger = logger;
    }

    public ComplexNumber readComplexNumber() {
        logger.log("Введите вещественную часть комплексного числа:");
        double real = scanner.nextDouble();
        logger.log("Введите мнимую часть комплексного числа:");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void displayMenu() {
        logger.log("Выберите операцию:");
        logger.log("1. Сложение");
        logger.log("2. Умножение");
        logger.log("3. Деление");
        logger.log("0. Выход");
    }

    public int readChoice() {
        logger.log("Введите номер операции:");
        return scanner.nextInt();
    }

    public void displayErrorMessage(String message) {
        logger.log("Ошибка: " + message);
    }

    public void displayExitMessage() {
        logger.log("До свидания!");
    }
}
