/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;

import java.util.Scanner;

public class Item {
    int id;
    String name;
    double price;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Item(){}
    
    public Item(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public void display(){
//        System.out.println("Item " + id);
//        System.out.println(" - name: " + name);
//        System.out.println(" - price: " + price);
        System.out.println(String.format("%-10d %-18s %10f", id, name, price));
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap thong tin item");
        System.out.println("Item id");
        id = s.nextInt();
        System.out.println("Item name");
        s.nextLine();
        name = s.nextLine();
        System.out.println("Item price");
        price = s.nextDouble();
    }
}
