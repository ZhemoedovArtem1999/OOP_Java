package org.example.models;

public class ComplexNumber {
    // Поля для хранения вещественной и мнимой части комплексного числа
    private double real;
    private double imaginary;

    // Конструктор
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Методы для получения и установки значений вещественной и мнимой частей
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Методы для операций сложения, умножения и деления комплексных чисел
    public ComplexNumber add(ComplexNumber other) {
        double resultReal = real + other.getReal();
        double resultImaginary = imaginary + other.getImaginary();
        return new ComplexNumber(resultReal, resultImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double resultReal = (real * other.getReal()) - (imaginary * other.getImaginary());
        double resultImaginary = (real * other.getImaginary()) + (imaginary * other.getReal());
        return new ComplexNumber(resultReal, resultImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = (Math.pow(other.getReal(), 2) + Math.pow(other.getImaginary(), 2));
        double resultReal = ((real * other.getReal()) + (imaginary * other.getImaginary())) / divisor;
        double resultImaginary = ((imaginary * other.getReal()) - (real * other.getImaginary())) / divisor;
        return new ComplexNumber(resultReal, resultImaginary);
    }
}
