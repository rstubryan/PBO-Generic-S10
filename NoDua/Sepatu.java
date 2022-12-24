/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10;

/**
 *
 * @author Restu
 */
import java.util.ArrayDeque;
import java.util.Scanner;

class Shoes{
    private String brand;
    private String model;
    int price;

    public Shoes(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Harga: Rp" + price);
    }
}

public class Sepatu{
    public static void main(String[] args){
        ArrayDeque<Shoes> shoesQueue = new ArrayDeque<>();

        shoesQueue.add(new Shoes("Nike", "Air Max", 300000));
        shoesQueue.add(new Shoes("Adidas", "Superstar", 350000));
        shoesQueue.add(new Shoes("Puma", "Clyde", 250000));
        shoesQueue.add(new Shoes("Vans", "Old Skool", 200000));

        System.out.println("Sepatu:");
        for (Shoes shoes : shoesQueue){
            shoes.displayInfo();
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan harga sepatu:");
        int price = scanner.nextInt();

        Shoes shoes = null;
        for (Shoes s : shoesQueue){
            if (s.price <= price){
                shoes = s;
                break;
            }
        }

        if (shoes != null){
            System.out.println("Sepatu ditemukan:");
            shoes.displayInfo();
        } else{
            System.out.println("Sepatu tidak ditemukan");
        }
    }
}