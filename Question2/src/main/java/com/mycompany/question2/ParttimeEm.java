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
public class ParttimeEm extends Employee {
    private int workingHour;
    private float payRate;
    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

   
    public ParttimeEm() {
    }
    public ParttimeEm(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }
     public ParttimeEm( String employee_ID, String employee_FullName, int yearOfBirth, String address, String phone) {
        super(employee_ID, employee_FullName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }
     @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Working hour: ");
        workingHour = sc.nextInt();
        System.out.print("Pay rate: ");
        payRate = sc.nextFloat();
    }

    @Override
    public float getPayment() {
        return getWorkingHour()* getPayRate();
    }
}
