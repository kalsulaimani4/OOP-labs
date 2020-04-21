/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author alsul
 */
public abstract class  Animal {
    protected int legs;
    
    
    
    
    protected Animal(int legs){
        this.legs= legs;
    }
    
    
    abstract void Eat();
    
    public void Walk(){
         switch (legs) {
            case 2:
                System.out.println("animal walks on "+legs+" legs");
                break;
            case 4:
                System.out.println("animal walks  "+legs+" legs");
                break;
            case 8:
                System.out.println("animal crawls on  "+legs+" legs");
            default:
                System.out.println("animal has no legs so it SWIMS  ");
                break;
        }
    }
    
    
}

    

