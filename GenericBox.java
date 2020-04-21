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
public class GenericBox <E>{
    public E content;
    
    public GenericBox(E content ){
        this.content=content;
    }
    
    public void setConent(E content ){
        this.content= content;
    }
    
    public E getContent(){
        return content;
    }
    
   
    @Override
    public String toString(){
        return content+" ("+content.getClass()+" )";
    }
    
}
