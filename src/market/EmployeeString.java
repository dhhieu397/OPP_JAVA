/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;

import java.util.Scanner;

public class EmployeeString {
     public static void main(String[] args) {
        System.out.println("Nhap so luong employees");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Employee[] list = new Employee[n];
        for(int i=0;i<n;i++){
            list[i] = new Employee();
            System.out.println("Nhap employee thu "+ (i+1));
            list[i].input();
        }
        
        System.out.println("Display");
        System.out.println("Name                    | Gender");
        for(int i=0;i<n;i++){
            list[i].display();
        }
     }
}
