package org.example.SRP;

public class EmployeeSalaryCalculate {
    // данный класс отвечает только для расчитывание зарплаты
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
