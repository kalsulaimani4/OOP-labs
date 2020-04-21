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
public class Date {
    private int day;
    private int month;
    private int year;
    
    
    Date(){
        this.day=0;
        this.month=0;
        this.year=0;
    }
    Date(int day,int month,int year){
       this.day=day;
       this.month= month;
       this.year= year;
    }
    
    // setters 
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month= month;
    }
    public void setYear(int year){
        this.year= year;
    }
    
    // getters 
    public int getYear(){
        return year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public void displayDate(){
        System.out.printf("Date: %d/%d/%d %n",getMonth(),getDay(),getYear());
    }
}
