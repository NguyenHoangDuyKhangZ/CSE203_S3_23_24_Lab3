/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queestion1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Student
 */
public class CD_Management {
    ArrayList<CD> CDs = new ArrayList<>();
    public CD_Management() {
    }
  
   
   public void Add(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of CDs: ");
       int n = sc.nextInt();
       for(int i =0; i<n;i++){
           CD cd= new CD();
           cd.InputCD();
           CDs.add(cd);
       }
   }
   
   public void SearchTitle(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD title: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getTitle().equalsIgnoreCase(n)) {
                CDs.get(i).OutputCD();
                break;
            }
        }
   }
   
   public void SearchCollection(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Collection: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCD_Collection().equalsIgnoreCase(n)) {
                CDs.get(i).OutputCD();
            }
        }
   }
   
   public void SearchType(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Tpye: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCD_Type().equalsIgnoreCase(n)) {
                CDs.get(i).OutputCD();
            }
        }
   }
   
   public void Delete(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCD_Id().equalsIgnoreCase(n)) {
                CDs.remove(i);
            }
        }
   }
   
   public void EditCDInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCD_Id().equalsIgnoreCase(n)) {
                CDs.get(i).InputCD();
                CDs.get(i).setCD_Id(n);
            }
        }
        }
   
    public void DisplayAllCD(){
        for (int i = 0; i < CDs.size(); i++) {
            CDs.get(i).OutputCD();
        }}
    
    public void Sort(){
     Comparator<CD> compare = new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
     CDs.sort(compare);
     DisplayAllCD();
}
}
   

