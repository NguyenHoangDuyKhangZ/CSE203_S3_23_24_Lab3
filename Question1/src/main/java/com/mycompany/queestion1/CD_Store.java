/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queestion1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CD_Management cd = new CD_Management();
        int menu;
        do {
            System.out.printf("""
                              1. Add CD 
                              2. Search CD by CD title
                              3. Search CDs by collection(game/ movie/ music)
                              4. Search CDs by type(audio/ video)
                              5. Delete CD by CD Id
                              6. Edit CD information by Id
                              7. Display all CDs
                              8. Sort the CD list ascending by year of release
                              9. Exit
                              Input: """);
            menu = sc.nextInt();
            switch (menu){
                case 1 -> cd.Add();
                case 2 -> cd.SearchTitle();
                case 3 -> cd.SearchCollection();
                case 4 -> cd.SearchType();
                case 5 -> cd.Delete();
                case 6 -> cd.EditCDInfor();
                case 7 -> cd.DisplayAllCD();
                case 8 -> cd.Sort();
                case 9 -> {
                }     
            }} while (menu != 9);
    }
}
