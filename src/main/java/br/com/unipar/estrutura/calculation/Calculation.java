/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.estrutura.calculation;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Calculation {

    Employee employee;
    EmployeePayroll employeePayroll;
    Scanner entrada = new Scanner(System.in);

    public void calculateComission() {
        employeePayroll.commissionAmount = (employee.totalSales * 30) / 100; 
    }

    public void calculateInss(Employee employee, EmployeePayroll employeePayroll) {
        if (employee.salary <= 1100) {
            employeePayroll.discountInss = (employee.salary * 7.5) / 100;
        }
        if (employee.salary > 1100 && employee.salary <= 2203.48) {
            employeePayroll.discountInss = (employee.salary * 9) / 100;
        }
        if (employee.salary > 2203.48 && employee.salary <= 3305.22) {
            employeePayroll.discountInss = (employee.salary * 12) / 100;
        }
        if (employee.salary > 3305.22 && employee.salary <= 6433.57) {
            employeePayroll.discountInss = (employee.salary * 14) / 100;
        }
    }

    public void calculateFgts(Employee employee, EmployeePayroll employeePayroll) {
        employeePayroll.discountFgts = (employee.salary * 8) / 100;
    }

    public void calculateIrpf(Employee employee, EmployeePayroll employeePayroll) {
        if (employee.salary <= 1903.98) {
            employeePayroll.discountIrpf = 0;
        }
        if (employee.salary >= 1903.99 && employee.salary <= 2826.66) {
            employeePayroll.discountIrpf = (employee.salary * 7.5) / 100;
        }
        if (employee.salary >= 2826.67 && employee.salary <= 3751.05) {
            employeePayroll.discountIrpf = (employee.salary * 15) / 100;
        }
        if (employee.salary >= 3751.06 && employee.salary <= 4664.68) {
            employeePayroll.discountIrpf = (employee.salary * 22) / 100;
        }
        if (employee.salary >= 4664.69) {
            employeePayroll.discountIrpf = (employee.salary * 27.5) / 100;
        }

    }

    public double calculateHealthPlan(int op) {
        switch (op) {
            case 1:
                employeePayroll.discountHealthPlan = 100;
                break;
            case 2:
                employeePayroll.discountHealthPlan = 0;
                break;

        }
        return employeePayroll.discountHealthPlan;
    }

    public double calculateFoodVoucher(int op) {
         switch (op) {
            case 1:
                employeePayroll.foodVoucher = 450;
                break;
            case 2:
                employeePayroll.foodVoucher = 0;
                break;

        }
        return employeePayroll.foodVoucher;
    }

    public double calculateTransportationVouchers(int op) {
        switch (op) {
            case 1:
                employeePayroll.transportationVoucher = 300;
                break;
            case 2:
                employeePayroll.foodVoucher = 0;
                break;

        }
        return employeePayroll.transportationVoucher;
    }

    public void calculateSalary() {
        employee.salary =  employee.salary - employeePayroll.discountFgts - employeePayroll.discountHealthPlan - employeePayroll.discountInss - employeePayroll.discountIrpf + employeePayroll.foodVoucher + employeePayroll.transportationVoucher + employeePayroll.commissionAmount;
    }
}
