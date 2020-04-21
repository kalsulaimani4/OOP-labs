/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author alsul
 */
public class Statistics {
    
     public static void  cube(int a){
        int num= a ;
        int result=0;
        for(int i=1;i<=num;i++){
            result= (int)Math.pow(i, 3);               
        }
        for(int i=1;i<=num;i++){
        System.out.printf("number is : %d and the cube of %d is : %d %n",i,i,result);
        }
     }
     
     public static void maximum(int a,int b,int c){
         if(a>b && a>c){
             System.out.println("maxumium is "+a);
         }else if(b>a && b>c){
             System.out.println("maxumium is "+b);
         }else{
             System.out.println("maxumium is "+c);
         }
     }
     
     static double avrage(int a, int b, int c,int d){
         double avg=(a+b+c+d)/4.0;
         return avg;
     }
}
