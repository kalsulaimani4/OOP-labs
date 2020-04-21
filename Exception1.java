/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author alsul
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int num = 0;
        
        do {
            try{
            System.out.println("Enter a number between 1 and 10");
            num = scan.nextInt();
            if (num < 1 || num > 10)
                System.out.println("\nIllegal value, " + num + " entered. Please try again.");
            }catch (InputMismatchException ime) {
            System.out.println("Enter whole numbers only, with no spaces or other characters");
        scan.next(); // clear the scanner buffer
        
        }
        } while (num < 1 || num > 10);
        
    
       System.out.println("\nValue correctly entered! Thank you."); 
    }
    
}
    
    
    
