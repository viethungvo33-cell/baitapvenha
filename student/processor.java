/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_voviethung_9735_22.student;
import java.util.Scanner;
/**
 *
 * @author 218to
 */
public class processor {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nhập mã số sinh viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        student.addInfo(id, name);

        System.out.print("Nhập số lượng điểm: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm thứ " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            student.addGrade(grade);
        }

        student.display();

        scanner.close();
    }
}
