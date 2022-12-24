/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10;

import java.util.ArrayList;

/**
 *
 * @author Restu
 */

class Menu{
    private String name;
    int price;

    public Menu(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Nama: " + name);
        System.out.println("Harga: " + price);
    }
}

public class Warteg{
    public static void main(String[] args){
        ArrayList<Menu> menuList = new ArrayList<>();

        menuList.add(new Menu("Nasi Goreng", 15000));
        menuList.add(new Menu("Mie Goreng", 12000));
        menuList.add(new Menu("Bakso", 10000));

        System.out.println("Menu warteg:");
        for (Menu menu : menuList){
            menu.displayInfo();
            System.out.println();
        }

        int totalPrice = 0;
        for (Menu menu : menuList){
            totalPrice += menu.price;
        }
        System.out.println("Total harga: " + totalPrice);
    }
}
