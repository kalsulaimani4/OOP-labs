/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author alsul
 */
public class SavingAccountTest {
    public static void main(String[] args){
        SavingAccount saver1= new SavingAccount();
        SavingAccount saver2= new SavingAccount();
        //SavingAccount.annualIntrestRate=5;// static variable dosnt need a method to be changaed 
        SavingAccount.modInterstRate(4);
        System.out.println("saver 1 :");
        saver1.setSavingBalance(2000);
        System.out.println("previus balance "+saver1.getSavingBalance());
        System.out.println("the interst rate  "+SavingAccount.getInterstRate());
        saver1.calculateMonthleyInterst();
        System.out.println("saver 2 :");
        saver2.setSavingBalance(3000);
        System.out.println("previus balance "+saver2.getSavingBalance());
        System.out.println("the interst rate  "+SavingAccount.getInterstRate());
        saver2.calculateMonthleyInterst();
    }
    
}
