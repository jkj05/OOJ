import salarycalc.SalaryCalculator;
import salarycalc.SalaryInterface;

public class salaries{
    public static void main(String[] args) {
        SalaryInterface employeeSalary = new SalaryCalculator();

        double grossSalary = employeeSalary.calculateGrossSalary();
        double netSalary = employeeSalary.calculateNetSalary();

        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}