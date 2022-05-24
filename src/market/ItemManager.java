/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
    ArrayList<Item> items = new ArrayList<>();
    
    public void setItems(){
        System.out.println("Nhap danh sach item");
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so luong item");
        int n = s.nextInt();
        if (n<=0 || n> 10){
            System.out.println("So luong khong hop le");
            return;
        }
        items = new ArrayList<>();
        for(int i=0;i<n;i++){
            Item it = new Item();
            it.input();
            if(it.getId() == -1){
                System.out.println("Finish input");
                break;
            }
            items.add(it);
        }
    }
    
    public void getItems(){
        System.out.println("Thong tin item");
        System.out.println("ItemID       ItemName           Price");
        for(int i=0;i<items.size();i++){
            items.get(i).display();
        }
        if(!items.isEmpty()){
            Item hi = items.get(0);
            Item lw = items.get(0);
            double totalPrice = hi.getPrice();
            for(int i=1;i<items.size();i++){
                Item c = items.get(i);
                if(c.getPrice() > hi.getPrice()){
                    hi = c;
                }
                if(c.getPrice() < lw.getPrice()){
                    lw = c;
                }
                totalPrice += c.getPrice();
            }
            double avgPrice = totalPrice/items.size();
            System.out.println("Highest Item Price: " + hi.getName() + " : " + hi.getPrice());
            System.out.println("Lowest Item Price: " + lw.getName() + " : " + lw.getPrice());
            System.out.println("Average Item Price: " + avgPrice);
        }
    }
    
    public void findItem(){
        System.out.println("Nhap name can tim");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Danh sach item tim duoc la");
        int total = 0;
        for(int i=0;i<items.size();i++){
            Item c = items.get(i);
            if(c.getName().equals(name)){
                c.display();
                total += 1;
            }
        }
        System.out.println("Tim duoc " + total + "items");
    }
        
}
