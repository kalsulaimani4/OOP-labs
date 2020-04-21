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
public class SavingAccount {
    static int annualIntrestRate;
    private double savingBalance;
    
    
//    SavingAccount(double bal){
//        this.savingBalance=bal;
//    }
    
    public static void modInterstRate(int rate ){
         annualIntrestRate=rate;
    }
    
    public void setSavingBalance(double savingBalance){
        this.savingBalance= savingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    
    static int getInterstRate(){
        return annualIntrestRate;
    }
    
    public void calculateMonthleyInterst(){
        double interest=((annualIntrestRate*savingBalance)/100)/12;
        System.out.printf("the new balance is %.2f %n",this.savingBalance+=interest);
       
        
    }
    
    
}
