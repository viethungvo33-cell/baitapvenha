/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_voviethung_9735_22.car;
/**
 *
 * @author 218to
 */
public class car {
       private String make;
    private String model;
    private int year;

    public void addProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayProfile() {
        System.out.println(year + " " + make + " " + model);
    }    
    
}
