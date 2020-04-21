/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author alsul
 */
public class Pair<T,N> {
    public T NameAL;
    public N NumberAL;
    
    public Pair(T name ,N year ){
        this.NameAL=name;
        this.NumberAL=year;
    }
    
    public void setNameAl(T name){
        this.NameAL=name;
    }
    
    public void setYearAl(N year){
        this.NumberAL=year;
    }
    
    public T getName(){
        return NameAL;
    }
    public N getYear(){
        return NumberAL;
    }
    
    
    
    }
    

