/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

import java.util.*;

/**
 *
 * @author Student
 */
abstract class Employee {
    protected String employee_ID;
    protected String employee_FullName;
    protected int yearOfBirth;
    protected String address;
    protected String phone;
    
    public String getEmployee_ID() {
        return employee_ID;
    }
    public void setEmployee_ID(String employee_ID) {
        this.employee_ID = employee_ID;
    }
    public String getEmployee_FullName() {
        return employee_FullName;
    }
    public void setEmployee_FullName(String employee_FullName) {
        this.employee_FullName = employee_FullName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }    

    public Employee(String employee_ID, String employee_FullName, int yearOfBirth, String address, String phone) {
        this.employee_ID = employee_ID;
        this.employee_FullName = employee_FullName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }
   
        
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        employee_ID = sc.nextLine();
        System.out.println("Enter Employee's Fullname: ");
        employee_FullName = sc.nextLine();
        System.out.println("Enter Employee's Year Of Birth: ");
        yearOfBirth = sc.nextInt();
        System.out.println("Enter Employee's Address: ");
        address = sc.nextLine();
        System.out.println("Enter Employee's phone: ");
        phone = sc.nextLine();      
    }
     abstract String getInfo();

     abstract float getPayment();
    }

