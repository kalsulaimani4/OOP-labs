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
public class Cube {
    public static int cube(int a){
        int num= a ;
        int result=0;
        for(int i=1;i<=num;i++){
            result= (int)Math.pow(i, 3);               
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter terms : ");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++){
        System.out.printf("number is : %d and the cube of %d is : %d %n",i,i,cube(i));
       }
    }
}