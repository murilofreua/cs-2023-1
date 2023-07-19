package org.example._04;

public class Employee {

    private double monthlySalary;
    private double awards;

    public double getYearlySalary() {
        return this.monthlySalary*12 + awards;
    }

    public double getAwards() {
        return this.awards;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }
}