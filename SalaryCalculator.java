package salarycalc;

public class SalaryCalculator implements SalaryInterface {
    private final double basicSalary = 25000.0;
    private final double hraPercentage = 0.30;
    private final double cca = 500.0;
    private final double taxRate = 0.15;

    @Override
    public double calculateGrossSalary() {
        double hra = basicSalary * hraPercentage;
        return basicSalary + hra + cca;
    }

    @Override
    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double incomeTax = grossSalary * taxRate;
        return grossSalary - incomeTax;
    }
}