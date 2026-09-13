/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_voviethung_9735_22.bank;
import java.util.Scanner;
/**
 *
 * @author 218to
 */
public class processor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BankAccount account = new BankAccount();
            
            System.out.print("Nhập số tài khoản: ");
            String accNumber = scanner.nextLine();
            System.out.print("Nhập tên chủ tài khoản: ");
            String owner = scanner.nextLine();
            System.out.print("Nhập số dư ban đầu: ");
            int balance = scanner.nextInt();
            
            account.addInfo(accNumber, owner, balance);
            account.display();
            
            System.out.print("\nNhập số tiền muốn nạp: ");
            int depositAmount = scanner.nextInt();
            account.deposit(depositAmount);
            System.out.println("Sau khi nạp tiền:");
            account.display();
            
            System.out.print("\nNhập số tiền muốn rút: ");
            int withdrawAmount = scanner.nextInt();
            boolean success = account.withdraw(withdrawAmount);
            if (success) {
                System.out.println("Rút tiền thành công!");
            } else {
                System.out.println("Rút tiền thất bại! Số dư không đủ.");
            }
            account.display();
        }
    }
}
