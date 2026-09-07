/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN;

/**
 *
 * @author 218to
 */
public class bai2 {
     public static void main(String[] args) {
        String first = "Duy Tan";
        String second = "University";

        String usingPlus = first + " " + second;
        System.out.println("Using +: " + usingPlus);

        String usingConcat = first.concat(" ").concat(second);
        System.out.println("Using concat: " + usingConcat);

        first.concat(" Changed");
        System.out.println("first after concat without reassignment: " + first);
    }
}
