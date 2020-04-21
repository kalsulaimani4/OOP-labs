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
public class BankAccount {
    private double beginBalance,balance;
    private String owner;
    
    public BankAccount(String n, double begin){
        this.beginBalance=begin;
        this.balance=beginBalance;
        this.owner=n;
    }
    
    public BankAccount(String n){
        this.owner=n;
        this.beginBalance=0;
        this.balance=0;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        balance = beginBalance+ amount;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    @Override
    public String toString(){
       String statment = "owner is  "+ owner+" with balance "+balance;
       return statment;
    }
    
    //hello 
    
}
