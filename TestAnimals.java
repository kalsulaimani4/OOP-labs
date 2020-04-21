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
public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        
        d.Eat();
        c.Eat();
        a.Eat();
        e.Eat();
        p.setName("toka");
        System.out.println(p.getName()); 
        d.Walk();
        c.Walk();
        a.Walk();
        e.Walk();
        p.play();
        
    }
    
}
