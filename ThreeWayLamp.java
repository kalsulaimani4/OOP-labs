/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author alsul
 */
public class ThreeWayLamp {
    private String lampStatus;
    
    ThreeWayLamp(){
      this.lampStatus="off";  
        
    }
    
    public String getLampStatus(){
        return lampStatus;
    }
    
    public  void changeLampState(){
        
        if(lampStatus.equalsIgnoreCase("off")){
           lampStatus="low";
        }else if(lampStatus.equalsIgnoreCase("low")){
         lampStatus="meduim";   
        }else if(lampStatus.equalsIgnoreCase("meduim")){
            lampStatus="high"; 
        }else if(lampStatus.equalsIgnoreCase("high")){
           lampStatus="off"; 
        }
        
        
    }
    
    public void switchLamState(int numSwitch){
        
        if(numSwitch>0){
            for(int i=1;i<=numSwitch;i++){
            this.changeLampState();
            System.out.println("state at "+i+" is "+this.lampStatus);
            }
        }else{
            System.out.println("in valid answer ");
        }
    }
    
    
    
}
