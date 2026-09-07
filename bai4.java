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
public class bai4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        boolean starts = fileName.startsWith("report");
        boolean ends = fileName.endsWith(".pdf");
        char firstChar = fileName.charAt(0);
        char lastChar = fileName.charAt(fileName.length() - 1);

        System.out.println("Starts with report: " + starts);
        System.out.println("Ends with .pdf: " + ends);
        System.out.println("First character = " + firstChar);
        System.out.println("Last character = " + lastChar);

        sc.close();
    }
}
