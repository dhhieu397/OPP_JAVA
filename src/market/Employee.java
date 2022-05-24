/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;

import java.util.Scanner;

public class Employee {
    String name;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap name");
        name = s.nextLine();
        
        String[] parts = name.split(" ");
        gender = "Unknown";
        if(parts.length > 2){
            for(int i=1;i<parts.length-1;i++){
                if(parts[i].equals("Van")){
                    gender = "Man";
                }else if(parts[i].equals("Thi")){
                    gender = "Woman";
                }
            }
        }
    }
    
    public void display(){
        System.out.println(String.format("%-20s %5s", name, gender));
    }
    
    
}
