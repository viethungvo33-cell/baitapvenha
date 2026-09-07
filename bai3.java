/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN;
import java.util.Scanner;
/**
 *
 * @author 218to
 */
public class bai3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID, for example SE123456: ");
        String id = sc.nextLine();

        String majorCode = id.substring(0, 2);
        String numericPart = id.substring(2);

        System.out.println("Major code = " + majorCode);
        System.out.println("Numeric part = " + numericPart);

        sc.close();
    }
}
