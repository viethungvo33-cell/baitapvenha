/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_voviethung_9735_22.car;
import java.util.Scanner;

public class processor {
public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        CarProfile car = new CarProfile();
        car.addProfile("Toyota", "Camry", 2023);
        car.displayProfile();
 
        CarProfile car2 = new CarProfile();
        car2.addProfile("Honda", "Civic", 2022);
        car2.displayProfile();
    }
}
