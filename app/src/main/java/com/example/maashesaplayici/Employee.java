package com.example.maashesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double raise = 0;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        double totalSalary = this.salary + bonus() - tax() + raiseSalary();
        return "Name: " + this.name + "\n" +
                "Salary: " + salary + "\n" +
                "Weekly Total Working Hours: " + this.workHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Raise: " + raiseSalary() + "\n" +
                "Salary with taxes and bonus: " + (this.salary + bonus() - tax()) + "\n" +
                "Total salary after raise: " + totalSalary;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int workYear = 2021 - this.hireYear;

        if (workYear < 10) {
            this.raise = this.salary * 0.05;
        }
        else if (workYear >= 10 && workYear <= 20) {
            this.raise = this.salary * 0.10;
        }
        else if (workYear > 20) {
            this.raise = this.salary * 0.15;
        }
        return this.raise;
    }
}



