/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author alsul
 */
public class InvoiceTest {
    public static void main(String[] args){
        
        // cretaing a instance 
        Invoice invoiceOne = new Invoice();
        // creatig an instance 
        invoiceOne.setPartDiscirbtion("keyboard");
        invoiceOne.setNumSold(5);
        invoiceOne.setPartNumber("A1223MDEK31");
        invoiceOne.setpricePerItem(90);
        // getting the values and outputting them
        System.out.println("the invoice value is = "+invoiceOne.getInvoiceValue());
        System.out.println("the number of  itemes sold = "+invoiceOne.getNumSold());
        System.out.println("price per item = "+invoiceOne.getPricePerItem());
        System.out.println("part discription  : "+invoiceOne.getPartDiscription());
        System.out.println("part number = "+invoiceOne.getPartNumber());
        
    }
}
