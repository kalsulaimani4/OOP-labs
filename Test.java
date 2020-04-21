/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author alsul
 */
public class Test {
    
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the term ");
        int term= scan.nextInt();
        Statistics.cube(term);
        double avg=Statistics.avrage(9, 5, 7, 10);
        Statistics.maximum(7,5,10);
        System.out.println("the avrage is = "+avg);
    }
    
}

