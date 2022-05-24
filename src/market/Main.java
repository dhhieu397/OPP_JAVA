/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package market;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ItemManager im = new ItemManager();
        boolean exit = false;
        while(!exit){
            System.out.println("Nhap lua chon");
            System.out.println("1. Input Item list");
            System.out.println("2. Display Item list");
            System.out.println("3. Find Item");
            System.out.println("4. Exit");
            int choice = s.nextInt();
            switch(choice){
                case 1:
                    im.setItems();
                    break;
                case 2:
                    im.getItems();
                    break;
                case 3:
                    im.findItem();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Lua chon khong hop le, nhap lai");
                
            }
        }
        
        
    }
    
}
