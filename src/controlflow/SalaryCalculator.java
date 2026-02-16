/*  Source: Exercism (Java track) — Exercise: Salary Calculator
https://exercism.org/tracks/java/exercises/salary-calculator
Solution by Alba*/


package controlflow;

public class SalaryCalculator {

    public static final double BASE_SALARY = 1000.00;
    public static final double MAX_SALARY = 2000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        double salaryPercentage = daysSkipped >= 5? 0.85: 1.0; 
        return salaryPercentage;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = productsSold >= 20? 13 : 10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        return productsSold * multiplier;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * salaryMultiplier(daysSkipped);
        salary += bonusForProductsSold(productsSold);
        return salary > MAX_SALARY ? MAX_SALARY : salary;
        
    } 
    
    
    public static void main(String[] args) {

        SalaryCalculator test = new SalaryCalculator();
        System.out.println(test.finalSalary(0, 10)); 
        System.out.println(test.finalSalary(6, 25)); 
    }

}

