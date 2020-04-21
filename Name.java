/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.ex1;

/**
 *
 * @author alsul
 */
public class Name {
    private String first;
    private String middle;
    private String last;
    
    // constriuctors 
    public Name(String f,String m, String lt){
        this.first=f;
        this.middle=m;
        this.last=lt;
    }
    
    public Name(String wholeName){
        String [] name = wholeName.split(" ",3);
        this.first=name[0];
        this.middle=name[1];
        this.last=name[2];        
       
    }
    
    // methods
    
    public String intilas(){
        String f=first.substring(0,1);
        String m=middle.substring(0,1);
        String l=last.substring(0,1);
        return f+m+l;
    }
    
    @Override
    public String toString(){
        char m=middle.charAt(0);
        return first+" "+m+" "+last;
    }
    
    public String toFullString(){
        return first+" "+middle+" "+last;
    }
    
    public String toLastString(){
        return last+","+first;
    }
    
    public String toUpperCase(){
        return first.toUpperCase()+" "+middle.toUpperCase()+" "+last.toUpperCase();
    }
    
    
    
}
