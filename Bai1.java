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
public class Bai1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String line = sc.nextLine();

        String trimmed = line.trim();
        String upper = line.toUpperCase();
        String lower = line.toLowerCase();

        System.out.println("Original: [" + line + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Upper:   " + upper);
        System.out.println("Lower:   " + lower);
        System.out.println("Original length = " + line.length());
        System.out.println("Length after trim = " + trimmed.length());

        sc.close();
    }
}
