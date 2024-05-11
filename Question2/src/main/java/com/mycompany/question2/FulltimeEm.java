/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FulltimeEm extends Employee {

    private float salary;

    public FulltimeEm(String employee_ID, String employee_FullName, int yearOfBirth, String address, String phone, float salary) {
        super(employee_ID, employee_FullName, yearOfBirth, address, phone);
        this.salary=salary;
    }

    @Override
     public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = sc.nextFloat();
    }

    @Override
    public float getPayment() {
        return getSalary();
    }

    @Override
    public String getInfo() {
        return " - Employee ID: " + employee_ID
                + " - Employee name: " + employee_FullName
                + " - Year of birth: " + yearOfBirth
                + " - Address: " + address
                + " - Phone: " + phone
                + " - Salary: " + salary;
    }

    private float getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
