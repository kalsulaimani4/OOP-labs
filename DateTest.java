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
public class DateTest {
    public static void main(String[] args){
        Date today= new Date(15,12,2000);
        today.setDay(12);
        today.setMonth(1);
        today.setYear(2001);
        today.displayDate();
        Date today2= new Date();
        
        today2.displayDate();
    }
}
