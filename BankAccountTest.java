/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.ex2;

/**
 *
 * @author alsul
 */
public class BankAccountTest {
    public static void main(String[] args){
        BankAccount jack = new BankAccount("jack",1200.2);
        System.out.println("beginning balance "+jack.getBalance());
        jack.deposit(10002);
        System.out.println("balance after deposit "+jack.getBalance());
        jack.withdraw(2000);
        System.out.println("balance after withdraw "+jack.getBalance());
        System.out.println(jack.toString());
        
        System.out.println("-----------------------");
        
        BankAccount khalil = new BankAccount("khalil",120000.2);
        System.out.println("beginning balance "+khalil.getBalance());
        khalil.deposit(1002);
        System.out.println("balance after deposit "+khalil.getBalance());
        khalil.withdraw(2000);
        System.out.println("balance after withdraw "+khalil.getBalance());
        System.out.println(khalil.toString());
        
        
        
        
    }
    
}
