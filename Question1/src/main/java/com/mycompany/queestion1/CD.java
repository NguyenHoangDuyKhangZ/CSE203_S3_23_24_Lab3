/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queestion1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD {
    private String CD_Id;
    private String CD_Collection;
    private String CD_Type;
    private String title;
    private Double price;
    private int yearOfRelease;
    
    public CD(String CD_Id, String CD_Collection, String CD_Type, String Title, Double Price, int YearOfRelease) {
        this.CD_Id = CD_Id;
        this.CD_Collection = CD_Collection;
        this.CD_Type = CD_Type;
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }
    public CD() {
    }

    public String getCD_Id() {
        return CD_Id;
    }

    public void setCD_Id(String CD_Id) {
        this.CD_Id = CD_Id;
    }

    public String getCD_Collection() {
        return CD_Collection;
    }

    public void setCD_Collection(String CD_Collection) {
        this.CD_Collection = CD_Collection;
    }

    public String getCD_Type() {
        return CD_Type;
    }

    public void setCD_Type(String CD_Type) {
        this.CD_Type = CD_Type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    
    public void InputCD(){
        Scanner sc = new Scanner(System.in);
        System.out.print("CD Id: ");
        CD_Id = sc.nextLine();
        System.out.print("CD collection: ");
        CD_Collection = sc.nextLine();
        System.out.print("CD type: ");
        CD_Type = sc.nextLine();
        System.out.print("Title: ");
        title = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Year of release: ");
        yearOfRelease = sc.nextInt();
    }
    
    public void OutputCD(){
        System.out.println("- CD Id: "+ CD_Id);
        System.out.println("- CD Collection: "+ CD_Collection);
        System.out.println("- CD Type: "+ CD_Type);
        System.out.println("- Title: "+ title);
        System.out.println("- Price: "+ price);
        System.out.println("- Year of release: "+ yearOfRelease);
    }
}
