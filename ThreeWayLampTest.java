/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author alsul
 */
public class ThreeWayLampTest {
    public static void main(String[] args){
        ThreeWayLamp test = new ThreeWayLamp();
        Scanner scan = new Scanner(System.in);
        System.out.println("inintal state : "+test.getLampStatus());
        System.out.println("enter the number of turns ");
        test.switchLamState(scan.nextInt());
        System.out.println("the lamp state after  "+test.getLampStatus());
        
    }
    
}
